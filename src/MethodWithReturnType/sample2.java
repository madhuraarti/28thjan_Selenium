package MethodWithReturnType;

public class sample2 
{
  //return type ----> void, int
	
	public static void main(String[] args) 
   {
	 add(10,20);
   }
  
  
	// method with int return type
	
	public static int add(int a, int b)
   {
	   
	   int c=a+b;   // 10+20
	   
	   System.out.println(c);// 30
	   
	   return c;
   }



}
