package com.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.lib.Predicate;
import com.lib.TxnUtilLib;
import com.model.Txn;
import com.model.TxnType;


public class TxnServiceImpl implements TxnService {

	private static List<Txn> allTxns = Arrays.asList(
			new Txn(23123, 1000.00, LocalDate.of(2017, 12, 25), TxnType.DEBIT),
			new Txn(32424, 2000.00, LocalDate.of(2018, 2, 5), TxnType.DEBIT),
			new Txn(45345, 3000.00, LocalDate.of(2018, 1, 15), TxnType.DEBIT),
			new Txn(56756, 3000.00, LocalDate.of(2018, 5, 30), TxnType.CREDIT),
			new Txn(76757, 4000.00, LocalDate.of(2018, 6, 17), TxnType.DEBIT),
			new Txn(85677, 2000.00, LocalDate.of(2018, 8, 16), TxnType.DEBIT),
			new Txn(75677, 5000.00, LocalDate.of(2018, 2, 3), TxnType.CREDIT)
		);
	
	
	public List<Txn> getTxns(double amount) {
		//--------------------------------------------
		//way-1 : imperative style  => what + How
		//--------------------------------------------
		/*
			List<Txn> out=new ArrayList<>();
			for(Txn txn:allTxns) {
				if(txn.getAmount()==amount)
					out.add(txn);
			}
			return out;
		*/
		
		//--------------------------------------------
		//way-2 : declarative style ( what ) by local-inner-class
		//--------------------------------------------
		
		/*
			class ByAmount implements Predicate{
				@Override
				public boolean test(Txn txn) {
					return txn.getAmount()==amount;
				}
			}
			return TxnUtilLib.filter(allTxns, new ByAmount());
		*/
		
		//--------------------------------------------
		//way-3 : declarative style ( what ) by anonymous-inner-class
		//--------------------------------------------
			
		/*
		 * 
			Predicate byAmount = new Predicate() {
				@Override
				public boolean test(Txn txn) {
					return txn.getAmount() == amount;
				}
			};
			return TxnUtilLib.filter(allTxns, byAmount);
			
		*/
		
		

		//--------------------------------------------
		//way-4 : declarative style ( what ) by function ==> Functional Programming
		//--------------------------------------------
		Predicate byAmount=(Txn txn)->{
			return txn.getAmount()==amount;
		}; 
		//or
		Predicate byAmount2=txn->txn.getAmount()==amount;
		return TxnUtilLib.filter(allTxns, byAmount2);
		
		
	}
	
	public List<Txn> getTxns(double minAmount, double maxAmount) {
		return TxnUtilLib.filter(allTxns, txn->txn.getAmount()>=minAmount&&txn.getAmount()<=maxAmount);
	}

	public List<Txn> getTxns(TxnType type) {
		return TxnUtilLib.filter(allTxns, txn->txn.getType()==type);
	}

}
