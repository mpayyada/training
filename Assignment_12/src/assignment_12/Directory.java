package assignment_12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Directory {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		int i=0;
File f=new File("D:\\MIDHUNA");//Creating a new directory
String[] str=f.list();
System.out.println(str.length);
for(i=0;i<str.length;i++)//Iterating through the list of files in that directory
{
	try
	{
	FileReader fr=new FileReader("D:\\MIDHUNA\\"+str[i]);//For Reading from current file in that directory
	BufferedReader br=new BufferedReader(fr);
	FileWriter fw=new FileWriter("D:\\MIDHUNA\\file4.text",true);//Appending to the file where we wanted to write
	BufferedWriter writer= new BufferedWriter(fw);
	String str2;
	/**
	 * To write to corresponding BufferedWriter
	 */
	while((str2=br.readLine())!=null)
	{
		writer.write(str2);
	}
	writer.flush();
	writer.close();
	fr.close();
}
	catch(IOException ioe)
	{
		System.out.println(ioe);
	}
	}
System.out.println("COmpleted!....");
}
}
