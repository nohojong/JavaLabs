package com.nhj.classes;

import java.awt.Point;
import java.awt.Polygon;

public class PolygonExample extends Polygon{
	
	public PolygonExample() {}
	
	private int[] ordinates = new int[5];
	
	// 파라미터의 아규먼트로 배열을 전달받음.
	// 이 배열의 엘리먼트의 데이터 타입은 정수
	public void setPoint(int[] ordinates) {
		for (int i=0; i<this.ordinates.length; i++) {
			this.ordinates[i] = ordinates[i];
		}
	}
	public Polygon polygonFrom(int i,Point... corners) {
		
		for (Point point : corners) {
			System.out.println(point);
			this.addPoint(point.x, point.y);
		}
		return this;
	}
	// (Point[] corners)와 (Point... corners)는
	// 동일한 코드임
	
	
	// 파라미터의 아규먼트로 배열을 처음으로 전달해 봤다.
	// 이 배열의 엘리먼트의 데이터 타입은 Point 클래스 객체의 인스턴스에 대한
	// 참조 값
	public Polygon polygonFrom(Point[] corners) {
	    		
		for (Point point : corners) {
			System.out.println(point);
			this.addPoint(point.x, point.y);
		}
		
		return this;
	}

}