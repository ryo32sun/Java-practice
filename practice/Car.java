package practice;

public class Car {
	private double fuelCost;
	private double fuelAmount;

	public Car(double fuelCost, double fuelAmount) {
		this.fuelCost = fuelCost;
		this.fuelAmount = fuelAmount;
	}

	public double getFuelAmount() {
		return this.fuelAmount;
	}

	public void move(int distance){
		System.out.println(distance + "km走ります");
		this.fuelAmount -= distance / fuelCost;
	}

}
