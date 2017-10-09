package Blockchain;

public class Transaction {
	
	String sender;
	String recipient;
	Integer amount;
	
	public void main() {
		
	}
	
	//setters
	public void setSender(String s) {
		sender = s;
	}
	public void setRecipient(String r) {
		recipient = r;
	}
	public void setAmount(Integer a) {
		amount = a;
	}
	
	// getters
	public String getSender() {
		return sender;
	}
	public String getRecipient() {
		return recipient;
	}
	public Integer getAmount() {
		return amount;
	}
}
