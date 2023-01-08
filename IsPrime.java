package week1.day1;

public class IsPrime {
	 public static void main(String[] args) {
	
	 int number = 877;
	    boolean prime = true;
	    for (int i = 2; i <number ; i++) {	      
	      if (number % i == 0) {
	        prime = false;
	        System.out.println(number + " is not a prime number.");
	        break;
	      }
	    }
	    if(prime==true) {
	    	System.out.println(number + " is a prime number.");
	    }	  
}
}
