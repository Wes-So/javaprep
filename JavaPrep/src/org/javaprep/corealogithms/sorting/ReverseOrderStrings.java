package org.javaprep.corealogithms.sorting;

import java.util.Comparator;

public class ReverseOrderStrings implements Comparator{

	@Override
	public int compare(Object o1, Object o2) { 
		String object1 = (String) o1;
		String object2 = (String) o2;
		 
		if(object2.charAt(0) > object1.charAt(0)){
			return 1;
		} else if(object2.charAt(0) < object1.charAt(0)) {
			return -1;
		} else {
			return 0;
		}
		
		
		
	}

}
