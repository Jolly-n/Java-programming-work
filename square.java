package com.tria;

public class square {


private double side;


public square(double side) {
	
	this.side = side;
}
public double getSide() {
	return side;
}

public void setSide(double side) {
	this.side = side;
}
public double calculateSquareArea(){
	return this.side * this.side;
}
public double calculateSquarePerimeter(){
	return this.side * 4;
}

}

