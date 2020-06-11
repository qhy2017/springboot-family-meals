package qhy.example.web.poi;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.xslf.usermodel.SlideLayout;
import org.apache.poi.xslf.usermodel.XMLSlideShow;
import org.apache.poi.xslf.usermodel.XSLFSlide;
import org.apache.poi.xslf.usermodel.XSLFSlideLayout;
import org.apache.poi.xslf.usermodel.XSLFSlideMaster;
import org.apache.poi.xslf.usermodel.XSLFTextShape;

public class POIpptx {
	
	public static void main(String[] args)  throws Exception{

	      //creating a new empty slide show
	      XMLSlideShow ppt = new XMLSlideShow();	     
	      
	      //creating an FileOutputStream object
	      File file =new File("D:/example1.pptx");
	      FileOutputStream out = new FileOutputStream(file);
	      XSLFSlide createSlide = ppt.createSlide();
	      //saving the changes to a file
	      //getting the slide master object
	      List<XSLFSlideMaster> slideMasters = ppt.getSlideMasters();
	      //get the desired slide layout 
	      XSLFSlideLayout titleLayout = slideMasters.get(0).getLayout(SlideLayout.TITLE);
	                                                     
	      //creating a slide with title layout
	      XSLFSlide slide1 = ppt.createSlide(titleLayout);
	      
	      //selecting the place holder in it 
	      XSLFTextShape title1 = slide1.getPlaceholder(0); 
	      
	      //setting the title init 
	      title1.setText("Tutorials point");
	      
	      ppt.write(out);
	      System.out.println("Presentation created successfully");
	      out.close();
	}

}
