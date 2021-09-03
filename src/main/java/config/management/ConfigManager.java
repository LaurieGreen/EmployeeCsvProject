package config.management;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigManager {

	private static final Properties config;

	static { //this is like a constructor for a static class
		config = new Properties();
		try {
			// loading our config file using a newly instantiaded FileReader
			config.load( new FileReader( "src/main/config.properties" ) );
		} catch ( IOException e ) {
			e.printStackTrace();
		}
	}

	public String getEmployeeCsvLocation(){
		return config.getProperty( "employee_file_location" );
	}
}
