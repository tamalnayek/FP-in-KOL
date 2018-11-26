package com.lib;

import java.util.ArrayList;
import java.util.List;

import com.model.Txn;

public class TxnUtilLib {

	public static List<Txn> filter(List<Txn> in, Predicate predicate) {
		List<Txn> out = new ArrayList<>();
		for (Txn txn : in) {
			if (predicate.test(txn))
				out.add(txn);
		}
		return out;
	}

}
