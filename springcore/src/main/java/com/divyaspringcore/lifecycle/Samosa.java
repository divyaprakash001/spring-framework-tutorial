package com.divyaspringcore.lifecycle;

public class Samosa {
	private double price;

	public Samosa() {
		super();
	}

	public double getPrice() {
		System.out.println("Samosa.getPrice()");
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Samosa.setPrice()");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}

	public void init() {
		System.out.println("inside init method");
	}

	public void destroy() {
		System.out.println("inside destroy method");
	}

}
