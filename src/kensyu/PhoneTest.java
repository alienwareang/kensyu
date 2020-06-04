package kensyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PhoneTest extends Phone {

	@Test
	void test1() {
		//		fail("まだ実装されていません");
		Phone p = new Phone();
		p.no = "111";
		Assertions.assertEquals("111", p.no);
	}

	@Test
	void test2() {
		//		fail("まだ実装されていません");
		Phone p = new Phone();
		p.no = "111";
		//		p.tel("222");
		Assertions.assertEquals("111から222へ電話しました。", p.tel("222"));
	}

}
