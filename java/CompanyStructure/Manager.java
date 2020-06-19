package task3;

import java.util.Date;
import java.util.Vector;

import task2.Employee;


public class Manager extends Employee implements Cloneable {
	public double bonus;
	public Manager (String name, double salary, Date year,String insuranceNumber, double bonus) {
		super(name, salary, year, insuranceNumber );
		this.bonus = bonus;
	}
	Vector <Employee> m = new Vector<>();
	public void group (Employee e) {
		m.add(e);
	}
	
	public void getBonus() {
		if (m.size()==3) {
			this.salary +=bonus;
		}
	}
	
	public int compareTo(Object otherObject) { 
		Manager other = (Manager) otherObject;  
		super.compareTo(otherObject);
			if (salary == other.salary && bonus > other.bonus)
				return 1;
			if (salary == other.salary && bonus < other.bonus)
				return -1;
		return 0; 
	} 
	
	
	
	public boolean equals(Object o){
		if(o == this) return true;
		if(o==null || o.getClass()!=this.getClass())  return false;
		Manager m = (Manager)o;
		return super.equals(o) && bonus == m.bonus;
	}
	
	public Manager clone()  throws  CloneNotSupportedException{  
			  return (Manager)super.clone(); 
			  }

}
