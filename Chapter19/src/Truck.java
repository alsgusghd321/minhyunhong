public class Truck extends Vehicle {
	String freight;

	Truck(String freight, int Speed, boolean Gear) {
		this.freight = freight;
		this.Speed = Speed;
		this.Gear = Gear;
	}

	public String getFreight() {
		return freight;
	}

	public void setFreight(String freight) {
		this.freight = freight;
	}
}