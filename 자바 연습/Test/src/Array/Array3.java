/*
[[[1],[0]],[[0],[0]],[[0],[0]]]
-----------
[[[1],[1]],[[0],[0]],[[0],[0]]]
-----------
[[[1],[1]],[[1],[0]],[[0],[0]]]
-----------
[[[1],[1]],[[1],[1]],[[0],[0]]]
-----------
[[[1],[1]],[[1],[1]],[[1],[0]]]
-----------
[[[1],[1]],[[1],[1]],[[1],[1]]]
 * 
 * 
 * 100000
 * 110000
 * 111000
 * 111100
 * 111110
 * 111111
 */
package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[][] arr = new int[num][num];
		int res = 1;
		
		for(int i =0; i <arr.length;i++) {
			
			System.out.print("[");
			for(int j =0; j <arr[i].length;j++) {
				
					if(j<=i) {
						arr[i][j]=res;
					
					}if(j<arr[i].length-1) {
					System.out.print("["+arr[i][j]+"]"+",");
					}else {
						System.out.print("["+arr[i][j]+"]");
					}
				
				
			}
			System.out.println("]");
		}//for(i) end
		
		
		
	}
	

}
