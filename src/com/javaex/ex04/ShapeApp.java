package com.javaex.ex04;

import java.util.ArrayList;
import java.util.List;

public class ShapeApp {

    public static void main(String[] args) {
        List<Shape> sList = new ArrayList<Shape>(); 
        
        Shape r= new Rectangle( 5, 6 );
        Shape t= new RectTriangle( 6, 2 );
        sList.add(r);
        sList.add(t);
        
        
        for( int i=0; i<sList.size(); i++ ) {
            
            System.out.println( "area: " + sList.get(i).getArea() );
            System.out.println( "perimeter: " + sList.get(i).getPerimeter() );
            
            if( sList.get(i) instanceof Resizeable ) {
                ((Resizeable)sList.get(i)).resize( 0.5 ); 
                // resize는 Resizeable로 바꿔줘야 사용가능하다 Shape에 선언된것이 아니기에.
                
                System.out.println( "new area: " + sList.get(i).getArea() );
                System.out.println( "new perimeter: " + sList.get(i).getPerimeter() );
            }
        }
        
    }
}
