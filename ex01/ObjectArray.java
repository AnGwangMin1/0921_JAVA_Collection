package day01.ex01;

// ArrayList기능을 흉내내는 클래스
public class ObjectArray {
	private int count;
	private Object[] arr;
	
	// 기본생성자
	public ObjectArray() {
		this(10);
	}
	// 인자생성자
	public ObjectArray(int init) {
		arr = new Object[init];
	}
	
	public void add(Object data) {
		arr[count++] = data;
	}
	
	public Object get(int index) {
		return arr[index];
	}
	
	public int size() {
		return count;
	}
}
