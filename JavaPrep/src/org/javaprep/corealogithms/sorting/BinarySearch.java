package org.javaprep.corealogithms.sorting;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class BinarySearch {
	public boolean binarySearch(List<Integer> numbers, Integer number){
		if(numbers.isEmpty()){
			return false;
		}
		
		int value = numbers.get(numbers.size()/2);
		if(value == number){
			return true;
		}
		
		if(number < value){
			return binarySearch(numbers.subList(0, numbers.size()/2 - 1),number);
		} else {
			return binarySearch(numbers.subList(numbers.size()/2 + 1, numbers.size()), number);
		} 
	}
	
	@Test
	public void testBinarySearch(){
		List<Integer> test = Arrays.asList(0,1,2,3,4,5);
		assertTrue(binarySearch(test,5));
		assertFalse(binarySearch(test,-1));
		
	}
	
}
