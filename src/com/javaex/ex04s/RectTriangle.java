package com.javaex.ex04s;

public class RectTriangle extends Shape{ // 추상클래스로 선언만 되어있기에 '나를 받을거면 너가 만들어'라는 뜻이다.
	
	// 필드
	private double width;
	private double height;
	
	// 생성자
	public RectTriangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double getArea() {
		return width * height *1/2;
	}
	
	@Override
	public double getPerimeter() {
		return width +  height + Math.sqrt(width*width + height*height); // 피타고라스의 정리
	}

}
