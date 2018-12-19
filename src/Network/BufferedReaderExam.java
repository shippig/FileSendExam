package Network;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderExam
{

	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();
		
		String filePath = "src/img/복사전.txt";
		String copyPath = "src/img/복사후.txt";
		
		FileReader fr = null;
		FileWriter fw = null;
		
		BufferedReader br = null;
		try
		{
			fr = new FileReader(filePath);
			fw = new FileWriter(copyPath);
			
			br = new BufferedReader(fr);
		
			String str = "";
			while((str = br.readLine()) != null)
			{
				System.out.println(str);
				fw.write(str);
				fw.flush();
			}
		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(fw != null) fw.close();
				if(fr != null) fr.close();
			} catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println("실행시간: "+(endTime - startTime));
	}
}
