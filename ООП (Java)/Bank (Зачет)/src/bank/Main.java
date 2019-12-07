package bank;

public class Main {

	public static void main(String[] args) {
		Bank bank = new Bank("Какой-то банк");
		System.out.println(bank);
		Currency currencyRU = new Currency("руб");
		System.out.println(currencyRU);
		Currency currencyEN = new Currency("$");
		System.out.println(currencyEN);
		Bill bill1 = new Bill(1, 1000, currencyRU, bank);
		System.out.println(bill1.getNumBill());
		Bill bill2 = new Bill(2, 1000, currencyEN, bank);
		System.out.println(bill2.getNumBill());
		Employe employe1 = new Employe("Отвественный Сотрудник Петрович");
		System.out.println(employe1.getFullName());
		Employe employe2 = new Employe("Безотвественный Сотрудник Петрович");	
		System.out.println(employe2.getFullName());
		Post post = new Post("Управляющий вкладами");
		Work work1 = new Work(bank, post, employe1);
		System.out.println(work1.getBank() + " " + post.getPostName() + " " + employe1.getFullName());
		Work work2 = new Work(bank, post, employe2);
		System.out.println(work2.getBank() + " " + post.getPostName() + " " + employe2.getFullName());
		Client client1 = new Client("ХорошийВкладчик Иван Иванович", employe2, bill2);
		System.out.println("Полное имя клиента: " + client1.getFullName() + " Обслуживающий сотрудник: " + employe2.getFullName() + " Номер счета: " + bill2.getNumBill() + " Баланс: " + bill2.getMoney() + " " + bill2.getCurency());
		Client client2 = new Client("ПлохойВкладчик Сергей Иванович", employe1, bill1);
		System.out.println("Полное имя клиента: " + client2.getFullName() + " Обслуживающий сотрудник: " + employe1.getFullName() + " Номер счета: " + bill1.getNumBill() + " Баланс: " + bill1.getMoney() + " " + bill1.getCurency());
		
		
		bank.print(); //вызов интерфейса
		
		try {
			currencyEN.setCurName("");
			
			
		} catch (EmptyException h) {
			System.out.println(h.warning());
		}
	}

}
