package bank;

public class Bank implements BankInter {
	private String nameBank;

	public void print() { //метод интерфейса BankInter
		System.out.println(nameBank);
	}
	
	public Bank(String nameBank) {
		super();
		this.nameBank = nameBank;
	}

	public String getNameBank() {
		return nameBank;
	}

	public void setNameBank(String nameBank) {
		this.nameBank = nameBank;
	}

	public String toString() {
		return nameBank;
	}
}
