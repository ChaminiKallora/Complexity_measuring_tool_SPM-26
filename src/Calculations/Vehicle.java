/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculations;

/**
 *
 * @author chami
 */
public class Vehicle {
	public Vehicle()
	   {
		System.out.println("Class Vehicle");
	   }
	   public void vehicleType()
	   {
		System.out.println("Vehicle Type: Car");
	   }
}
class Car extends Vehicle{
	public Car()
	   {
		System.out.println("Class Car");
	   }
	   public void vehicleType()
	   {
		System.out.println("Vehicle Type: Car");
	   }
}
class Maruti extends Car{
   public Maruti()
   {
	System.out.println("Class Maruti");
   }
   public void brand()
   {
	System.out.println("Brand: Maruti");
   }
   public void speed()
   {
	System.out.println("Max: 90Kmph");
   }
}
class Maruti800 extends Maruti{
	   public Maruti800(){
		System.out.println("Maruti Model: 800");
	   }
	   public void speed(){
		System.out.println("Max: 80Kmph");}

		//Main method
	   public static void main(String args[]){
		 Maruti800 obj=new Maruti800();
		 obj.vehicleType();
		 obj.brand();
		 obj.speed();
	   }
	}
