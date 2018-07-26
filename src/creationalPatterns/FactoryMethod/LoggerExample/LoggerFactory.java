package creationalPatterns.FactoryMethod.LoggerExample;

public interface LoggerFactory
{
	/**
	 * Create a logger Object
	 * @return
	 */
	public LoggerProduct createLogger();
	
	public LoggerProduct createLogger(String args);
	
	public LoggerProduct createLogger(Object obj);
}
