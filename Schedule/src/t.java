import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;


public class t {
	public static void main(String [] args){
		Work work1 = new Work("hw1", 1, 2);
		Work work2 = new Work("hw1", 2, 1);
		Work work3 = new Work("hw1", 5, 3);
		Work work4 = new Work("hw1", 4, 6);
		Work work5 = new Work("hw1", 7, 5);
		
		List<Work> works = new ArrayList<Work>();
		works.add(work1);
		works.add(work2);
		works.add(work3);
		works.add(work4);
		works.add(work5);
		Schedule s = new Schedule();
		System.out.println(s.SJF(works).toString());
	}

}
