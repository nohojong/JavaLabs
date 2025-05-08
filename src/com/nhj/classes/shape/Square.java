package com.nhj.classes.shape;

public class Square implements Shape {
	private Point[] vertice= new Point[Shape.SQUARE_VER_NUM];
	
	public Square(Point[] point) {
		this.vertice=point;
	}


	@Override
	public double calculateArea() {
		double width =Math.abs(vertice[1].getX()-vertice[0].getX());
		double height = Math.abs(vertice[0].getY()-vertice[3].getY()); 
		double ret= width*height;
		return ret;
	}

	@Override
	public Point[] getVertices() {
		// TODO Auto-generated method stub
		return vertice;
	}

	@Override
	public void printName() {
		System.out.println("사각형");
		// TODO Auto-generated method stub
		
	}
	 
}