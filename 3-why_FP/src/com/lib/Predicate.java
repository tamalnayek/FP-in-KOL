package com.lib;

import com.model.Txn;

public interface Predicate {
	boolean test(Txn txn);
}
