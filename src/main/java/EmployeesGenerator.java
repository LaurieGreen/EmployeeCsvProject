import java.util.HashMap;
import java.util.Map;

public class EmployeesGenerator {

	private final EmployeeRecordScanner employeeRecordScanner = new EmployeeRecordScanner();

	public Map<String, Employee> employeeMap (  ){
		Map<String, Employee> employeeMap = new HashMap<>();

		for (String[] employeeRecord: employeeRecordScanner.generateEmployeeData()){
			Employee employee = new Employee( employeeRecord );
				employeeMap.put(employee.getEmployeeID(),employee);
		}
		return employeeMap;
	}

	public static void main( String[] args ) {
		EmployeesGenerator generator = new EmployeesGenerator();
		System.out.println(generator.employeeMap().get( "263313" ).getSalary());
	}
}
