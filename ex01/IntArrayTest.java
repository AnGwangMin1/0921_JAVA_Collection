package day01.ex01;

public class IntArrayTest {
	public static void main(String[] args) {
		// 크기가 3인 배열
		int[] a = new int[3];
		
		a[0] = 10; 
		a[1] = 20; 
		a[2] = 30;
		
		int intVal = a[1]; // 배열요소값 가져오기
		for(int i = 0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("--------------");
		IntArray arr = new IntArray(5);
		
		arr.add(10);
		arr.add(20);
		arr.add(30);
//		arr.add("Hello");

		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
		// IntArray의 단점, int형만 담을 수 있다.
		
		// Object타입을 이용하면 다형성을 활용할 수 있다.
		// 자바의 ArrayList 컬렉션은 Object 타입으로 만들어짐
	}
}
