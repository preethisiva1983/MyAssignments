package week01.day02;

public class Calculator 

    {
	    private int addTwoNumbers (int num1, int num2)
		{return num1 + num2;
	}


	 public float mul(float num1, int num2) {
		return num1*num2;

	}
	 
	 public int sub() {
		    int a = 5; 
		    int b = 3;
		    int c = a-b;
		    		
		    return c;
	 }

public static void main(String[] args) {
	
	Calculator cal = new Calculator();
	System.out.println(cal.addTwoNumbers(33,22) );
	System.out.println(cal.mul(33,22) );
	System.out.println(cal.sub());
}  }