package assignment_12;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;

	public class Merge {
		public static void main( String[] args )throws IOException
		{	
			ArrayList<String> al=new ArrayList<String>();
			try{
				BufferedReader br = new BufferedReader(new FileReader( "file1.txt"));//reading from the file that is newly created
				BufferedReader br1 = new BufferedReader(new FileReader( "file2.txt"));//reading from the file that is newly created
				String s1 =null; 
				String s2 = null;
				/**
				 * Adding data that is in files to string and then to arraylist
				 */
				while((s1=br.readLine())!=null)
				{
					al.add(s1);
				}
				while((s2=br1.readLine())!=null)
				{
					al.add(s2);
				}
				System.out.println(al);

			} catch (IOException e)
			{ 
				System.out.println(e);
			} 
			BufferedWriter writer=null; 
			writer = new BufferedWriter(new FileWriter("file3.txt"));
			String listWord; 
			for (int i = 0; i< al.size(); i++) 
			{ 
				listWord = al.get(i);
				writer.write(listWord);
				writer.write("\n");
			} 
			System.out.println("Succesfully.......Added......."); 
			writer.close(); 
		} 
	}


