package day01.ex01;

// ArrayList기능을 흉내내는 클래스
public class IntArray {
	private int count;
	private int[] arr;
	
	// 기본생성자
	public IntArray() {
		this(10);
	}
	// 인자생성자
	public IntArray(int init) {
		arr = new int[init];
	}
	
	public void add(int data) {
		arr[count++] = data;
	}
	
	public int get(int index) {
		return arr[index];
	}
	
	public int size() {
		return count;
	}
}
