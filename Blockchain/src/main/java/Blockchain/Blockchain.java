package Blockchain;

import java.util.ArrayList;

public class Blockchain {
	
	ArrayList<Block> blockchain;
	Block current_block;

	public static void main(String[] args) {
	}
	
	
	/*    
	 * 	 new Block generates a new instance of 
	 *   the object Block
	 *   										*/
	public void new_block() {
		current_block = new Block();
	}
	
	
	public void mine() {
	//	void hash = current_block.hash();
		
	}
	
	
}
