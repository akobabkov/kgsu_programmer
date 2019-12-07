package bank;

public class Bill {
	private int numBill;
	private int money;
	private Currency curency;
	private Bank bank;
	public Bill(int numBill, int money, Currency curency, Bank bank) {
		super();
		this.numBill = numBill;
		this.money = money;
		this.curency = curency;
		this.bank = bank;
	}
	public int getNumBill() {
		return numBill;
	}
	public void setNumBill(int numBill) {
		this.numBill = numBill;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public Currency getCurency() {
		return curency;
	}
	public void setCurency(Currency curency) {
		this.curency = curency;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}	
}
