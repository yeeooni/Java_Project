package com.kitri.array;

public class Car {

	private String carName;
	private String maker;
	private String color;

	public Car(String carName, String maker, String color) {
		super();
		this.carName = carName;
		this.maker = maker;
		this.color = color;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	@Override
	public String toString() {
		return "Car [carName=" + carName + ", color=" + color + ", maker=" + maker + "]";
	}

	
}
