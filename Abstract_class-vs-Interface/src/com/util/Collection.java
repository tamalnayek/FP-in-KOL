package com.util;

public interface Collection<E> {

	// constant state...

	void add(E e);

	void clear();

	default void forEach() {
		// .
	}

}
