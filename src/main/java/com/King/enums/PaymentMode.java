package com.King.enums;

public enum PaymentMode {
	CREADIT_CARD("CreditCard"), DEBIT_CARD("DebitCard"), CHEQUE("Cheque"), DEFAULT("");

	private String value;

	private PaymentMode(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

	public static PaymentMode getByValue(String value) {
		return PaymentMode.valueOf(value);
	}
}
