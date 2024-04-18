package com.javaex.ex04s;

import java.util.ArrayList;
import java.util.List;

public class ShapeApp {

	public static void main(String[] args) {
		List<Shape> lst = new  ArrayList<Shape>();
		
		Shape r = new Rectangle(5,6);
		Shape t = new RectTriangle(6,2);
		lst.add(r);
		lst.add(t);
		
		for (int i = 0; i<lst.size(); i++) {
			
			System.out.println("area: " + lst.get(i).getArea());
			System.out.println("perimeter: " + lst.get(i).getPerimeter());
			
			if(lst.get(i) instanceof Resizeable ) {
				((Resizeable)lst.get(i)).resize(0.5);
				
				System.out.println("new area: " + lst.get(i).getArea());
				System.out.println("new perimeter: " + lst.get(i).getPerimeter());
			}
		}

	}

}
