package bank;

import java.util.ArrayList;

public class Employe extends Person {
	private ArrayList<Work> work;

	public Employe(String fullName, ArrayList<Work> work) {
		super(fullName);
		this.work = work;
	}
	
	public Employe(String fullName) {
		super(fullName); 
		
	}

	public ArrayList<Work> getWork() {
		return work;
	}

	public void setWork(ArrayList<Work> work) {
		this.work = work;
	}
	
	
	
}
