import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
//J Unit Test
//Austin Abro
class testExample2 {

	@Test
	public void test(){
		testPositive();
	}
	
	void testPositive() {
		Largest lar = new Largest();
		int[] list = {5,9,14,17,18};
		int eMax = 18;
		int ans = lar.largest(list);
		assertEquals(eMax,ans);
	}

}
