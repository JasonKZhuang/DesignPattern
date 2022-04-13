package creationalPatterns.FactoryMethod.LoggerExample;

public class LoggerFactoryFile implements LoggerFactory
{

	public LoggerFactoryFile()
	{
		System.out.println("Do some initialized work for File Logger Factory.");
	}
	
	public LoggerProduct createLogger()
	{
		//You can wite some code for the default method to open file
		//
		//
		LoggerProduct logger = new LoggerProductFile();
		//Here you can initialize logger by invoke the initilized method in File Logger
		//
		//
		System.out.println("You create a FileLogger Instance by default");
		return logger;
	}

	public LoggerProduct createLogger(String args)
	{
		//You can wite some code open file by giving parameter
		//
		//
		LoggerProduct logger = new LoggerProductFile();
		//Here you can initialize logger by invoke the initilized method in File Logger
		//
		//
		System.out.println("You create a FileLogger Instance by String");
		return logger;
	}

	public LoggerProduct createLogger(Object obj)
	{
		//You can wite some code open file by giving Object
		//
		//
		LoggerProduct logger = new LoggerProductFile();
		//Here you can initialize logger by invoke the initilized method in File Logger
		//
		//
		System.out.println("You create a FileLogger Instance by Object");
		return logger;
	}

}
