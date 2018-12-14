package com.soumyadeep.collections.immutableList;

import java.util.List;

public class GfG5 {

	public static void main(String[] args) {

		//Creating an ImmutableList from existing List
		// non-empty immutable set 
        List<String> list = List.of("Geeks", "For", "Geeks"); 
        ImmutableList<String> iList = ImmutableList.<String>builder() 
                                          .addAll(list) 
                                          .build(); 
  
        // Let's print the List 
        System.out.println(iList); 
	}
}
