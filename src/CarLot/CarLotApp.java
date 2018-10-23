package CarLot;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class CarLotApp {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		//add
		String userAction;
		String userCarAge;
		String userMake;
		String userModel;
		int userYear;
		double userPrice;
		double userMiles;
		
		//remove
		int removeNum;
		
		//replace
		int replaceNum;
		
		//validate
		boolean loop = true;
		
		//loop app
		String userContinue = "yes";
		
		//initial list of Car/UsedCar objects
		Car car1 = new Car("Ford", "Focus", 2018, 28000.00);
		Car car2 = new Car("Chevy", "Cruise", 2018, 30000.00);
		Car car3 = new Car("Ford", "F150", 2018, 40000.00);
		Car car4 = new UsedCar("Pontiac", "Grand Prix", 2004, 1200.00, 150000);
		Car car5 = new UsedCar("Honda", "CRV", 2006, 1500.00, 180000);
		Car car6 = new UsedCar("Chevy", "Trail Blazer", 2009, 3000.00, 115000);
		//add cars to array to loop into list
		Car[] carArray = {car1, car2, car3, car4, car5, car6};
		List<Car> listOfCars = new ArrayList<Car>();
		for (int i = 0; i < carArray.length; ++i) {
			listOfCars.add(carArray[i]);
		}
		
		//title
		System.out.println("Welcome to Jake\'s Car Directory!\n================================");
		
		//loop app
		while (userContinue.equals("yes")) {
			loop = true;
			
			//validation
			while (loop == true) {
				//user options *(add lower case option)*
				System.out.println("Enter one of the following options:");
				System.out.println("List all cars(List)       Add a Car(Add)\nRemove a car(Remove)      Replace a car(Replace)");
				userAction = scnr.next();
				
				//List
				if (userAction.equals("List")) {
					int i = 1;
					for(Car car: listOfCars) {
						System.out.println(i + ". " + car);
						++i;
						loop = false;
					}
				}
				//Add
				else if (userAction.equals("Add")) {
					System.out.println("Is this car new or used?");
					userCarAge = scnr.next();
					System.out.println("What make is this car?");
					userMake = scnr.next();
					System.out.println("What model is this car?");
					userModel = scnr.next();
					System.out.println("What year is this car?");
					userYear = scnr.nextInt();
					System.out.println("How much is this car worth?");
					userPrice = scnr.nextDouble();
					if (userCarAge.equals("used")) {
						System.out.println("How many miles are on this car?");
						userMiles = scnr.nextDouble();
						UsedCar userCar = new UsedCar( userMake, userModel, userYear, userPrice, userMiles);
						listOfCars.add(userCar);
					}
					else if (userCarAge.equals("new")) {
						Car userCar = new Car (userMake, userModel, userYear, userPrice);
						listOfCars.add(userCar);
					}
					System.out.println("Your car has been added!");
					loop = false;
				}
				//Remove
				else if(userAction.equals("Remove")) {
					System.out.println("What is the number on the list of cars of the car you want to remove?");
					removeNum = scnr.nextInt();
					removeNum = removeNum - 1;
					listOfCars.remove(removeNum);
					System.out.println("Car has been removed.");
					loop = false;
				}
				//replace
				else if(userAction.equals("Replace")) {
					System.out.println("What is the number on the list of cars of the car you want to replace?");
					replaceNum = scnr.nextInt();
					replaceNum = replaceNum - 1;
					System.out.println("Is the car you want to add new or used?");
					userCarAge = scnr.next();
					System.out.println("What make is this car?");
					userMake = scnr.next();
					System.out.println("What model is this car?");
					userModel = scnr.next();
					System.out.println("What year is this car?");
					userYear = scnr.nextInt();
					System.out.println("How much is this car worth?");
					userPrice = scnr.nextDouble();
					if (userCarAge.equals("used")) {
						System.out.println("How many miles are on this car?");
						userMiles = scnr.nextDouble();
						UsedCar userCar = new UsedCar( userMake, userModel, userYear, userPrice, userMiles);
						listOfCars.set(replaceNum, userCar);
					}
					else if (userCarAge.equals("new")) {
						Car userCar = new Car (userMake, userModel, userYear, userPrice);
						listOfCars.add(userCar);
					listOfCars.set(replaceNum, userCar);
					}
					loop = false;
				}
			}
			//loop	
			System.out.println("Would you like to continue?(yes/no)");
			userContinue = scnr.next();
		}
	}

}
