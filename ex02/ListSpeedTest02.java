package day01.ex02;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListSpeedTest02 {
	// ArrayList VS LinkedList
	// 자료를 순차적으로 저장할 때는 ArrayList가 빠름
	
	// LinkedList는 주소정보를 갖기 때문에 순차적 저장에서는
	// ArrayList보다 속도가 떨어짐
	public static void main(String[] args) {
//		System.currentTimeMillis()는 현재시각과 1970년 1월 1일 오전0시와의
//		차이를 1000분의 1초로 계산해서 long값으로 리턴
		
		long startTime=System.currentTimeMillis();
//		1663745478186
//		1663745578718
//		System.out.println(startTime);
		
		ArrayList aList = new ArrayList();
		for(int i =0; i<10000000; i++) {
			aList.add(i);
		}
		long endTime=System.currentTimeMillis();
		long diffTime = endTime - startTime;
		
//		System.out.println(diffTime);
		System.out.println("second : " + diffTime/1000 + "초");
		
		startTime=System.currentTimeMillis();
		LinkedList lkList = new LinkedList();
		for(int i =0; i<10000000; i++) {
			lkList.add(i);
		}
		endTime=System.currentTimeMillis();
		diffTime = endTime - startTime;
//		System.out.println(diffTime);
		System.out.println("second : " + diffTime/1000 + "초");
	}
}
