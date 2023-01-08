package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		
		int firstNum=0;
		int secNum=1;
		int nextNum;
		int i;
		int Sum=11;    
		 System.out.print(firstNum+" "+secNum);
		    
		 for(i=2;i<Sum;i++)
		 {    
		  nextNum=firstNum+secNum;    
		  System.out.print(" "+nextNum);    
		  firstNum=secNum;    
		  secNum=nextNum;    

	}

	}}
