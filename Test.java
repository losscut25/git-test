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
//ù���� 1���� �����ϰ�, ���������� ������ 2�辿 �����ϴ� ����̴�. 30��° �Ǵ³� �����ؾ��ϴ� �ݾ��� ���Ͻÿ�.
	
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
// 1~1000������ ��, �� 3�� ����� �����ϵ� 3�� ����̸鼭 5�� ����� �������� ����
	
//	public static void main(String[] args) {
//		int sum = 0;
//		for(int i = 1; sum <= 10000 ; i+=2) {
//			sum += i;
//			if(sum >= 10000) break;
//			}
//			System.out.println(sum);	
//	        }
//     }
// 1���� �����Ͽ� Ȧ���� ���� ���ϸ鼭 �� ���� 10000�� ���� �ʴ� ������ ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
//�� �� 100���� ����Ǿ� �ִ� â�� �ϼ� 1���� �㰡 �ִ�. �� �Ѹ����� �Ϸ翡
//20g ���� ���� �԰�, 10�ϸ��� ���� ���� 2�辿 �����Ѵ�. ��ĥ ���� â���� ����
//��� ���� ���̰� �ɱ�. �׸��� ��� �� ��� �ΰ�?

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = 0, b= 0;
//		a = sc.nextInt(); b = sc.nextInt();
//		int gcd = 0; // �ִ�����
//		int lcm = 0; // �ּҰ����		
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
// �μ��� �ּҰ������ �ִ������� ���ϴ� ���α׷��� �ۼ��϶�.

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

//��� ���ϱ�
	
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

//1���� 1000������ �ڿ����߿��� 4�� ����� 6���� ����� �������� 1�� ���� ���� ����϶�.