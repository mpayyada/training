package assignment_12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Linebyline{
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new FileReader("file1.txt"));//Reading data from the file which newly created
		BufferedReader br1=new BufferedReader(new FileReader("file2.txt"));//Reading data from the file which newly created
		FileWriter fw=new FileWriter("file3.txt",true);//Appending mode to Write data to file
		BufferedWriter bw=new BufferedWriter(fw);//BuffereWritetr to write to new file
		ArrayList<String> array1=new ArrayList<String>();
		ArrayList<String> array2=new ArrayList<String>();
		String s1;
		String s2;
		/**
		 * Reading the two files line by line
		 */
		while((s1=br.readLine())!=null)
			{
				array1.add(s1+"\r\n");
			}
			while((s2=br1.readLine())!=null)
			{
				array1.add(s2+"\r\n");
			}
			System.out.println(array1.size());
			int l=0;
			int m=0;
			for(int i=0;i<(array1.size()+array2.size());i++)
			{
				if(i%2==0)
				{
					bw.write(array1.get(l));
					l++;
				}
				else
				{
					bw.write(array2.get(m));
					m++;
				}
			}
			/**
			 * Comments for closing the BufferedReader and Bufferedwritter
			 */

			bw.flush();
			fw.close();
			br.close();
			br1.close();
		}
		
	}
