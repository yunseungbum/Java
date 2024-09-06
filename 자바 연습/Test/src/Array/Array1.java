	//[a,c,e,d,b,f,h,g,i]
		//알파벳 순서로 정렬
		//그 다음 해당 순서로 알파벳 정렬
		//[1,3,5,7,9,8,6,4,2]
		//
		//2차원 배열
		//아래와 같이 스캐너로 수 입력 받고 첫배열의 마지막 수가 입력받은 수가 되게하기
		//ex) 입력시
		//[0,1,2,3]
		//[1,2,3,4]
		//[2,3,4,5]
		//[3,4,5,6]

package Array;

import java.util.Arrays;

public class Array1 {
	public static void main(String[] args) {
		String[] arr = new String[]{"a","c","e","d","b","f","h","g","i"};
		String [] arr1 = new String[arr.length];	
		int count=0;
 		Arrays.sort(arr);
 		System.out.println(Arrays.toString(arr));
 		
 		
 		//for(int x=0;x <arr1.length;x++) {
 			
 	
 		
 		for(int i =0;i<arr1.length-4;i++) {
 			
 				arr1[i]=arr[(i*2)];
 				System.out.print(arr1[i]);
 			}
 		
 		int n =7;
 			

 		for(int j=5;j<arr1.length;j++) {
 			
 			
 				arr1[j]=arr[n];	
 
 			n-=2;
 			
 		}
 		
 		//}
 		System.out.println();
 		System.out.println(Arrays.toString(arr1));
 	
	}
	
	}



