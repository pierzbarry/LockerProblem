package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    String [] array = new String[101];
		Arrays.fill(array, "open");

	        for(int i = 2; i < array.length; i++){
	        	for(int j = i; j < array.length; j+=i){
	        		if(array[j].equalsIgnoreCase("closed")){
	        			array[j] = "open";
					}
	        		else{
	        			array[j] = "closed";
					}
				}
			}
	        for(int i = 1; i < array.length; i++){
				System.out.println((i) + " " + array[i]);
			}
    }
}
