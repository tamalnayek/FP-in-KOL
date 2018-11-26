package com.service;

import java.util.List;

import com.model.Txn;
import com.model.TxnType;

public interface TxnService {

	List<Txn> getTxns(double amount);

	 List<Txn> getTxns(double minAmount, double maxAmount);

	 List<Txn> getTxns(TxnType type);

}