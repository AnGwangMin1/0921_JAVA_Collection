package day01.ex02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class Set04 {
	// 중복자료 허용 X
	// 순서 유지 X
	// HashSet 주로 사용
	// List, Map에 비해 사용하는 경우가 드물다
	public static void main(String[] args) {
		HashSet hashSet = new HashSet();
		
		hashSet.add(1);
		hashSet.add(2);
		hashSet.add(1);
		
		System.out.println(hashSet);
		System.out.println(hashSet.size());
		
		ArrayList aList = new ArrayList();
		aList.add(1);
		aList.add(2);
		aList.add(1);
		
		System.out.println(aList);
		
		Set<Integer> setInt = new HashSet<Integer>();
		setInt.add(1);
		setInt.add(2);
		setInt.add(3);
		setInt.add(4);
		setInt.add(5);
		setInt.add(5);
		setInt.add(5);
		
		Set<String> setStr= new HashSet<String>();
		setStr.add("한국");
		setStr.add("미국");
		setStr.add("중국");
		
		System.out.println(setStr);
		int intSize = setInt.size();
		int strSize = setStr.size();
		
		System.out.println(intSize);
		System.out.println(strSize);
		
		// 전체 삭제
		setInt.clear();
		System.out.println("clear 후 : " +setInt);
		setInt.add(1);
		setInt.add(2);
		setInt.add(3);
		setInt.add(4);
		setInt.add(5);
		
		boolean contains = setInt.contains(3);
		System.out.println("contains : " + contains);
		
		// 복사
		Set duplicateSet = new HashSet();
		duplicateSet.addAll(setInt);
		
		System.out.println("duplicateSet : " + duplicateSet);
		
		// 전보 포함하고 있는지 확인하기
		boolean bool = setInt.containsAll(duplicateSet);
		System.out.println("모두 포함 : " + bool);
		
		// 제거
		Set setRemove = new HashSet();
		setRemove.add(1);
		setRemove.add(2);
		setRemove.add(3);
		
		boolean isRemoveAll= setInt.removeAll(setRemove);
		System.out.println("removeAll 실행 : " + isRemoveAll);
		System.out.println("setInt : " + setInt);
		System.out.println("setRemove : " + setRemove);
		
		setInt.retainAll(setRemove); // 교집합
		System.out.println(setInt);
		
		System.out.println("---- iterator ----");
		// iterator : 반복자, collection 객체를 보통 iterable 객체라고 한다.
		
		Iterator<String> iterator = setStr.iterator();
		while(iterator.hasNext()) { // 다음 값이 있으면 true, 없으면 false
			String next = iterator.next(); // 다음 값을 가져오기
			System.out.println(next);
		}
	}
}
