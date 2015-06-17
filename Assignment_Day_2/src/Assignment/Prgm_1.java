package Assignment;

public class Prgm_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int num=123456;
   int ar[]=new int[6];
   int temp=num;
   int reminder=0;
   int i=0;
   while(temp!=0)
   {
	   reminder=temp%10;
	   ar[i]=reminder;
	   temp=temp/10;
	   i++;
	      }
   for(i=0;i<ar.length;i++)
   {
	   System.out.println(ar[i]);
   }
	}

}
