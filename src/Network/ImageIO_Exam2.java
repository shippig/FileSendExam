package Network;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageIO_Exam2
{

	public static void main(String[] args)
	{
		Image image = null;
		
		File source = new File("src/img/유정.jpeg");
		try
		{
			image = ImageIO.read(source);
		} 
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
