package com.bahubba.bahubbabookclub;

import com.bahubba.bahubbabookclub.service.ReaderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class BahubbaBookClubApplicationTests {

	@Autowired
	private ReaderService readerService;

	@Test
	void contextLoads() {
		assertThat(readerService).isNotNull();
	}

}
