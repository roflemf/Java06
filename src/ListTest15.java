import java.util.Arrays;
import java.util.List;

/* 제네릭 타입간의 형변환 세번째 와일드 카드
 * 
 */
class MyList{
	public static void printList(List<?> list) {
		for(Object obj: list) {
			System.out.println(" " + obj);
		}
		System.out.println("\n=================>");
	}
}
public class ListTest15 {
public static void main(String[] args) {
	List<Double> li = Arrays.asList(10.3, 20.5);
	List<String> li2 = Arrays.asList("one", "two");
	List<Integer> li3 = Arrays.asList(100,200,300);
	List<Boolean> li4 = Arrays.asList(true,false);
	MyList.printList(li);
	MyList.printList(li2);
	MyList.printList(li3); 
	MyList.printList(li4); 
	
}
}
