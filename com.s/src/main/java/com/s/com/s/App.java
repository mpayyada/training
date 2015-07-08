package com.s.com.s;

public class App 
{
	public static int addition(int a,int b)
	{
		int sum=a+b;
		System.out.println("sum of two numbers : "+sum);
		return(sum);
	}
	public static int subtraction(int a,int b)
	{
		int sub=a-b;
		System.out.println("subtraction : "+sub);
		return(sub);
	}
	public static int multiplication(int a,int b)
	{
		int mul=a*b;
		System.out.println("multiplications : "+mul);
		return(mul);
	}
	public static int division(int a,int b)
	{
		int div;
		if(a>b)
		{
			 div=a/b;
		}
		else
		{
			 div=b/a;
		}
		System.out.println("division : " +div);
		return div;
	}

	public static void main( String[] args )
	{
		addition(10,20);
		subtraction(20, 10);
		multiplication(2, 3);
		division(20, 2);
	}
}

