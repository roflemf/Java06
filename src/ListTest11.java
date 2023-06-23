/* 제네릭 클래스 설계 */
class GenericClass<T>{ //<T> 가상의 제네릭 T 타입 선언 => 정해지지 않은 자료형
	private T member;

	public T getMember() {
		return member;
	}//getter()메서드

	public void setMember(T member) {
		this.member = member;
	}//setter()메서드
}
public class ListTest11 {
	public static void main(String[] args) {
//		GenericClass<double> obj01 = new GenericClass<double>(); // Error; 제네릭 타입에 기본 타입은 안된다.(기본타입; 자료형(소문자))
		
		GenericClass<Double> obj01 = new GenericClass<>(); // 실수 숫자값만 저장 가능
														   // 뒷부분 제네릭 타입은 생략한 형태인 <>을 사용.
														   // 앞부분만 봐도 어떤 제네릭 타입인가 알 수 있기 때문.
														   // (뒷부분 제네릭 타입을 생략 가능)
		obj01.setMember(10.7);
		System.out.println("반환된 실수 숫자값 = " + obj01.getMember());
		
		GenericClass<Integer> obj02 = new GenericClass<>();
		//정수값만 저장 가능한 제네릭스 obj02를 생성
		obj02.setMember(100);
		System.out.println("반환된 정수 숫자값 = " + obj02.getMember());
		
		GenericClass<String>obj03 = new GenericClass<String>(); //문자열 값만 저장 가능
		obj03.setMember("홍길동");
		System.out.println("반환된 문자열 이름 = " + obj03.getMember());
		
		

	}
}
