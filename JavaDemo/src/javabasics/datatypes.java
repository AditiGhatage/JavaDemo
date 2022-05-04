package javabasics;

public class datatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//data type int
		int a, b, result;
	    a = 345;
	    b = 900;
	    result = a+ b;
	    System.out.println("Number 1: " +a);
	    System.out.println("Number 2: " +b);
	    System.out.println("Number 1 + Number 2: " +result);
		
		System.out.println("----------------");
		
		//datatype boolean
		 boolean b1= true;
		    if(b1== true)
		      System.out.println("I am using a Boolean data type");
		      System.out.println(b1);
		
		System.out.println("----------------");
		//datatype Byte
		byte Byte1, Byte2;
	    Byte1 = 100;
	    Byte2 = 48;
	    System.out.println("Byte 1: " +Byte1);
	    System.out.println("Byte 2: " +Byte2);
	    Byte1++; // Looping back within the range
	    System.out.println("Incremented Value of Byte1: " +Byte1);

	}

}
