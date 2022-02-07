package com.example.tdd_demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class TddDemoApplicationTests {

	Range range;

	@BeforeEach
	void setup() {
		range = new Range(0F, 1F);
	}

	@Test
	void isOutOfRange() {
		assertFalse(range.isInRange(5F));
		assertFalse(range.isInRange(1F));
	}

	@Test
	void isInRange() {
		assertTrue(range.isInRange(0.2F));
		assertTrue(range.isInRange(0F));
	}

	@Test
	void setOwnRangeAndCheckIfValueIsInRange() {
		Range r = new Range(-3.2F, 0.1F);
		assertTrue(r.isInRange(0F));
		assertTrue(r.isInRange(-3.2F));
	}

	@Test
	void setOwnRangeAndCheckIfMinValueIsLessThanMaxValue() {
		assertThrows(IllegalArgumentException.class, () -> new Range(4F,2F));
	}

	@Test
	void setOwnRangeAndCheckIfValueIsInRangeWithDouble() {
		Range r = new Range(-3.2D, 0.1D);
		assertTrue(r.isInRange(0D));
		assertTrue(r.isInRange(-3.2D));
	}

	/*@Test
	void rangeHasDefaultValue() {
		assertEquals(range.getMinValue(), 0);
		assertEquals(range.getMaxValue(), 1);
	}*/

}
