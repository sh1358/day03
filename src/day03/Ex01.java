package day03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

	      //���� �Է� �޾� 5�� ������� �ƴ���
	      
	      Scanner scan=new Scanner(System.in);
	      
	      System.out.println("���ڸ� �Է����ּ���>>>");
	      int num=scan.nextInt();
	      
	      if(num==0) {
	         num++;
	         System.out.println("0�� �Է��ؼ� 1 ���� ��ŵ�ϴ� ����..");
	      }
	      if(num%5==0) {
	         System.out.println(num+" = 5�� ����Դϴ�!");
	      }else {
	         System.out.println(num+" = 5�� ����� �ƴմϴ�..");
	      }
	      
	      
	      System.out.println("======================================");
	      
//	      //���� �Է� �޾� 0���� ũ�� 100���� ������ ���� �ƴϸ� ������
	      System.out.println("���ڸ� �Է����ּ���>>>");
	   
	      int su=scan.nextInt();
	      if(su>0&&su<100) {
	         System.out.println(su+" = �����Դϴ�!");
	      }else {
	         System.out.println(su+" = �������Դϴ�..");
	      }
	      
	      //�Է¹޾� ¦���̸鼭 3�� ����̸� ��� �ƴϸ� �ƴϴ�
	      System.out.println("���� �Է� >>>");
	      int su2=scan.nextInt();
	      if(su2%3==0&&su2%2==0) { //num%6==0
	         System.out.println(su2+" = ¦���̸鼭 3�� ���!");
	      }else {
	         System.out.println("�ƴ�..");
	      }
	      
	      //�� �Է� ¦��&&3�ǹ��
	      //!3�ǹ��&&¦���� ¦�� Ȧ���� Ȧ��
	      //!¦��&&3�ǹ���� ��� �ƴϸ� �ƴѰŰ�
	      //�ƹ��͵� �ش���������� �ƴѰŰ� 
	      
	      System.out.println("���� �Է� >>>");
	      int su3=scan.nextInt();
	      if(su3%6==0) {
	    	  System.out.println("3�� ����̸� ¦��");
	      }else {
	    	  if(su3%3==0) {
	    		  System.out.println("3�ǹ��");
	    	  }else {
	    		  if(su3%2==0) {
	    			  System.out.println("¦��");
	    		  }else {
	    			  System.out.println("���");
	    		  }
	    	  }
	      }
	}

}
