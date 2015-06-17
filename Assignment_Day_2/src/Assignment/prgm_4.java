package Assignment;
import java.util.Scanner;
public class prgm_4 {
	


		public static void main(String[] args)
		{
			int countries= 5,cities=5;
			String [][] cityList = new String[countries][cities+1];
			Scanner s = new Scanner(System.in);
			for(int i=0;i<countries;i++)
			{
				for(int j=0;j<cities+1;j++)
				{
					if(j==0)
					{
					System.out.println("Enter Country Name ");
					cityList[i][j]=s.next();
					}
					else
					{
						System.out.println("Enter it's cities Name");
						cityList[i][j]=s.next();
					}
				}
			}
			
			System.out.println("The countries with city list are");
			for(int i=0;i<countries;i++)
			{
				for(int j=0;j<cities+1;j++)
				{
					if(j==0)
					System.out.print(cityList[i][j]+" :");
					else
						System.out.print(cityList[i][j]+" ");
				}
				System.out.println();
			}
			

		}

	}


