package com.nhj.classes.shape;

public class ShapeMain {
	
	
	public static Shape makeTriangle() {
		Point[] vertices = new Point[3];
		vertices[0] = new Point(5, 10); // new 연산자는 내부적으로 VM에게 해당 클래스 인스턴스를
										// 생성해달라고 요청!!
										// VM 이 인스턴스의 참조 값을 리턴합니다
										// : new Point(5, 10)  expression 값으로..		
		vertices[1] = new Point(2, 2);  	
		vertices[2] = new Point(7, 2);	
		Shape triangle = new Triangle(vertices);
		return triangle;
	}
	
	public static Shape makeSquare() {
		Point [] vertice1= new Point[4];
		vertice1[0] = new Point(1,2);
		vertice1[1] = new Point(3,4);
		vertice1[2] = new Point(5,6);
		vertice1[3] = new Point(7,8);
		
		Shape square = new Square(vertice1);
		return square;
	}

	public static void main(String[] args) {

		Shape triangle = makeTriangle();
		double triangleArea = triangle.calculateArea();
		Point[] triangleVertices = triangle.getVertices();
		triangle.printName();
		
	
		
		Shape square = makeSquare();
		double squareArea = square.calculateArea();
		Point[] squareVertices= square.getVertices();		
		square.printName();
		
	}
	

}