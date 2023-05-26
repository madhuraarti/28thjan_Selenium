package MethodWithReturnType;

public class sample3 
{
  //return type ----> void, int
	
	public static void main(String[] args) 
   {
	int num1= add(10,20);
	System.out.println(num1);
	
	System.out.println("--------------------");
	
	System.out.println(add(5,6));
   }
  
  
	// method with int return type
	
	public static int add(int a, int b)
   {
	   
	   int c=a+b;   // 5+6
	   
	      
	   return c;
   }



}
