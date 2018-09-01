package managers;

import configuration.ConfigFileReader;

public class FileReaderManager {
	
/*	private static FileReaderManager filereReaderManager = new FileReaderManager();
	
	private static ConfigFileReader config;
	
	private FileReaderManager()
	{
		
		
	}
	
	private static FileReaderManager getInstance()
	{
		
		return filereReaderManager;
		
	}

	public ConfigFileReader getconfigFileReader()
	{
		
	return(config==null) ? config = new ConfigFileReader() : config;	
		
	}*/
	
	
	private static FileReaderManager fileReaderManager = new FileReaderManager();
	private static ConfigFileReader config;
 
	private FileReaderManager() {
	}
 
	 public static FileReaderManager getInstance( ) {
	      return fileReaderManager;
	 }
 
	 public ConfigFileReader getConfigReader() {
		 return (config == null) ? new ConfigFileReader() : config;
	 }

	
}
