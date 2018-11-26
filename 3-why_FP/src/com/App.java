package com;

import java.util.List;

import com.model.Txn;
import com.service.TxnService;
import com.service.TxnServiceImpl;

public class App {
	
	public static void main(String[] args) {
		
		TxnService txnService=new TxnServiceImpl();
		
		List<Txn> txns=txnService.getTxns(2000.00);
		for(Txn txn:txns) {
			System.out.println(txn);
		}
		
	}

}
