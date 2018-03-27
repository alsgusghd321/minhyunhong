
public class TruckTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String gear;
		Truck t1 = new Truck("소나무", 50, true);
		{
			if (t1.Gear == true) {
				gear = "자동";
			} else
				gear = "수동";
		}
		System.out.println("화물은 " + t1.getFreight() + " 속도는 " + t1.Speed + " 기어는 " + gear);

	}
}    