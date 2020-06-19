package task3;

import java.util.Date;

public class Employee extends Person  implements Cloneable {
	public double salary;
	public Date year;
	public String insuranceNumber;
	
	public Employee(String name, double salary, Date year, String insuranceNumber) {
		super(name);
		this.salary = salary;
		this.year = year;
		this.insuranceNumber = insuranceNumber;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getSalary () {
		return salary;
	}
	
	public void setYear(Date year) {
		this.year = year;
	}
	
	public Date getYear () {
		return year;
	}
	
	public void setInNumber(String insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}
	
	public String getInNumber () {
		return insuranceNumber;
	}
	
	public String toString() {
		return super.toString() + " year: " + year + ", insurance number: " + insuranceNumber;
	}
	
	public int compareTo(Object otherObject) { 
		Employee other = (Employee) otherObject;  
		if (salary < other.salary) 
		return -1; 
		if (salary > other.salary) 
		return 1;   
		return 0; 
	} 
	
	
	public boolean equals(Object o){
		if(o == this) return true;
		if(o==null || o.getClass()!=this.getClass()) return false;
		Employee e = (Employee)o;
		return super.equals(o) && salary==e.salary;
	}
	
	
	public Employee clone() 
			 throws  CloneNotSupportedException{  
			  return (Employee)super.clone(); 
			  }
	

}
