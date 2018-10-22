package CarLot;

public class UsedCar extends Car{
	
	private int miles;

	
	public UsedCar() {}
	
	public UsedCar(String make, String model, int year, double price, int miles) {
		super(make, model, year, price);
		this.miles = miles;
	}

	public int getMiles() {
		return miles;
	}

	public void setMiles(int miles) {
		this.miles = miles;
	}
	@Override
	public String toString() {
		return "{USED} Make:" + getMake() + " Model:" + getModel() + " Year:" + getYear() + " Price:$" + getPrice() + " Miles:" + miles;
	}

}
