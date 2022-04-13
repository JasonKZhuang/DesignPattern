package creationalPatterns.FactoryMethod;

import creationalPatterns.FactoryMethod.TVExample.TV;
import creationalPatterns.FactoryMethod.TVExample.TVFactory;
import creationalPatterns.FactoryMethod.TVExample.XMLUtil;

public class ClientTV
{
	public static void main(String args[])
	{
		try
		{
			TV tv;
			TVFactory factory = (TVFactory) XMLUtil.getBean();
			tv = factory.produceTV();
			tv.play();
		} catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
