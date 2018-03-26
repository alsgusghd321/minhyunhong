
public class PlaneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plane p1 = new Plane();
		p1.planes++;
		p1.setModel("A380");
		System.out.println(p1.getModel());
		Plane p2 = new Plane();
		p2.setModel("A370");
		System.out.println(p2.getModel());
		p2.planes++;
		
		System.out.println(p1.getPlanes());
		
	}

}
