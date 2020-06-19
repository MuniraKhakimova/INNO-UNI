package task3;

public class Person {
public String name;
	
	public Person( String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName () {
		return name;
	}
	
	public String toString() {
		return "name: " + name;
	}
	
	public boolean equals(Object o){
		if(o == this) return true;
		if(o==null || o.getClass()!=this.getClass()) return false;
		Person p = (Person)o;
		return name.equals(p.name);
	}

}
