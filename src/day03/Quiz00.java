package day03;

import java.util.Scanner;

public class Quiz00 {

	public static void main(String[] args) {

//		���� �Է��ؼ� ��,����,����,�ܿ� ���
//		�� : 3~5��
//		���� : 6~8��
//		���� : 9~11��
//		�ܿ� : 12~2��
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ��� : ");
		int a = scan.nextInt();
		
		if(a>=3 && a<=5) {
			System.out.println(a+"���� ���Դϴ�.");
		}else if(a>=6 && a<=8) {
			System.out.println(a+"���� �����Դϴ�.");
		}else if(a>=9 && a<=11) {
			System.out.println(a+"���� �����Դϴ�.");
		}else if(a>=1 && a<=2 || a==12) {
			System.out.println(a+"���� �ܿ��Դϴ�.");
		}else {
			System.out.println("�߸��Է�");
		}
	}

}
