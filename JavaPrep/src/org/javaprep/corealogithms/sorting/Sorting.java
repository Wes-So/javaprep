package org.javaprep.corealogithms.sorting;

import static org.junit.Assert.assertEquals;

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
	
	/* Worst Case O(n2) when you want to sort a list that is already sorted in reverse order
	 * Best Case O(n) when a list is already sorted as you only make one pass through the list
	 * Compare two elements in an array and repeat until no elements are switched.
	 */
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
	
	/* Worst Case: 0(n2) when you sort an already-sorted list, you need to iterate to the end of the new list with each element to insert
	 * Best Case: O(n) when  you sort a reverse-order list, you will be putting each element into the new list at the head of the list
	 */
	
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
	
	@Test
	public void testQuickSort(){
		final List<Integer> numbers = Arrays.asList(4,2,1,6,3,5,4);
		final List<Integer> expected = Arrays.asList(1,2,3,4,4,5,6);
		
		List<Integer> newArrayList = quickSort(numbers);
		
		assertEquals(expected,newArrayList);		
	}
	
	@Test
	public void whenSizeIsLessThanTwoThenReturnList(){
		final List<Integer> numbers = Arrays.asList(4);
		final List<Integer> expected = Arrays.asList(4);
		
		List<Integer> newArrayList = quickSort(numbers);
		
		assertEquals(expected,newArrayList);		
	}	
	
	/* Worst Case: O(n2)
	 * Best Case: O(n log n)
	 */
	public List<Integer> quickSort(List<Integer> numbers){
		 if(numbers.size() < 2){
			 return numbers;
		 }
		 
		 final int pivot = numbers.get(0);
		 
		 final List<Integer> lowerList = new ArrayList<Integer>();
		 final List<Integer> higherList = new ArrayList<Integer>();
		 for(int i = 1; i < numbers.size(); i++){
			 if(numbers.get(i) < pivot){
				 lowerList.add(numbers.get(i));
			 } else {
				 higherList.add(numbers.get(i));
			 }
		 }

		 final List<Integer> sortedLowerList = quickSort(lowerList);		
		 
		 sortedLowerList.add(pivot);
		 sortedLowerList.addAll(quickSort(higherList));

		return sortedLowerList;
	}

	@Test
	public void testMergeSort(){
		final List<Integer> numbers = Arrays.asList(4,2,1,6,3,5,4);
		final List<Integer> expected = Arrays.asList(1,2,3,4,4,5,6);
		
		List<Integer> newArrayList = mergeSort(numbers);
		System.out.println(newArrayList);
		assertEquals(expected,newArrayList);		
	} 
	
	private List<Integer> getLowerList(int middleIndex,List<Integer> numbers){
		ArrayList<Integer> lowerList = new ArrayList<Integer>();
		for(int i = 0; i < middleIndex; i++ ){
			lowerList.add(numbers.get(i));
		} 
		return lowerList;
	}
	
	private List<Integer> getUpperList(int middleIndex,List<Integer> numbers){
		ArrayList<Integer> upperList = new ArrayList<Integer>();
		for(int i = middleIndex; i < numbers.size(); i++ ){
			upperList.add(numbers.get(i));
		} 
		return upperList;
	}
	
	private List<Integer> merge(List<Integer> sortedLowerList,List<Integer> sortedHigherList){
		int leftPtr = 0;
		int rightPtr = 0;
		ArrayList<Integer> newList = new ArrayList<Integer>();
		
		
		while(leftPtr < sortedLowerList.size() && rightPtr < sortedHigherList.size()){
			if(sortedLowerList.get(leftPtr) < sortedHigherList.get(rightPtr)){
				newList.add(sortedLowerList.get(leftPtr));
				leftPtr++;
			} else {
				newList.add(sortedHigherList.get(rightPtr));
				rightPtr++; 
			}
		}
		
		while(leftPtr < sortedLowerList.size()){
			newList.add(sortedLowerList.get(leftPtr));
			leftPtr++; 
		}
		
		while(rightPtr < sortedHigherList.size()){
			newList.add(sortedHigherList.get(rightPtr));
			rightPtr++; 
		}		
		
		return newList;
		 
	}
	
	/* Worst Case: O(n2)
	 * Best Case: O(n log n)
	 */
	public List<Integer> mergeSort(List<Integer> numbers){
		 if(numbers.size() < 2){
			 return numbers;
		 }
		 
		 final int middleIndex = numbers.size()/2;
		 final List<Integer> lowerList = getLowerList(middleIndex,numbers);
		 final List<Integer> higherList = getUpperList(middleIndex,numbers);
		 final List<Integer> sortedLowerList = mergeSort(lowerList);
		 final List<Integer> sortedHigherList = mergeSort(higherList);
 
		return merge(sortedLowerList,sortedHigherList);
	}	
	
}
