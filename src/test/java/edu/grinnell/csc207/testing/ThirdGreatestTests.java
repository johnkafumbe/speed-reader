package edu.grinnell.csc207.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import net.jqwik.api.*;
import net.jqwik.api.constraints.*;

public class ThirdGreatestTests {
	
	@Test
	public void exampleUnitTest() {
		int[] arr = { 3, 8, 4, 7, 2 };
		assertEquals(4, Functions.thirdGreatest(arr));
	}
	
	// TODO: add additional unit tests here!

	@Test
	public void testDuplicates(){
		int[] arr = { 4, 5, 5, 6, 9 };
		assertEquals(5, Functions.thirdGreatest(arr));
	}

	@Test
	public void testNegative(){
		int[] arr = { 7, -49, -5, 6, -92 };
		assertEquals(-5, Functions.thirdGreatest(arr));
	}
	
	@Test
	public void testLength1(){
		int[] arr = { 7 };
		assertEquals(7, Functions.thirdGreatest(arr));
	}

	@Test
	public void testLength2(){
		int[] arr = { 7, -49 };
		assertEquals(7, Functions.thirdGreatest(arr));
	}

	@Test
	public void testLength3a(){
		int[] arr = { 7, -49, 67 };
		assertEquals(-49, Functions.thirdGreatest(arr));
	}

	@Test
	public void testLength3b(){
		int[] arr = { 67, 7, -49 };
		assertEquals(-49, Functions.thirdGreatest(arr));
	}

	@Test
	public void testLength3c(){
		int[] arr = { -49, 67, 7 };
		assertEquals(-49, Functions.thirdGreatest(arr));
	}

	@Test
	public void testBeginning(){
		int[] arr = { 7, -49, 67, -20, 10 };
		assertEquals(7, Functions.thirdGreatest(arr));
	}

	@Test
	public void testMiddle(){
		int[] arr = { -49, 67, 7, -20, 10 };
		assertEquals(7, Functions.thirdGreatest(arr));
	}
	
	@Test
	public void testEnd(){
		int[] arr = { -49, 67, -20, 10, 7 };
		assertEquals(7, Functions.thirdGreatest(arr));
	}

	

	

	@Property
	public boolean examplePropertyTest(@ForAll @IntRange(min = 1, max = 1000) int sz,
									   @ForAll int k) {
		int[] arr = new int[sz];
		for (int i = 0; i < sz; i++) {
			arr[i] = k;
		}
		return Functions.thirdGreatest(arr) == k;
	}

		@Property
		public boolean Property1(@ForAll @IntRange(min = 1, max = 1000) int sz,
										@ForAll int k, @ForAll int j, @ForAll int l) {
			int[] arr = new int[sz];
			int g3 = Math.min(j, Math.min(k, l));
			for (int i = 0; i < sz; ) {
				if(i < sz){
					arr[i] = j;
					i++;
				} else break;
				if(i < sz){
					arr[i] = k;
					i++;
				} else break;
				if(i < sz){
					arr[i] = l;
					i++;
				} else break;
			}
			return Functions.thirdGreatest(arr) == g3;
		}

	@Property
	public boolean Property2(@ForAll @IntRange(min = 1, max = 1000) int sz,
									   @ForAll int k, @ForAll int j, @ForAll int l) {
		int[] arr = new int[sz];
		int g1 = Math.max(j, Math.min(k, l));
		for (int i = 0; i < sz; i++) {
			if(i < sz){
				arr[i] = j;
				i++;
			} else break;
			if(i < sz){
				arr[i] = k;
				i++;
			} else break;
			if(i < sz){
				arr[i] = l;
				i++;
			} else break;
		}
		return Functions.thirdGreatest(arr) <= g1;
	}
	
		
	// TODO: add additional property tests here!
}
