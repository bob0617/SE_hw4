package check_out;
import static check_out.letterGrade.letterGrade;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class ut_EP {
	@Test
	void testA() {
		assertEquals('A', letterGrade(100));
		assertEquals('A', letterGrade(90));
	}
	@Test
	void TestB() { 
		assertEquals('B', letterGrade(89));
		assertEquals('B', letterGrade(80));
	}
	@Test
	void TestC() { 
		assertEquals('C', letterGrade(79));
		assertEquals('C', letterGrade(70));
	}
	@Test
	void TestD() { 
		assertEquals('D', letterGrade(69));
		assertEquals('D', letterGrade(60));
	}
	@Test
	void TestF() { 
		assertEquals('F', letterGrade(59));
		assertEquals('F', letterGrade(0));
	}
	@Test
	void TestX() { 
		assertEquals('X', letterGrade(101));
		assertEquals('X', letterGrade(-1));
	}
}
