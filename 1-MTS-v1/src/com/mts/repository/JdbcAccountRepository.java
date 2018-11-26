package com.mts.repository;

import org.apache.log4j.Logger;

import com.mts.model.Account;

public class JdbcAccountRepository {

	private static Logger logger = Logger.getLogger("mts");

	public JdbcAccountRepository() {
		logger.info("JdbcAccountRepository instance created..");
	}

	public Account loadAccount(String num) {
		// ..
		logger.info("loading account " + num);
		return null;
	}

	public void updateAccount(Account account) {
		//
		logger.info("updating account -");
	}

}
