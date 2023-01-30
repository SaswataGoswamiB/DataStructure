package Pqueue;

public class Orders implements Comparable<Orders>{

	
	String nameString;
	
	int id;

	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Orders(String nameString, int id) {
		super();
		this.nameString = nameString;
		this.id = id;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Orders [nameString=" + nameString + ", id=" + id + "]";
	}

	@Override
	public int compareTo(Orders o) {
		// TODO Auto-generated method stub
		return this.getId()-o.getId();
	}
	
	
}
