import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestSchedule {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Work work1 = new Work("hw1", 1, 2);
		Work work2 = new Work("hw1", 1, 2);
		List<Work> works = new ArrayList<Work>();
		works.add(work1);
		works.add(work2);
		Schedule s = new Schedule();
		String testString = "[3.0, 1.5]";
		assertEquals(testString, s.FCFS(works).toString());
	}
	
	@Test
	public void test2() {
		Work work1 = new Work("hw1", 1, 2);
		Work work2 = new Work("hw1", 1, 2);
		List<Work> works = new ArrayList<Work>();
		works.add(work1);
		works.add(work2);
		Schedule s = new Schedule();
		String testString = "[3.0, 1.5]";
		assertEquals(testString, s.SJF(works).toString());
	}
	@Test
	public void test4() {
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
		String testString = "[5.8, 1.7733333333333334]";
		assertEquals(testString, s.SJF(works).toString());
	}
	
	
	@Test
	public void test3() {
		Work work1 = new Work("hw1", 1, 2);
		
		assertEquals(0, work1.getPriority());
	}

}
