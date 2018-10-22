package CarLot;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class CarLotApp {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String userAction;
		
		List<Car> cars = new ArrayList<Car>();
		Car car1 = new Car("Ford", "Focus", 2018, 28000.00);
		Car car2 = new Car("Chevy", "Cruise", 2018, 30000.00);
		Car car3 = new Car("Ford", "F150", 2018, 40000.00);
		Car car4 = new UsedCar("Pontiac", "Grand Prix", 2004, 1200.00, 150000);
		Car car5 = new UsedCar("Honda", "CRV", 2006, 1500.00, 180000);
		Car car6 = new UsedCar("Chevy", "Trail Blazer", 2009, 3000.00, 115000);
		Car[] carArray = {car1, car2, car3, car4, car5, car6};
		List<Car> listOfCars = new ArrayList<Car>();
		for (int i = 0; i < carArray.length; ++i) {
			listOfCars.add(carArray[i]);
		}
		
		System.out.println("Welcome to Jake\'s Car Directory!\n");
		System.out.println("Enter one of the following options:");
		System.out.println("  List all cars(List)       Add a Car(Add)\n  Remove a car(Remove)      Replace a car(Replace)");
		userAction = scnr.next();
		
		if (userAction.equals("List")) {
			System.out.println(listOfCars);
		}
		

	}

}
