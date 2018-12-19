package Network;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

public class ImageIO_Exam
{

	public static void main(String[] args)
	{
		File savefile = new File("src/img/저장완료.jpg");
		
		URL url = null;
		BufferedImage bi = null;
		FileInputStream fos = null;
		
		try
		{
			url = new URL("http://imgnews.naver.net/image/215/2017/04/11/A201704110268_3_20170517143322784.jpg");
			//fos = new FileInputStream("src/img/유정.jpeg");
			bi = ImageIO.read(url);
			ImageIO.write(bi, "jpg", savefile);
			
			System.out.print("저장 완료");
		} 
		catch (MalformedURLException e)
		{
			e.printStackTrace();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
