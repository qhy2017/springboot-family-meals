//package qhy.example.web.poi;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.util.List;
//
//import org.apache.poi.xslf.usermodel.*;
//
//public class POIpptx {
//
//    public static void main(String[] args) throws Exception {
//
//        //creating a new empty slide show
//
//
//        //creating an FileOutputStream object
//        File file = new File("D:\\lh\\java\\seg-bi\\seg-bi\\src\\main\\resources\\hyxqhtezbfx.pptx");
////	      FileOutputStream out = new FileOutputStream(file);
//        FileInputStream inputStr = new FileInputStream(file);
//        XMLSlideShow ppt = new XMLSlideShow(inputStr);
//
////	      XSLFSlide createSlide = ppt.createSlide();
//        //saving the changes to a file
//        //getting the slide master object
////	      List<XSLFSlideMaster> slideMasters = ppt.getSlideMasters();
//        //get the desired slide layout
////	      XSLFSlideLayout titleLayout = slideMasters.get(0).getLayout(SlideLayout.TITLE);
//
//        //creating a slide with title layout
////	      XSLFSlide slide1 = ppt.createSlide(titleLayout);
//
//        //selecting the place holder in it
////	      XSLFTextShape title1 = slide1.getPlaceholder(0);
////	      String text = title1.getText();
////	      System.out.println(text);
//        //setting the title init
////	      title1.setText("Tutorials point");
//        List<XSLFSlide> slides = ppt.getSlides();
//
//        for (XSLFSlide xslfSlide : slides) {
//            List<XSLFShape> shapes = xslfSlide.getShapes();
//            int k =0;
//            for (XSLFShape sha : shapes) {
//                k++;
//                if (sha instanceof XSLFAutoShape) {
//                    XSLFAutoShape xslfAutoShape = (XSLFAutoShape) sha;
//                    List<XSLFTextParagraph> textParagraphs = xslfAutoShape.getTextParagraphs();
//                    for (int i = 0; i < textParagraphs.size(); i++) {
//                        XSLFTextParagraph textParagraph = textParagraphs.get(i);
//                        List<XSLFTextRun> textRuns = textParagraph.getTextRuns();
//                        for (int j = 0; j < textRuns.size(); j++) {
//                            if(k == 2){
//                                XSLFTextRun xslfTextRun = textRuns.get(j);
//                                String rawText = xslfTextRun.getRawText();
//                                System.out.println(rawText);
//                                if(j == 1){
//                                    xslfTextRun.setText("测试2020");
//                                } else if(j == 5) {
//                                    xslfTextRun.setText("200");
//                                } else if (j == 7) {
//                                    xslfTextRun.setText("51");
//                                }
//                            }
//                        }
//                    }
////					String text = xslfAutoShape.getText();
////					System.out.println(text);
//                }
//            }
//        }
//
//        FileOutputStream fileOutputStream = new FileOutputStream(new File("D:\\lh\\测试文档\\market_ywxqhtezbfx.pptx"));
//
//	      ppt.write(fileOutputStream);
//	      fileOutputStream.close();
//    }
//
//}
