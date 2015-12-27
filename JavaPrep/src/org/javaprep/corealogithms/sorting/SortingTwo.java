package org.javaprep.corealogithms.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortingTwo {
	
	@Test
	public void sortNames(){
		final String[] names = {"Zeus","Yohimbe","Baldur","Athena"};
		final String[] expected = {"Athena","Baldur","Yohimbe","Zeus"};
		Arrays.sort(names);
		assertArrayEquals(expected,names);
	}
	
	@Test
	public void sortReverseNames(){
		final List<String> names = Arrays.asList("Athena","Baldur","Yohimbe","Zeus");
		final List<String> expected = Arrays.asList("Zeus","Yohimbe","Baldur","Athena");
		
		Collections.sort(names,new ReverseOrderStrings());
		System.out.println(names);
		assertEquals(expected,names); 
	}
	
	@Test
	public void testBubbleSortArray(){
		final int[] numbers = {4,2,1,6,3,5,4};
		final int[] expected = {1,2,3,4,4,5,6};
		
		bubbleSort(numbers);
		
		assertEquals(Arrays.toString(expected),Arrays.toString(numbers));		
	}	
	
	/* Worst Case O(n2) when you want to sort a list that is already sorted in reverse order
	 * Best Case O(n) when a list is already sorted as you only make one pass through the list
	 * Compare two elements in an array and repeat until no elements are switched.
	 */
	public void bubbleSort(int[] numbers){
		boolean unsorted = true;
		while(unsorted){
			boolean passedCompare = false;
			
			for(int i = 0; i <numbers.length -1; i++){				
				if(numbers[i] > numbers[i+1]){
					int temp = numbers[i];
					numbers[i] = numbers[i + 1];
					numbers[i + 1] = temp;
					passedCompare = true;
				}				
			
				if(!passedCompare){
					unsorted = false;
				}
			}
		} 
	}

	@Test
	public void testInsertSort(){
		final List<Integer> numbers = Arrays.asList(4,2,1,6,3,5,4);
		final List<Integer> expected = Arrays.asList(1,2,3,4,4,5,6);
		
		List<Integer> newList = insertSort(numbers);
		
		assertEquals(expected,newList);		
	}	
	
	public List<Integer> insertSort(List<Integer> numbers){
		List<Integer> newList = new LinkedList<Integer>();
		System.out.println(numbers);
		for(Integer number:numbers){
			boolean inserted = false;
			int newListSize = newList.size();
			for(int i =0;i<newListSize;i++){
				if(number < newList.get(i)){
					newList.add(i, number); 
					inserted = true;
					break;
				} 
			}
						
			if(!inserted) newList.add(number);
		}

		return newList;
	}
	
	
	@Test
	public void testQuickSort(){
		final List<Integer> numbers = Arrays.asList(4,2,1,6,3,5,4);
		final List<Integer> expected = Arrays.asList(1,2,3,4,4,5,6);
		
		List<Integer> newArrayList = quicksort(numbers);
		
		assertEquals(expected,newArrayList);		
	}
	
	public static List<Integer> quicksort(List<Integer> numbers){

		System.out.println(numbers);
		
		if(numbers.size() < 2){
			return numbers;
		}
		
		  int pivot = numbers.get(0);
		  List<Integer> lower = new ArrayList<Integer>();
		  List<Integer> upper = new ArrayList<Integer>();
		
		for(int i=1; i<numbers.size();i++){
			if(numbers.get(i) < pivot){
				lower.add(numbers.get(i));
			} else {
				upper.add(numbers.get(i));
			}
		}
		System.out.println("Lower:" + lower);
		System.out.println("Upper:" + upper);
		
		List<Integer> sortedlower = quicksort(lower);
		System.out.println("pivot:" + pivot);
		sortedlower.add(pivot);
 		sortedlower.addAll(quicksort(upper));
		
		return sortedlower; 
	}
	
//	public static List<Integer> mergesort(final List<Integer> values){
//		
//		if(values.size())
//		
//		
//	}


}
