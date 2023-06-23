import java.util.Stack;

/* java.util 패키지의 컬렉션 클래스 Stack의 특징
 *  1. 입구와 출구가 같아서 가장 먼저 입력된 것이 가장 나중에 나가는 구조
 *     즉, First Input Last OutPut구조 (FILO 구조)
 *     
 *  2. 가장 나중에 입력된 것이 가장 먼저 나가는 구조
 *     즉, Last Input First Output 구조 (LIFO 구조)
 * 
 * 
 */
public class ListTest06 {
public static void main(String[] args) {

	Stack myStack = new Stack();
	
	myStack.push("1-Java"); //스택 맨 위에 원소값을 추가
	myStack.push("2-Oracle"); 
	myStack.push("3-클라이언트 프로그래밍");
	
	while(!myStack.isEmpty()) { // 현재 스택이 비어있지 않다면
		System.out.println(" " + myStack.pop()); // 스택 맨위의 원소값을 제거하면서 반환
	}
}
}
