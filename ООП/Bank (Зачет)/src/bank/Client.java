package bank;

public class Client extends Person {
	private Employe employe;
	private Bill bill;
	public Client(String fullName, Employe employe, Bill bill) {
		super(fullName);
		this.employe = employe;
		this.bill = bill;
	}
	public Employe getEmploye() {
		return employe;
	}
	public void setEmploye(Employe employe) {
		this.employe = employe;
	}
	public Bill getBill() {
		return bill;
	}
	public void setBill(Bill bill) {
		this.bill = bill;
	}

}
