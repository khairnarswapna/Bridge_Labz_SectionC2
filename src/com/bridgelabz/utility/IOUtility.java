package com.bridgelabz.utility;
 
import java.io.*;

public class IOUtility 
{
	
	public static void poemlyrics(String animal, String sound) throws FileNotFoundException 
	{
		File file=new File("/home/slot2/eclipse-workspace/BOOT/Section_C2/src/com/bridgelabz/TextFile/Poem.txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String str = "";
		try {
			str = bufferedReader.readLine();
			bufferedReader.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String replaceString = str.replaceAll("ANIMAL", animal);
		String replaceString2 = replaceString.replaceAll("SOUND", sound);

		System.out.println(replaceString2);
		System.out.println("Writing in file of same");
		
		try {
			FileWriter fileWriter = new FileWriter(file);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(replaceString2);
			bufferedWriter.close();
			System.out.println("Write successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
