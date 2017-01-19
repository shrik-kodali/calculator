package com.sri.calc.server.command;

public enum Operator {

	PLUS("+", 1, "PlusOperation"), MINUS("-", 1, "SubtractOperation"), DIVIDE("/", 2, "DevideOperation"), MULTIPLY("*",	2, "MultiplyOperation");
	// Add Any user defined Operands, it's precedence and it's className here
	public String a;
	public Integer p;
	String clazz; 	//TODO use clazz to create instance on the fly in Objects Factory, in case of many operators  

	Operator(String a, Integer p, String clazz) {
		this.a = a;
		this.p = p;
		this.clazz = clazz;
	}

}
