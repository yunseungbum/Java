package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수를 입력하세요");

		int sp = sc.nextInt()+1;
		int[][] arr= new int[sp][sp];
		int num=0;
		int j;
		for(int i =0; i<arr.length;i++) {
			for(j =0; j<arr[i].length;j++) {
				arr[i][j]=num++;
				if(j==arr[i].length-1) {
					num-=arr[i].length-1;
				}//if end
				
			}//for(j) end
				System.out.print(Arrays.toString(arr[i]));

		}//for(i)종료
	
		
		
	}

}
