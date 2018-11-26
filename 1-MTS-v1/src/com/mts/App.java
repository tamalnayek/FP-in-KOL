package com.mts;

import com.mts.service.NEFTTxrService;

public class App {

	public static void main(String[] args) {

		// ----------------
		// Init
		// ----------------
		System.out.println("------------------------------------------");
		NEFTTxrService txrService = new NEFTTxrService();
		System.out.println("------------------------------------------");
		// ----------------
		// Use
		// //----------------
		System.out.println("------------------------------------------");
		txrService.transfer(100.00, "1", "2");
		System.out.println();
		txrService.transfer(100.00, "2", "1");
		System.out.println("------------------------------------------");
		// ----------------
		// Destroy
		// ----------------
		System.out.println("------------------------------------------");

		// clean
		System.out.println("------------------------------------------");

	}

}
