package example;

public class Lab {
	private Disciplyne disciplyne;
	private String labName;

	public Lab(String labName,Disciplyne disciplyne) {
		super();
		this.disciplyne = disciplyne;
		this.labName = labName;
	}

	public Disciplyne getDisciplyne() {
		return disciplyne;
	}

	public void setDisciplyne(Disciplyne disciplyne) {
		this.disciplyne = disciplyne;
	}

	public String getLabName() {
		return labName;
	}

	public void setLabName(String labName) {
		this.labName = labName;
	}
	
	
}
