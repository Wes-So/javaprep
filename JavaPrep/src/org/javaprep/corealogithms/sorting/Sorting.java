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
	public void testBubbleSortArray(){
		final int[] numbers = {4,2,1,6,3,5,4};
		final int[] expected = {1,2,3,4,4,5,6};
		
		bubbleSortArray(numbers);
		
		assertEquals(Arrays.toString(expected),Arrays.toString(numbers));
		
	}
	
	public void bubbleSortArray(int[] numbers){
		boolean stillUnsorted = true;
		
		while(stillUnsorted){
			stillUnsorted = false;
			for(int i = 0; i < numbers.length -1; i++){				
				if(numbers[i + 1] < numbers[i]){
					int temp = numbers[i];					
					numbers[i] = numbers[i+ 1];
					numbers[i + 1] = temp;
					stillUnsorted = true;
				} 
			} 
		}
	}
	
	@Test
	public void testInsertSort(){
		final List<Integer> numbers = Arrays.asList(4,2,1,6,3,5,4);
		final List<Integer> expected = Arrays.asList(1,2,3,4,4,5,6);
		
		ArrayList<Integer> newArrayList = insertSort(numbers);
		
		assertEquals(expected,newArrayList);		
	}
		
	public ArrayList<Integer> insertSort(List<Integer> numbers){
		 
		ArrayList<Integer> newArrayList = new ArrayList<Integer>();
		
		for(int i = 0; i < numbers.size(); i++){
			if(newArrayList.size() == 0){
				newArrayList.add(numbers.get(i));
			} else {
				int newArrayListSize = newArrayList.size();
				for(int k = 0; k < newArrayListSize; k++){
					if(numbers.get(i) <= newArrayList.get(k)  ){
						newArrayList.add(k,numbers.get(i));
						break;
					}
				}
				
				if(newArrayList.size() == newArrayListSize){
					newArrayList.add(numbers.get(i));					
				}
			}  
		}		
		return newArrayList;
	}		
}
