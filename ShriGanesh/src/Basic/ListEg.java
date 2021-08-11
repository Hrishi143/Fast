package Basic;
import java.util.*;

public class ListEg {

	public static void main(String[] args) {
	 
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		Iterator<Integer> a=list.iterator();
				while(a.hasNext())
					System.out.println(a.next());
					
		list.remove(2);
		System.out.println("After removing element");
		Iterator<Integer> b=list.iterator();
		while(b.hasNext())
			System.out.println(b.next());			


}

}
