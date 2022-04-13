package creationalPatterns.FactoryMethod.LoggerExample;

public class LoggerFactoryDatabase implements LoggerFactory
{

	public LoggerFactoryDatabase()
	{
		System.out.println("Do some initialized work for Database Logger Factory.");
	}
	
	public LoggerProduct createLogger()
	{
		//You can wite some code for the default method of connecting database
		//
		//
		LoggerProduct logger = new LoggerProductDatabase();
		//Here you can initialize logger by invoke the initilized method in DatabaseLogger
		//
		//
		System.out.println("You create a DatabaseLogger Instance by default");
		return logger;
	}

	public LoggerProduct createLogger(String args)
	{
		//using the parameter to connect database
		//
		//
		LoggerProduct logger = new LoggerProductDatabase();
		//Here you can initialize logger by invoke the initilized method in DatabaseLogger
		//
		//
		System.out.println("You create a DatabaseLogger Instance by String");
		return logger;
	}

	public LoggerProduct createLogger(Object obj)
	{
		//using the string that is encapsulated in the obj to connect database
		//
		//
		LoggerProduct logger = new LoggerProductDatabase();
		//Here you can initialize logger by invoke the initilized method in DatabaseLogger
		//
		//
		System.out.println("You create a DatabaseLogger Instance by object");
		return logger;
	}

}
