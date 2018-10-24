package manager;

import java.io.IOException;


import configreader.ConfigReader;

public class FileReaderManager {
	
	
	private static FileReaderManager fileReaderManager = new FileReaderManager();
	private static ConfigReader cf;
 
	private FileReaderManager() {
	}
 
	 public static FileReaderManager getInstance( ) {
	      return fileReaderManager;
	 }
 
	 public ConfigReader getConfigReader() throws IOException {
		 return (cf == null) ? new ConfigReader() : cf;
	 }

}
