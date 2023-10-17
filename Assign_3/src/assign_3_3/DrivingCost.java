package assign_3_3;

import java.util.Scanner;

public class DrivingCost {
	private double totMiles;
	private double gasolineCost;
	private double avgMilesPerGallon;
	private double parkingCost;
	private double tollFee;
	private double totCost;
	private double gasoUsed;
	private double costOfFuel;
	
	public double getTotMiles() {
		return totMiles;
	}
	public void setTotMiles(double totMiles) {
		this.totMiles = totMiles;
	}
	public double getGasolineCost() {
		return gasolineCost;
	}
	public void setGasolineCost(double gasolineCost) {
		this.gasolineCost = gasolineCost;
	}
	public double getAvgMilesPerGallon() {
		return avgMilesPerGallon;
	}
	public void setAvgMilesPerGallon(double avgMilesPerGallon) {
		this.avgMilesPerGallon = avgMilesPerGallon;
	}
	
	public void acceptData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Total Miles : ");
		this.totMiles=sc.nextDouble();
		System.out.println("Enter Gasoline cost : ");
		this.gasolineCost=sc.nextDouble();
		System.out.println("Enter Average Miles per gallon : ");
		this.avgMilesPerGallon=sc.nextDouble();
		System.out.println("Enter Parking cost : ");
		this.parkingCost=sc.nextDouble();
		System.out.println("Enter Toll fee : ");
		this.tollFee=sc.nextDouble();
	}
	public void fuelCost() {
		gasoUsed=this.totMiles/this.avgMilesPerGallon;
		costOfFuel=gasoUsed*this.gasolineCost;
		totCost=costOfFuel+this.parkingCost+this.tollFee;
	}
	public void displayCost() {
		System.out.println("Total cost per day : "+this.totCost);
	}

}
