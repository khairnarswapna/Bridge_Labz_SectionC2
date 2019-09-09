package com.bridgelabz.IOPro;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Maxmin 
{
		
	public static void main(String[] args)
	{
 
		
		int[] a= {11,22,23,44,55,99,88,77,66};
		
		
		int min = a[0];
		int max = a[0];
		
		for (int i = 0; i < a.length; i++) 
		{
			if (min > a[i]) 
			{
				min =a[i];
			}
			if (max < a[i]) 
			{
				max = a[i];
			}
		}
		String minmax = "Max is :" + max + " and Min is :" + min;
		System.out.println(minmax);
		
		try 
		{
			File file=new File("/home/slot2/eclipse-workspace/BOOT/Section_C2/src/com/bridgelabz/TextFile/minmax.txt"); 
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write(minmax);
			bw.close();
			System.out.println("Write successfully");
		} 
		catch (IOException e) 
		{
		 
			e.printStackTrace();
			
		}
	}

}
