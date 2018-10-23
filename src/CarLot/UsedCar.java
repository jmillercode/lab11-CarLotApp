package CarLot;

public class UsedCar extends Car{
	
	private double miles;

	
	public UsedCar() {}
	
	public UsedCar(String make, String model, int year, double price, double miles) {
		super(make, model, year, price);
		this.miles = miles;
	}

	public double getMiles() {
		return miles;
	}

	public void setMiles(int miles) {
		this.miles = miles;
	}
	@Override
	public String toString() {
		return "{USED} Make:" + getMake() + " | " + " Model:" + getModel() + " | " + " Year:" + getYear() + " | " + " Price:$" + getPrice() + " | " + " Miles:" + miles;
	}

}
