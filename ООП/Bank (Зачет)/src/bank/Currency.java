package bank;

public class Currency {
	private String curName;

	public Currency(String curName) {
		super();
		this.curName = curName;
	}

	public String getCurName() {
		return curName;
	}

	public void setCurName(String curName) throws EmptyException{
		if(curName.isEmpty())
			throw new EmptyException(); 
		this.curName = curName;
	}
	
	public String toString() {
		return curName;
	}
	
	
}
