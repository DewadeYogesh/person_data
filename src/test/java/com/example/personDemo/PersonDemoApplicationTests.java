package com.example.personDemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class PersonDemoApplicationTests {
	private Calculator c=new Calculator();

	@Test
	void contextLoads() {


	}
@Test
	void  testSum(){
		int actualResult=60;
int expectedResult=	c.sum(10,20,30);

assertThat(actualResult).isEqualTo(expectedResult);

	}

}
