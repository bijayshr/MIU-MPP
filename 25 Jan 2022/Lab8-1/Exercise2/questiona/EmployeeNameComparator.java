package Lab8.Exercise2.questiona;

import java.util.Comparator;

/* A functor, but not a closure */
public class EmployeeNameComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		int comparison = e1.name.compareTo(e2.name);
		if (comparison != 0) return comparison;
		EmployeeSalaryComparator salaryComparator = new EmployeeSalaryComparator();
		return salaryComparator.compare(e1, e2);
	}
}
