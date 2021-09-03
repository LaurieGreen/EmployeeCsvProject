import config.management.ConfigManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class EmployeeRecordScanner {
	private final EmployeeFileReader employeeFileReader = new EmployeeFileReader();

	public List<String[]> generateEmployeeData() {
		List<String[]> employeeRawData = new ArrayList<>();
		Scanner scanner = new Scanner(employeeFileReader.employeeFileReader(ConfigManager.getEmployeeCsvLocation()));
		scanner.nextLine(); // to skip the CSV headers
		while (scanner.hasNext()){
			employeeRawData.add( scanner.nextLine().split(","));
		}

		return employeeRawData;
	}
}