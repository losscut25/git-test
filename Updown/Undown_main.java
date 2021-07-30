package day10_OOP;

import java.util.Scanner;

public class Undown_main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Updown ud = new Updown();
		boolean bool = true;
		while(bool) {
		System.out.println("=== UP & Down Game ===");
		System.out.println("1. 게임시작");
		System.out.println("2. 게임전적");
		System.out.println("3. 게임종료");
		System.out.print(">>>>> ");
		int N = sc.nextInt();
	
		switch(N) {
			case 1 :
				ud.button1();
				
			case 2 :
				ud.highscore(N);
			
			case 3 :
				break;
			}
		}
	}
}