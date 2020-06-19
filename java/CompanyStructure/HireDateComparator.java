package task3;

import java.util.Comparator;

public class HireDateComparator implements Comparator<Employee> {
	public int compare(Employee a , Employee b) {
		  return a.year.compareTo(b.year);
		 }
}
