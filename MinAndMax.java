package com.studies.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinAndMax {

	public static void main(String[] args) {
		
			List<Integer> intList = Arrays.asList(3, 4, 6, 7, 8 , 1, 2);
			Integer minValue = intList.stream()
													  .min(Integer::compareTo).get();
			
			System.out.println("Min Value is : "+minValue);
			
			Optional<Integer> maxValue = intList.stream()
					  .max((a, b) -> a.compareTo(b));
			
			System.out.println(maxValue);

	}

}
