package task3;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {
		 public int compare(Employee a , Employee b) {
		  return a.name.compareTo(b.name);
		 }		

}
