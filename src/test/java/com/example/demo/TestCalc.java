package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCalc {

	@Test
	public void TestCalc() {
		Calc cal = new Calc();
		int a = 3;
		int b = 4;
		int sum = cal.add(a, b);
		Assertions.assertEquals(7, sum);
		
	}

}
