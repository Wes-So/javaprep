package org.javaprep.corealogithms.sorting;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Sorting {
	
	@Test
	public void testBubbleSort(){
		final List<Integer> numbers = Arrays.asList(4,2,1,6,3,5,4);
		final List<Integer> expected = Arrays.asList(1,2,3,4,4,5,6);
		
		bubbleSort(numbers);
		
		assertEquals(expected,numbers);
		
	}
	
	public void bubbleSort(List<Integer> numbers){
		boolean stillUnsorted = true;
		
		while(stillUnsorted){
			stillUnsorted = false;
			for(int i = 0; i < numbers.size(); i++){				
				if((i + 1 < numbers.size()) && (numbers.get(i + 1) < numbers.get(i))){
					int temp = numbers.get(i);					
					numbers.set(i,numbers.get(i+ 1));
					numbers.set(i + 1, temp);
					stillUnsorted = true;
				} 
			} 
		} 
	}

	@Test
	public void testInsertSort(){
		final List<Integer> numbers = Arrays.asList(4,2,1,6,3,5,4);
		final List<Integer> expected = Arrays.asList(1,2,3,4,4,5,6);
		
		List newNumbers = insertSort(numbers);		
		assertEquals(expected,newNumbers);		
	}
	
	public List insertSort(List<Integer> numbers){
		//TODO: hack of insert sort until we learn sortedLinkedList
		List<Integer> newList = new ArrayList<Integer>();
		for(int i = 0; i < numbers.size(); i++){
			newList.add(numbers.get(i));
			bubbleSort(newList);  
		}
		System.out.println(newList);
		return newList;  
	}	
	

	
	
	
}
