import java.util.ArrayList;
import java.util.List;



/* 자바의 컬렉션 자료구조에 제네릭 문법을 적용)
 *  1. 형식)
 *  	List<String> nameList = new ArrayList<String>();
 *  	<String>이 제네릭 타입이다. 즉, 문자열 값만 저장 가능
 *  2. 제네릭 타입을 지정하면 불필요한 업캐스팅, 다운캐스팅을 하지 X 프로그램 속도 향상.
 *  	원하는 자료 추출도 쉬워져, 자료의  안정성도 보장 
 * 
 * 
 * 
 */

public class ListTest09 {
public static void main(String[] args) {
	List<String> nameList = new ArrayList<String>(); // 문자열 자료형 값만 저장 가능
	
	nameList.add("HONG");// add()메서드로 원소값 추가
	nameList.add("PARK");
	nameList.add("LEE");
	
	//for each문
	for(String name : nameList) {
		System.out.println(" " + name.toLowerCase()); // 영문소문자로 변경
	}
}
}
