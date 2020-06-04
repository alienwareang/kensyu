package kensyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HandyPhoneTest extends HandyPhone {

	@Test
	void test() {
		//		fail("まだ実装されていません");
		HandyPhone h = new HandyPhone();
		h.mailAddress = "aaa@bbb.com";
		Assertions.assertEquals("aaa@bbb.com", h.mailAddress);
	}

}
