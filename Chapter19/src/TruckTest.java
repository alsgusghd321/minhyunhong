
public class TruckTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String gear;
		Truck t1 = new Truck("�ҳ���", 50, true);
		{
			if (t1.Gear == true) {
				gear = "�ڵ�";
			} else
				gear = "����";
		}
		System.out.println("ȭ���� " + t1.getFreight() + " �ӵ��� " + t1.Speed + " ���� " + gear);

	}
}    