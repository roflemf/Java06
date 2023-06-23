import java.util.HashMap;
import java.util.Map;

/* Map인터페이스를 구현 상속한 HashMap컬렉션 클래스 특징)
 *  1. 키,값 쌍으로 저장하는 사전적인 컬렉션 구조
 *  2. 저장되는 순서를 보장 X, 키를 통해서 값을 검색해, 검색속도가 빠르다
 * 
 */
public class ListTest10 {
	public static void main(String[] args) {
		Map<String, Integer> m  = new HashMap<String, Integer>(); // 문자열 키, 정수숫자값만 
																  // 저장되는 컬렉션 제네릭 선언
																  // 주의) <int> 제네릭 타입을 기본자료형으로 선언하면 안된다.
		String[] sample = {"a", "a", "a", "b", "c"};
		
		m.put("a", 1);
		m.put("a", 1+1);
		
		m.put("a", 2+1);
		m.put("b", 1);
		m.put("c", 1);
		
		for(String str : sample) {
			Integer freq = m.get(str); // 키에 대한 값을 구함 null
			m.put(str, (freq == null)?1:freq+1); // 문자열 키, 정수 숫자값 쌍으로 저장. 
											   // 특히 값을 저장할 때에는 삼항 조건연산자를 사용			
											   // 값으로는 단어 빈도수가 저장됌
		
		/* 삼항 조건연산자 문법 형식)
		 * 조건식? 
		 * 조건식이 참이면 실행 : 조건식이 거짓이면 실행;
		 * 
		 */
			
		
		}
		System.out.println(m.size()+" 단어가 있습니다."); //size() 메서드는 컬렉션 원소 개수 => 7
		System.out.println(m.containsKey("to")); // to키가 맵에 포함되어있다면 참
		System.out.println(m.isEmpty()); // 컬렉션 맵이 비어 있다면 참
		System.out.println(m); //컬렉션 맵 자료를 출력 
							   // => 컬렉션 맵 자료구조는 {}형태로 출력되고, List 컬렉션 자료구조는 []형태로 출력된다.
	}

}
