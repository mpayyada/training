package Assignment;

public class prgm_2 {
	static int index=0;
	static int[] stack = new int[10];
	static int push(int x)
	{
		int temp=0;
		if(index<9)
		{
			stack[index++]= x;
			temp =x;
		}
		else
		{
			System.out.println("Stack is already full..");
		}
		return temp;
	}
	static int pop()
	{
		int temp=0;
		if(index<0)
		{
			System.out.println("Stack already empty......");
		}
		else
		{
			temp =stack[index-1];
			stack[index--]=0;			
		}
		return temp;
	}
	static void peek()
	{
		System.out.println("the top element is "+stack[index-1]);
	}
	static void display()
	{		
		System.out.print("Elements of Stack are =");
		for(int i=0;i<=index-1;i++)
		{

			System.out.print(stack[i]+","); 
		}
		System.out.println(" "); 
		
	}

	public static void main(String[] args)
	{
		System.out.println(push(0)+" is added to Stack");
		System.out.println(push(10)+" is added to Stack");
		System.out.println(push(22)+" is added to Stack");
		System.out.println(push(45)+" is added to Stack");
		System.out.println(push(40)+" is added to Stack");
		System.out.println(push(99)+" is added to Stack");
		peek();
		display();
		System.out.println(pop()+" is Removed from Stack");
		peek();
		display();




	}

}


