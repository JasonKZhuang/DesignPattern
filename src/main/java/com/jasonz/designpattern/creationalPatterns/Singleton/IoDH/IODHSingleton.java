package creationalPatterns.Singleton.IoDH;

/**
 * @author Jason.Zhuang
 * @studentId s3535252
 * Apr 9, 2018
 * Singleton.java
 * Describe: Using "Initialization Demand Holder" technique to create singleton
 * It will use a inner class 
 * The lazy loading and thread secure can be sured and it will not reduce the efficiency
 */
public class IODHSingleton
{
	private IODHSingleton()
	{
		;
	}
	
	private static class HolderClass
	{
		private final static IODHSingleton instance = new IODHSingleton();
	}
	
	public static IODHSingleton getInstance()
	{
		return HolderClass.instance;
	}
}
