package Exercise;

import java.util.Scanner;

public class Test {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int multi = 1;
//		for(int i = 1; i <= 30; i++) {
//			multi *= 2; 
//		}			
//			System.out.println(multi);		
//		}
//	}
//첫날에 1원을 예금하고, 다음날에는 전날의 2배씩 증가하는 방식이다. 30일째 되는날 예금해야하는 금액을 구하시오.
	
//	public static void main(String[] args) {
//		int sum = 0, sum2 = 0;
//		for(int i = 1; i <= 1000; i++) {		
//			if(i%3 == 0 && i%5 != 0) {
//				sum += i;
//			}
//			sum2 += i;
//			}
//		System.out.println(sum2 - sum);
//		}
//		
//		}
// 1~1000까지의 합, 단 3의 배수는 제외하되 3의 배수이면서 5의 배수는 제외하지 않음
	
//	public static void main(String[] args) {
//		int sum = 0;
//		for(int i = 1; sum <= 10000 ; i+=2) {
//			sum += i;
//			if(sum >= 10000) break;
//			}
//			System.out.println(sum);	
//	        }
//     }
// 1부터 시작하여 홀수의 합을 구하면서 그 합이 10000을 넘지 않는 마지막 수를 구하는 프로그램을 작성하시오.
//		public static void main(String[] args) {
//			int sum = 100000;
//			int mouse = 2;
//			int day;
//			for(day = 1; sum > 0; day++) {
//				sum -= mouse * 20;
//				if(day%10 == 0) {
//					mouse *= 2;
//				}				
//			}
//			day--;
//			System.out.println(day + " / " + mouse);
//		}		
//}
//쥐 쌀 100통이 저장되어 있는 창고에 암수 1쌍의 쥐가 있다. 쥐 한마리가 하루에
//20g 씩의 쌀을 먹고, 10일마다 쥐의 수가 2배씩 증가한다. 며칠 만에 창고의 쌀이
//모두 쥐의 먹이가 될까. 그리고 쥐는 총 몇마리 인가?

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = 0, b= 0;
//		a = sc.nextInt(); b = sc.nextInt();
//		int gcd = 0; // 최대공약수
//		int lcm = 0; // 최소공배수		
//		int min = a>b ? b:a;
//		for(int i = min; i >= 0; i--) {
//			if(a%i == 0 && b%i == 0) {
//				gcd = i;
//				break;				
//			}
//		}
//		System.out.println(gcd);
//		lcm = a*b/gcd;
//		System.out.println(lcm);
//	}	
//}
// 두수의 최소공배수와 최대공약수를 구하는 프로그램을 작성하라.

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		for(int i = 1; i <= a; i++) {
//			if(a/i == 0) {
//				System.out.println(i);
//				}
//		}
//	}
//}

//약수 구하기
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int i = 1; i <= 1000; i++) {
			if(i%4 == 1 && i%6 == 1) {
				sum += i;	
				
			}
		}System.out.println(sum);
	}
		
	}

//1에서 1000까지의 자연수중에서 4로 나누어도 6으로 나누어도 나머지가 1인 수의 합을 출력하라.