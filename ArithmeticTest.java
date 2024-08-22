import junit.framework.TestCase;
public class ArithmeticTest extends TestCase {
	public ArithmeticTest() {	}
	public void TestAdd() {
		Arithmetic a=new Arithmetic();
		assertTrue(2==a.add(1,1));
	}
}