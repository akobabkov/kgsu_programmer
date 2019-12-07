package bank;

public class Work {
	private Bank bank;
	private Post post;
	private Employe employe;
	public Work(Bank bank, Post post, Employe employe) {
		super();
		this.bank = bank;
		this.post = post;
		this.employe = employe;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	public Post getPost() {
		return post;
	}
	public void setPost(Post post) {
		this.post = post;
	}
	public Employe getEmploye() {
		return employe;
	}
	public void setEmploye(Employe employe) {
		this.employe = employe;
	}
	

}
