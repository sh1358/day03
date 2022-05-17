package day03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

	      //수를 입력 받아 5의 배수인지 아닌지
	      
	      Scanner scan=new Scanner(System.in);
	      
	      System.out.println("숫자를 입력해주세요>>>");
	      int num=scan.nextInt();
	      
	      if(num==0) {
	         num++;
	         System.out.println("0을 입력해서 1 증가 시킵니다 제발..");
	      }
	      if(num%5==0) {
	         System.out.println(num+" = 5의 배수입니다!");
	      }else {
	         System.out.println(num+" = 5의 배수가 아닙니다..");
	      }
	      
	      
	      System.out.println("======================================");
	      
//	      //수를 입력 받아 0보다 크고 100보다 작으면 정상 아니면 비정상
	      System.out.println("숫자를 입력해주세요>>>");
	   
	      int su=scan.nextInt();
	      if(su>0&&su<100) {
	         System.out.println(su+" = 정상입니다!");
	      }else {
	         System.out.println(su+" = 비정상입니다..");
	      }
	      
	      //입력받아 짝수이면서 3의 배수이면 출력 아니면 아니다
	      System.out.println("숫자 입력 >>>");
	      int su2=scan.nextInt();
	      if(su2%3==0&&su2%2==0) { //num%6==0
	         System.out.println(su2+" = 짝수이면서 3의 배수!");
	      }else {
	         System.out.println("아님..");
	      }
	      
	      //수 입력 짝수&&3의배수
	      //!3의배수&&짝수면 짝수 홀수면 홀수
	      //!짝수&&3의배수면 배수 아니면 아닌거고
	      //아무것도 해당되지않으면 아닌거고 
	      
	      System.out.println("숫자 입력 >>>");
	      int su3=scan.nextInt();
	      if(su3%6==0) {
	    	  System.out.println("3의 배수이며 짝수");
	      }else {
	    	  if(su3%3==0) {
	    		  System.out.println("3의배수");
	    	  }else {
	    		  if(su3%2==0) {
	    			  System.out.println("짝수");
	    		  }else {
	    			  System.out.println("벗어남");
	    		  }
	    	  }
	      }
	}

}
