package day01.ex02;

import java.util.LinkedList;

// 자신의 앞에 존재하는 자료의 주소와 뒤의 자료주소 정보를 갖고 배열로 데이터
// 저장됨(자료의 삽입, 삭제가 처리가 많은 경우에 유리한 자료구조)
public class LinkedList01 {
	public static void main(String[] args) {
		LinkedList<String> lkList = new LinkedList<String>();
		
		lkList.add("하이");
		lkList.add("굿모닝");
		lkList.add("굿나이트");
		lkList.add("굿이브닝");
		
//		System.out.println(lkList.toString());
		System.out.println(lkList);
		
		lkList.add(2, "Hello World");
		System.out.println(lkList);
		
		lkList.remove(1);
		System.out.println(lkList);
	}
}
