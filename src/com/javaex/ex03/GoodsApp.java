package com.javaex.ex03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {
    	// 리스트 선언
    	List<Goods>goodList = new ArrayList<>();
    	Scanner scanner = new Scanner(System.in);
    	int countOfGoods = 0; // 입력 개수 변수
    	System.out.println("상품을 입력해 주세요.(종료 q)");
    	
    	while (true) {
    	// 스캐너로 부터 상품정보 입력
    	String line = scanner.nextLine();
    	// q 면 종료, 
    	if(line.equals("q")) {
    		System.out.println("[입력 완료]");
    		System.out.println("=============================");
    		break;
    	}
    	// 상품명(String), 가격(int), 개수(int)
    	// 아니면 콤마 기준으로 분할하여 Goods 객체 생성
    	String [] data = line.split(",");
    	String name = data[0].trim(); // 공백 제거 상품명
    	int price = Integer.parseInt(data[1].trim());
    	int count = Integer.parseInt(data[2].trim());
    	
    	// Goods 객체 생성
    	Goods goods = new Goods(name, price, count);
    			
    	// 리스트에 저장
    	goodList.add(goods);
    	}
    	
		// 결과 출력 (상품 리스트 전부 출력, 상품의 개수를 집계하여 출력)
    	// 상품 리스트
    	Iterator<Goods> it = goodsList.iterator();
    	while(it.hasNext()) {
    		Goods itemGoods = it.next();
    		countOfGoods += item.getCount();
    		item.showInfo();
    	}
    	System.out.println("모든 상품의 개수는" + countOfGoods
    			+ "입니다.");
    	
    	scanner.close();

       
    }

}
