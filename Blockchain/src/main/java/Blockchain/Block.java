package Blockchain;

import java.util.ArrayList;

public class Block {

	int index;
	double timestamp;
	ArrayList<Transaction> transaction_list = new ArrayList<>();
	double proof;
	String previous_hash;
	
	
	public void main(String[] args) {
		System.out.println(calc_length());
	}
	
	/* generates a new instance of the object Transaction*/	
	public Transaction new_transaction() {
		Transaction tr = new Transaction();
		return tr;
	}
	public void transactionValues(String s, String r, Integer a, Transaction tr) {
		tr.setSender(s);
		tr.setAmount(a);
		tr.setRecipient(r);		
	}
	
	public void addTrans2List(Transaction tr) {
		transaction_list.add(tr);
	}
	
	/* calculate the lenth of transaction_list */
	public int calc_length() {
		return transaction_list.size();
	}
	
	
	/*
	public hash hash() {
		return hash(index.tostring() + timestamp.toString() + transaction_list.toString() + proof.toString() + previous_hash);
	}
	*/
	
}
