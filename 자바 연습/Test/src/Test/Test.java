package Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Test {
    public static void main(String[] args) {
    	int k = 4;
    	int[] score = {10,100,20,150,1,100,200};
    	ArrayList<Integer> list = new ArrayList<>(k);
    	int[] rank = new int[score.length];
    	for(int i = 0; i < score.length;i++) {
    		list.add(score[i]);
    		list.sort(Comparator.naturalOrder());
    		if(list.size()>=k) {
    			list.remove(0);
    		}
    		rank[i]=list.get(0);

    	}

    
    	
   
    	 
 
    	
    	
    }
    
  
}