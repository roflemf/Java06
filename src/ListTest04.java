import java.util.Enumeration;
import java.util.Vector;

/* java.util 패키지의 Enumeration인터페이스의 특징)
 *  1. 컬렉션에 저장된 복수개의 원소값을 쉽게 읽어오는 용도로 사용된다.
 *  2. 컬렉션 클래스와 좋은 궁합.
 *  3. 일회성. 다시 사용하려면 재생성해서 사용.
 */
public class ListTest04 {
public static void main(String[] args) {
	
	Vector vec = new Vector();
	
	//일반 for 반복문으로 컬렉션 원소값 초기화
	for(int i =1; i<=3; i++) {
		vec.add(new Integer(i*10));
	}
	
	Enumeration enu2 = vec.elements();
	while(enu2.hasMoreElements()) { // 다음 원소값이 있다면 참
		System.out.println(" "+ enu2.nextElement());//다음 원소값을 가져옴
		
	}
	System.out.println("\n========================");
	
	//한번 사용된 Enumeration의 boolean 타입은 거짓
	
	if(enu2.hasMoreElements()) {
		System.out.println("다음 원소값이 있다");
	}else {
		System.out.println("한번 사용된 것은 다시 사용 못한다.");
	}
}
}
