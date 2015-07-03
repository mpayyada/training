package assignment_12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashSet;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		BufferedReader br = new BufferedReader(new FileReader( "file1.txt"));//Reading the contents of the file that is newly created
		BufferedReader br1 = new BufferedReader(new FileReader( "file2.txt"));//Reading the contents of the file that is newly created
		FileWriter fw=new FileWriter("file3.txt",true);//Opening new File in appending mode
		BufferedWriter bw=new BufferedWriter(fw);
		LinkedHashSet<String>lh=new LinkedHashSet<String>();
		String str;
		/**
		 * To read word by word in each line in each file
		 */
		while((str=br.readLine())!=null)
		{
			String temp=str;
			String[] str1=temp.split(" ");
			for(int i=0;i<str1.length;i++)
			{
				lh.add(str1[i]);
			}
			
		}
		while((str=br1.readLine())!=null)
		{
			String temp=str;
			String[] str1=temp.split(" ");
			for(int i=0;i<str1.length;i++)
			{
				lh.add(str1[i]);
			}
			
		}
		for(String s:lh)
		{
			bw.write(s+" ");
		}
		/**
		 * closing all the bufferedReaders and bufferedWritters
		 * pushing the data to writer buffer
		 */
		bw.flush();
		br.close();
		br1.close();
		fw.close();
	}
		catch(IOException ioe)
		{
		System.out.println(ioe);	
		}

}
}
