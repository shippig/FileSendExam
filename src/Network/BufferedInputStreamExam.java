package Network;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputStreamExam
{

	public static void main(String[] args)
	{
		//시작시간
		long startTime = System.currentTimeMillis();
		
		String filePath = "src/img/유정.jpeg";
		String copyPath = "src/img/복사.jpeg";
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
	
		try
		{
			fis = new FileInputStream(filePath);
			fos = new FileOutputStream(copyPath);
			
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
			byte[] buffer = new byte[512];
			int readCount = -1;
			
			while((readCount = bis.read(buffer)) != -1)
			{
				//버퍼, 0부터 읽어온 만큼(readCount) write하겠다. 
				bos.write(buffer, 0, readCount);
				bos.flush();
			}
		} 
		catch (FileNotFoundException e)
		{
			System.out.println("해당 파일을 찾을 수 없습니다.");
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
				if(fos != null) fos.close();
				if(fis != null) fis.close();
			} 
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		
		//종료시간
		long endTime = System.currentTimeMillis();
	
		//실행시간(endTime - startTiem)
		System.out.println("실행시간 :"+(endTime - startTime));
	}
}
