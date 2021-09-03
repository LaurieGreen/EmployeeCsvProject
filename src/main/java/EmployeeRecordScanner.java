import config.management.ConfigManager;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeRecordScanner {
	private final EmployeeFileReader employeeFileReader = new EmployeeFileReader();

	public void returnEachLine() {
		Scanner scanner = new Scanner(employeeFileReader.employeeFileReader(ConfigManager.getEmployeeCsvLocation()));

		while (scanner.hasNext()){
			System.out.println(Arrays.toString(scanner.nextLine().split(",")));
		}
	}

	public static void main(String[] args) {
		EmployeeRecordScanner employeeRecordScanner = new EmployeeRecordScanner();
		employeeRecordScanner.returnEachLine();
	}
}