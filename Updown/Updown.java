package day10_OOP;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Updown {
	HashMap<String,Integer> map = new HashMap<String,Integer>();
	Scanner sc = new Scanner(System.in);
	int record = 100;
	Number nu;
	Set<Number> set = new HashSet<Number>(); 
	public void button1() {
		int rand = (int)(Math.random()*100+1);
		System.out.println("컴퓨터 숫자 : "+rand);
		System.out.println("=== START ===");
		int S = 0;
		boolean bool = true;
		while(bool) {
			S++;
		System.out.print("Input Number ---> ");
		int A = sc.nextInt();
		if(A < rand) {		
			System.out.println("=== U P ===");
			continue;
		}else if(A > rand) {			
			System.out.println("=== Down ===");
			continue;
		}else {
			System.out.println(S+"회 만에 맞췄습니다!!!");
			break;
		}		
	}
		if(S >1) {
			map.put(null, S);
		}
	}
	public void highscore(int S) {
		System.out.println("최고기록은 :" +S);
		
		
	}
}
