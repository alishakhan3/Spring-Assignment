package com.springcore.question2;

public class Drawing {

	private String color, shape;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	@Override
	public String toString() {
		return "Drawing [color=" + color + ", shape=" + shape + "]";
	}
	
}
