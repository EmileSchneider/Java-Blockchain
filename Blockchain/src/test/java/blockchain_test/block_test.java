package blockchain_test;

import static org.junit.Assert.*;
import Blockchain.*;

import org.junit.Test;

public class block_test {

	@Test
	public void test() {
		String s = "emile";
		String r = "Laz";
		int a = 5;
		
		Block block = new Block();
		
		Transaction trans = block.new_transaction();
		block.transactionValues(s, r, a, trans);
		block.addTrans2List(trans);
		
		assertEquals(1,block.calc_length());
	}

}
