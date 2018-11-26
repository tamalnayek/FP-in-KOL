package com.mts;

import com.mts.repository.AccountRepository;
import com.mts.repository.JdbcAccountRepository;
import com.mts.repository.JpaAccountRepository;
import com.mts.service.NEFTTxrService;
import com.mts.service.TxrService;

public class App {

	public static void main(String[] args) {

		//----------------
		// Init
		// ----------------
		System.out.println("------------------------------------------");
		AccountRepository jdbcAccountRepository = new JdbcAccountRepository();
		AccountRepository jpAccountRepository = new JpaAccountRepository();
		TxrService txrService = new NEFTTxrService(jpAccountRepository);
		System.out.println("------------------------------------------");
		
		//----------------
		// Use
		//----------------
		System.out.println("------------------------------------------");
		txrService.transfer(100.00, "1", "2");
		System.out.println();
		txrService.transfer(100.00, "2", "1");
		System.out.println("------------------------------------------");

		//----------------
		// Destroy
		//----------------
		System.out.println("------------------------------------------");
		// clean
		System.out.println("------------------------------------------");

	}

}
