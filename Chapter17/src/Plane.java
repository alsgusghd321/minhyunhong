public class Plane {
	private String producer;
	private String Model;
	private int MaximumPassenger;
	static int planes;
	
	void Plane(String producer, String Model, int MaximumPassenger,int planes) {
	
	}
	
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public int getMaximumPassenger() {
		return MaximumPassenger;
	}
	public void setMaximumPassenger(int maximumPassenger) {
		MaximumPassenger = maximumPassenger;
	}
	public static int getPlanes() {
		return planes;
	}
	public static void setPlanes(int planes) {
		Plane.planes = planes;
	}
}
	