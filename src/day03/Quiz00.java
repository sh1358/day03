package day03;

import java.util.Scanner;

public class Quiz00 {

	public static void main(String[] args) {

//		월을 입력해서 봄,여름,가을,겨울 출력
//		봄 : 3~5월
//		여름 : 6~8월
//		가을 : 9~11월
//		겨울 : 12~2월
		Scanner scan = new Scanner(System.in);
		
		System.out.print("월을 입력하세요 : ");
		int a = scan.nextInt();
		
		if(a>=3 && a<=5) {
			System.out.println(a+"월은 봄입니다.");
		}else if(a>=6 && a<=8) {
			System.out.println(a+"월은 여름입니다.");
		}else if(a>=9 && a<=11) {
			System.out.println(a+"월은 가을입니다.");
		}else if(a>=1 && a<=2 || a==12) {
			System.out.println(a+"월은 겨울입니다.");
		}else {
			System.out.println("잘못입력");
		}
	}

}
