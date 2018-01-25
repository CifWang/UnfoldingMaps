package test;
import java.util.*;

public class BuiltInSortingTest {
	public static void main(String[] args) {
		Random random=new Random();
		List<Integer> numsToSort=new ArrayList();
		for(int i=0;i<5;i++) {
			numsToSort.add(random.nextInt(100));
		}
		Collections.sort(numsToSort);
		System.out.println(numsToSort);
		
	}

}
