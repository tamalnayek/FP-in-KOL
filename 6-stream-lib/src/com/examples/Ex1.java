package com.examples;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import com.examples.model.Txn;
import com.examples.model.TxnType;


public class Ex1 {
	
	public static void main(String[] args) {
		
	  List<Txn> allTxns = Arrays.asList(
			new Txn(23123, 1000.00, LocalDate.of(2017, 12, 25), TxnType.DEBIT),
			new Txn(32424, 2000.00, LocalDate.of(2018, 2, 5), TxnType.DEBIT),
			new Txn(45345, 3000.00, LocalDate.of(2018, 1, 15), TxnType.DEBIT),
			new Txn(56756, 3000.00, LocalDate.of(2018, 5, 30), TxnType.CREDIT),
			new Txn(76757, 4000.00, LocalDate.of(2018, 6, 17), TxnType.DEBIT),
			new Txn(85677, 2000.00, LocalDate.of(2018, 8, 16), TxnType.DEBIT),
			new Txn(75677, 5000.00, LocalDate.of(2018, 2, 3), TxnType.CREDIT)
		);
		
	  //--------------------------------------------------------------------
	  
	  allTxns
	  .stream()
	  //.parallel()  // ==> Fork-Join Framework  ==> common-thread-pool  ( 8 )
	  .filter(txn->txn.getType()==TxnType.DEBIT)
	  //.filter(txn->txn.getAmount()>2000)
	  //.map(txn->txn.getAmount())
	  .map(Txn::getAmount)
	  .forEach(System.out::println);
	  
	  //--------------------------------------------------------------------
	  
	  
		
	}

}
