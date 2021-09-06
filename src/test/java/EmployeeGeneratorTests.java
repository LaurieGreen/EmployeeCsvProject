import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class EmployeeGeneratorTests {
	private static Employee randomEmployee;
	private static Map<String, Employee> employeeMap;

	@BeforeAll
	public static void setup(){
		employeeMap = new EmployeesGenerator().employeeMap();
		List<String[]> rawData = new EmployeeRecordScanner().generateEmployeeData();
		Random random = new Random();
		randomEmployee =  new Employee( rawData.get( random.nextInt(rawData.size()) ) );
	}

	@Test
	public void employeeGeneratorTest1(){
		assertEquals( randomEmployee.getFirstName(), employeeMap.get( randomEmployee.getEmployeeID() ).getFirstName());
	}

	@Test
	public void employeeGeneratorTest2(){
		assertTrue(true);
	}
}
