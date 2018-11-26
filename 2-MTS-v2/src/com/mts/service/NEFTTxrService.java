package com.mts.service;

import org.apache.log4j.Logger;

import com.mts.model.Account;
import com.mts.repository.AccountRepository;

/*
 * ----------------------------------------------------------------------
 *  design & performance issues
 *  ----------------------------------------------------------------------
 *  
 *  => tight-coupling b/w dependent & dependency
 *  		-> can't extend with new features easily
 *  => too many duplicate dependency instances are created & discarded
 *  		-> slow, memory/resource use heavy
 *  => unit-testing not possible
 *  		-> dev/bug-fix slow
 *  
 *  ----------------------------------------------------------------------
 *  
 *  why these issues ?
 *  
 *  ==>dependent itself creating it's own dependency
 *  
 *  soln:
 *  
 *  ==> don't create & do Lookup on factory
 * 
 *  limitation on factory-lookup
 *  
 *  ==> factory-location tight-coupling
 *  
 *  best-soln:
 *  
 *  ==> don't create / lookup , get/inject by third-party  ==> IOC
 *  
 *  
 *  how to implement IOC ?
 *  
 *   - dependency injection
 *   - AOP
 *  
 *   
 *   //--------------------------------------------------------------
 *   
		S — Single responsibility principle
		O — Open for extension &  closed for Modification principle
		L — Liskov substitution principle
		I — Interface segregation principle
		D — Dependency Inversion principle
		
	//--------------------------------------------------------------
 *  
 * 
 */

public class NEFTTxrService implements TxrService {

	private static Logger logger = Logger.getLogger("mts");
	private AccountRepository accountRepository;

	public NEFTTxrService(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
		logger.info("NEFTTxrService instance created..");
	}

	@Override
	public boolean transfer(double amount, String fromAccNum, String toAccNum) {

		logger.info("txr-initiated...");

		Account fromAccount = accountRepository.loadAccount(fromAccNum);
		Account toAccount = accountRepository.loadAccount(toAccNum);

		// debit & credit

		accountRepository.updateAccount(fromAccount);
		accountRepository.updateAccount(toAccount);

		logger.info("txr-finshed...");

		return true;

	}

}
