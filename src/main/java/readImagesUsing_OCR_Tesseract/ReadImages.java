package readImagesUsing_OCR_Tesseract;

import java.io.File;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class ReadImages {

	public static void main(String[] args) {
	
	ITesseract image = new Tesseract();	
		
	try {
		String str =image.doOCR(new File("Users\\mamun79\\Desktop\\shafee.PNG"));
		
		System.out.println("Data from image is" + str);
		
	} catch (TesseractException e) {
		System.out.println("Exception Details" + e.getMessage());
		
	}
		
		
		
		
		
		
		
		
		
		
	}

}
