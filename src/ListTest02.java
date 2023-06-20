import java.util.List;
import java.util.ArrayList;

/* java.util 패키지의 컬렉션 인터페이스 List 특징)
 *  1. 복수개의 원소값, 복수개의 자료형을 동시 저장 가능하다.
 *  2. 저장되는 순서 유지
 *  3. 중복원소값 허용. 실제 가장 많이 사용. 중요.
 *  4. 제일 중요한 것은 List 인터페이스를 구현한 컬렉션 클래스 ArrayList 이다.
 */
public class ListTest02 {
	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add(100);
		list.add(100.3);
		list.add("서울시");
		list.add("서울시");
		list.add(true);
		list.add('a');
		
		System.out.println("list 컬렉션 요소 개수 : "+ list.size());
		System.out.println(list);
		
		//일반 for반복문으로 컬렉션 원소값 출력
		for(int i = 0; i<list.size(); i++) {
			System.out.println(" " + list.get(i)); // get()메서드로 원소값을 가져옴
		}
	}
	

}
