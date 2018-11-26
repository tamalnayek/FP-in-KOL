package com.mts.repository;

import com.mts.model.Account;

public interface AccountRepository {
	Account loadAccount(String num);

	Account updateAccount(Account account);
}
