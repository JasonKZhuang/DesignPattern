package creationalPatterns.SimpleFactory;

import creationalPatterns.SimpleFactory.TVExample.TV;
import creationalPatterns.SimpleFactory.TVExample.TVFactory;
import creationalPatterns.SimpleFactory.TVExample.XMLUtilTV;

public class ClientTV
{
	public static void main(String args[])
	{
         try
         {
         	TV tv;
         	String brandName=XMLUtilTV.getBrandName();
         	tv=TVFactory.produceTV(brandName);
         	tv.play();
         	
         	//
         	tv=TVFactory.produceTV("TCL");
         	tv.play();
         	
         	
         }
         catch(Exception e)
         {
         	System.out.println(e.getMessage());
         }
	}
}
