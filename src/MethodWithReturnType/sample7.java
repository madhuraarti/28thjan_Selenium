package MethodWithReturnType;

public class sample7 
{
  //return type ----> void, int
	
	public static void main(String[] args) 
   {
	int num1= add(10,20);
	System.out.println(num1);
	
	System.out.println("--------------------");
	
	System.out.println(add(5,6));
   
	System.out.println("--------------------");
	
	sample7 s1 =new sample7();
	int num2 =s1.mul(9,7);
	
	System.out.println(num2);
	   
	System.out.println("--------------------");
	
	//System.out.println(s1.mul(c, d));
	
	System.out.println(s1.mul(4, 3));
   
	System.out.println("--------------------");
	
	// call from different class Sample_2
	
	String s5 = Sample_2.convertNameToUpperCase("vishal");
	System.out.println(s5);
   
	System.out.println("--------------------");
	
	System.out.println(Sample_2.convertNameToUpperCase("saurabh"));
	
   }
	
	// method with int return type
	
	public static int add(int a, int b)
   {
	   
	   int c=a+b;   // 5+6
	   
	      
	   return c;
   }

	// method with int return type
  
	public int mul(int c, int d) 
   {
	   int multValue=c*d;
	   return multValue;
   }


}


