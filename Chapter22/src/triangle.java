
public class triangle extends Shape {
	private int BaseLength;
	private int height;

	

	public int getBaseLength() {
		return BaseLength;
	}

	public void setBaseLength(int baseLength) {
		BaseLength = baseLength;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	double area() {
		return (double) (BaseLength * height)/2;
	}

	void draw() {
		System.out.println("(" + this.getX() + "," + this.getY() + ") À§Ä¡¿¡" + " ¹Øº¯: " + BaseLength + "¼¼·Î:" + height + "³ÐÀÌ´Â"+area());
	}
}
