package check_out;
import static check_out.letterGrade.letterGrade;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class ut_BVA {
	@Test
	void testBoudary100() {
		assertEquals('X', letterGrade(101));
		assertEquals('A', letterGrade(100));
		assertEquals('A', letterGrade(99));
	}

	@Test
	void TestBoudary90() { 
		assertEquals('A', letterGrade(91));
		assertEquals('A', letterGrade(90));
		assertEquals('B', letterGrade(89));
	}
	@Test
	void TestBoudary89() { 
		assertEquals('A', letterGrade(90));
		assertEquals('B', letterGrade(89));
		assertEquals('B', letterGrade(88));
	}
	@Test
	void TestBoudary80() { 
		assertEquals('B', letterGrade(81));
		assertEquals('B', letterGrade(80));
		assertEquals('C', letterGrade(79));
	}
	@Test
	void TestBoudary79() { 
		assertEquals('B', letterGrade(80));
		assertEquals('C', letterGrade(79));
		assertEquals('C', letterGrade(78));
	}
	@Test
	void TestBoudary70() { 
		assertEquals('C', letterGrade(71));
		assertEquals('C', letterGrade(70));
		assertEquals('D', letterGrade(69));
	}
	@Test
	void TestBoudary69() { 
		assertEquals('C', letterGrade(70));
		assertEquals('D', letterGrade(69));
		assertEquals('D', letterGrade(68));
	}
	@Test
	void TestBoudary60() { 
		assertEquals('D', letterGrade(61));
		assertEquals('D', letterGrade(60));
		assertEquals('F', letterGrade(59));
	}
	@Test
	void TestBoudary59() { 
		assertEquals('D', letterGrade(60));
		assertEquals('F', letterGrade(59));
		assertEquals('F', letterGrade(58));
	}
	@Test
	void TestBoudary0() { 
		assertEquals('F', letterGrade(1));
		assertEquals('F', letterGrade(0));
		assertEquals('X', letterGrade(-1));
	}
}
