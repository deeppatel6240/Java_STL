package com.phoenix.vehicles;

/*
 * Creator Name: deepkumar.sherathiya@stltech.in
 * Version: 1.0
 * Date: 12/07/2021
 * Copyright: Sterlite Technologies Ltd.
 */

public class Car {

	private int id;
	private String model;
	private float price;

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public Car(int id, String model, float price) {
		super();
		this.id = id;
		this.model = model;
		this.price = price;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", price=" + price + "]";
	}

	// overriding equals method of object class
	public boolean equals(Object ob) {

		if (ob instanceof Car) {
			Car car = (Car) ob;

			if (this.id == car.id && this.model.equals(car.model) && this.price == car.price)
				return true;
			else
				return false;
		} else {
			return false;
		}

	}
	
	// overriding hash code method of object class
	public int hashCode() {
		return id + model.hashCode() + (int) price;
 	}

} // end of the class
