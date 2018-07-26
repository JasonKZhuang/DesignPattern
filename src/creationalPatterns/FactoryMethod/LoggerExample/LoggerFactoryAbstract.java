package creationalPatterns.FactoryMethod.LoggerExample;

public abstract class LoggerFactoryAbstract
{
	public void writeLog() 
	{
		LoggerProduct logger = this.createLogger();
		logger.writeLog();
	}
	
	public abstract LoggerProduct createLogger();
}
