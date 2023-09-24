package com.vsita.cp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(locations = "/test-context.xml")

class CpApplicationTests {

	@Test
	void contextLoads() {
	}

}
