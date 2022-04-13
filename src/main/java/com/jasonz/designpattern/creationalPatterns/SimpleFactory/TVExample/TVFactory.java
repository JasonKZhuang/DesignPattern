package creationalPatterns.SimpleFactory.TVExample;

public class TVFactory
{
	public static TV produceTV(String brand) throws Exception
	{
		if(brand.equalsIgnoreCase("Haier"))
		{
			return new HaierTV();
		}
		else if(brand.equalsIgnoreCase("Hisense"))
		{
			return new HisenseTV();
		}
		else
		{
			throw new Exception("No input Brand" + brand);
		}
	}
}