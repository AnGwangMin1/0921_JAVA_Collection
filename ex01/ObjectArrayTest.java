package day01.ex01;

import java.util.ArrayList;

public class ObjectArrayTest {
	public static void main(String[] args) {
//		ObjectArray arr = new ObjectArray(5);
//		
//		arr.add(10);
//		arr.add(20);
//		arr.add(30);
//		arr.add("Hello");
//		
//		arr.add(new A());
//		arr.add(new A());
//		arr.add(new B());
//		
//		for(int i =0; i<arr.size(); i++) {
//			System.out.println(arr.get(i));
//		}
		
		// ArrayList는 Object[]을 가지고 있으면서
		// 배열의 길이에 제약없이 사용할 수 있는 장점이 있다.
		// 배열안에 여러객체를 넣어서 사용할 수 있다.
		// 그런데 여러객체를 사용하는 것은 상당히 불안정하다.
		
		ArrayList arr = new ArrayList();
		
		arr.add(new A());
		arr.add(new A());
		arr.add(new B());
		arr.add(new A());
		arr.add(new A());
		arr.add(new A());
		
		System.out.println(arr.size());
		
		// arr에 담겨있는 A, B의 go()메소드를 호출 하시오.
		for(int i = 0; i<arr.size(); i++) {
			Object obj = arr.get(i);
			if(obj instanceof A) {
				// 다운캐스팅
				((A)obj).go(); // .이 ()보다 우선순위가 높다.
			}else {
				// 다운캐스팅
				((B)obj).go();
			}
		}
		
		
	}
}
