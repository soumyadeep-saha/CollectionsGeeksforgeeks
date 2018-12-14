package com.soumyadeep.collections.immutableList;

import java.util.List;

public class GfG6 {

	public static void main(String[] args) {

		//Creating a new ImmutableList including the existing List
		// non-empty immutable set 
        List<String> list = List.of("Geeks", "For", "Geeks"); 
        ImmutableList<String> iList = ImmutableList.<String>builder() 
                                          .addAll(list) 
                                          .add("Computer", "Portal" ) 
                                          .build(); 
  
        // Let's print the set 
        System.out.println(iList); 
	}

}
