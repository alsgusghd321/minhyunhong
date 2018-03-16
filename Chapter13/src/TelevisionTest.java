
public class TelevisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television myTv = new Television();
		myTv.channel = 10;
		myTv.volume = 5;
		myTv.onOff = true;
		// myTv.print();

		int ch = myTv.getChannel();
		System.out.println("현재 채널은" + ch + "입니다.");

	} 

}
