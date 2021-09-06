import config.management.ConfigManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class EmployeeRecordScanner {
	private static final Logger logger = LogManager.getLogger( EmployeeRecordScanner.class );
	private final EmployeeFileReader employeeFileReader = new EmployeeFileReader();

	public List<String[]> generateEmployeeData() {
		List<String[]> employeeRawData = new ArrayList<>();
		logger.debug( "Start employee CSV scanning" );
		Scanner scanner = new Scanner(employeeFileReader.employeeFileReader(ConfigManager.getEmployeeCsvLocation()));
		scanner.nextLine(); // to skip the CSV headers
		while (scanner.hasNext()){
			String [] nextEmployee=scanner.nextLine().split(",");
			employeeRawData.add( nextEmployee);
			logger.debug( nextEmployee );
		}
		logger.debug( "Finish employee CSV scanning" );
		return employeeRawData;
	}
}