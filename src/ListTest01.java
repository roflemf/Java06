import java.util.HashSet;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

/* java.util 패키지의 컬렉션 Set 인터페이스의 특징)
 *  1. 하나이상의 복수개의 원소값을 동시 저장 가능.
 *  2. 복수개의 자료형 타입을 동시 저장 가능
 *  3. 변화하는 가변적 배열이다. 고정크기가 아님.
 *  4. 저장되는 순서를 보장하지 않음
 *  5. 중복원소값 허용 X
 */
public class ListTest01 {
public static void main(String[] args) {
	
	Set nameSet = new HashSet(); // Set 컬렉션 인터페이스를 구현 상속받은 자손 컬렉션 클래스가 HashSet이다.
	nameSet.add(100);  // Object타입으로 업캐스팅해서 저장
	nameSet.add(100.6);
	nameSet.add("홍길동");
	nameSet.add("홍길동"); // 중복이름 허용 X
	nameSet.add("A"); 
	
	System.out.println("컬렉션 원소 개수 : "+ nameSet.size()); // 4
	System.out.println(nameSet); // 컬렉션 원소값 출력
	
}
}
