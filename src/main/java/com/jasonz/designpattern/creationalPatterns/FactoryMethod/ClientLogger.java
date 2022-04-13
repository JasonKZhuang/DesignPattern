package creationalPatterns.FactoryMethod;

import creationalPatterns.FactoryMethod.LoggerExample.LoggerFactory;
import creationalPatterns.FactoryMethod.LoggerExample.LoggerFactoryDatabase;
import creationalPatterns.FactoryMethod.LoggerExample.LoggerFactoryFile;
import creationalPatterns.FactoryMethod.LoggerExample.LoggerProduct;
import creationalPatterns.FactoryMethod.LoggerExample.XMLUtilLogger;

public class ClientLogger
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		LoggerFactory factory;
		LoggerProduct logger;
		
		///
		factory = new LoggerFactoryFile();
		logger = factory.createLogger();
		logger.writeLog();
		//
		factory = new LoggerFactoryDatabase();
		logger = factory.createLogger();
		logger.writeLog();
		
		//use XML 
		LoggerFactory factory2;
		LoggerProduct logger2;
		//the type of return object need to be convertted
		factory2 = (LoggerFactory)XMLUtilLogger.getBean(); 
		logger2 = factory2.createLogger();
		logger2.writeLog();

		
	}

}
