import java.util.Scanner;

public class Gugudan {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2단 구구단
//		System.out.println(2*1);
//		System.out.println(2*2);
//		System.out.println(2*3);
//		System.out.println(2*4);
//		System.out.println(2*5);
//		System.out.println(2*6);
//		System.out.println(2*7);
//		System.out.println(2*8);
//		System.out.println(2*9);
		
		//3
//		System.out.println(3*1);
//		System.out.println(3*2);
//		System.out.println(3*3);
//		System.out.println(3*4);
//		System.out.println(3*5);
//		System.out.println(3*6);
//		System.out.println(3*7);
//		System.out.println(3*8);
//		System.out.println(3*9);
		
		//4
//		System.out.println("4");
//		int result = 4 * 1;//int : 정수 값만 저장 할 수 있다.(data type)
//		System.out.println(result);			
//		result = 4 * 2;
//		System.out.println(result);			
//		result = 4 * 3;
//		System.out.println(result);			
//		result = 4 * 4;
//		System.out.println(result);			
//		result = 4 * 5;
//		System.out.println(result);			
//		result = 4 * 6;
//		System.out.println(result);			
//		result = 4 * 7;
//		System.out.println(result);			
//		result = 4 * 8;
//		System.out.println(result);			
//		result = 4 * 9;
//		System.out.println(result);	
		
//		//5 스캐너 클래스 사용 : import를 이용
//		System.out.println("출력할 구구단은?");
//		Scanner scanner=new Scanner(System.in);
//		int number = scanner.nextInt();
//		System.out.println(number * 1);
//		System.out.println(number * 2);
//		System.out.println(number * 3);
//		System.out.println(number * 4);
//		System.out.println(number * 5);
//		System.out.println(number * 6);
//		System.out.println(number * 7);
//		System.out.println(number * 8);
//		System.out.println(number * 9);
		
		//6,7단 반복문, 반복문 연습 예제 찾아볼 것. 계속되는 로직은 반복문으로 구현 가능
		
		//6단 while문
		
//		int i = 1;
//		while(i<10) {
//			System.out.println(6*i);
//			i=i+1;//i에 1을 더해 새로운 i만들고 while로 돌아가서 다시 진행. 조건에 벗어나면 종료.
//		}
//		for(int j = 1; j<10; j++) {//i=i+1
//		System.out.println(7*j);//외워서 안보고 할수 있도록 연습하기 
//		}
//		
		
		//8단과 9단, 값 입력 및 조건문 ( x * y : 1<x<10, y<10 : false)
		
		
		
		System.out.println("출력할 구구단은?");
		Scanner scanner=new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("사용자가 입력한 숫자값 : "+number);
		if (number < 2) {
			System.out.println("try again");
		} else if (number > 9) {		
			System.out.println("try again");
		} else {
			for(int i = 1; i < 10; i++) {
				System.out.println(number * i);
			}
		}

	}

}
