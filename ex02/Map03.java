package day01.ex02;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map03 {
	public static void main(String[] args) {
		// Hash맵을 가장 많이 사용, treemap 거의 안씀
		// 순서 없이 저장
		HashMap hashMap = new HashMap();
		hashMap.put("부서1", "인사부");
		hashMap.put("부서2", "총무부");
		hashMap.put("부서3", "전산부");
		hashMap.put("부서4", "경리부");
		hashMap.put("부서5", "영업부");
		
		System.out.println(hashMap);
		
		//        <Key, Value>
		HashMap<String, Object> sampleMap = new HashMap<String, Object>();
		sampleMap.put("과일", "사과");
		sampleMap.put("곡물", "쌀");
		sampleMap.put("견과", "땅콩");
		sampleMap.put("채소", "토마토");
		sampleMap.put("우육", "안창살");
		sampleMap.put("계육", "가슴살");
		
		System.out.println(sampleMap);
		
		// key값으로 value를 가져온다. 
		Object chicken=sampleMap.get("계육");
		System.out.println(chicken);
		
		boolean isTomato = sampleMap.containsKey("채소");
		boolean isChicken = sampleMap.containsValue("가슴살");
		
		System.out.println("isTomato : " + isTomato);
		System.out.println("isChicken : " + isChicken);
		
		// key, value값 모두 확인하기
		// Map의 key와 value를 확인하고자 할 때 entrySet() 메소드 이용
		// entrySet()의 리턴값은 Set
		Set<Map.Entry<String, Object>> entries =sampleMap.entrySet();
		
		System.out.println("entries : " + entries);
		
		// key값만 확인
		Set<String> keySetStr =sampleMap.keySet();
		System.out.println("keySetStr : " + keySetStr);
		
		// value값만 화인
		Collection<Object> values= sampleMap.values();
		System.out.println("values : " + values);
		
		// 비어있는지 확인하기
		boolean isEmpty = sampleMap.isEmpty();
		System.out.println("isEmpty : "+ isEmpty);
		
		// 크기
		int size = sampleMap.size();
		System.out.println("size : " + size);
		
		Map<String, Object> copyMap = new HashMap<>();
		boolean empty =copyMap.isEmpty();
		System.out.println("copyMap is empty : " + empty);
		
		// sampleMap을 그대로 담기
		copyMap.putAll(sampleMap);
		System.out.println(copyMap);
		
		boolean equals = sampleMap.equals(copyMap);
		System.out.println(equals);
		
	}
}
