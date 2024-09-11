package Tset;

import java.util.Arrays;

public class Tset {
public static void main(String[] args) {
int price =3;
int money =20;
int count =4;
int answer = 0;
	for(int i =1; i<=count;i++) {
		answer += price*i; 
	
	}
	if(money<answer) {
		answer = answer -money;
	}else {
		answer = 0;
	}
	System.out.println(answer);
 }
}

