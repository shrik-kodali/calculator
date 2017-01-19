package com.sri.calc.server.command;

import com.sri.calc.server.factory.ObjectsFactory;
import com.sri.calc.server.service.Execute;
import com.sri.calc.server.util.OpsUtil;

public class Command {

	Execute ex;
	String op;
	Integer a, b;

	public Command(String op, Integer a, Integer b) {
		this.op = op;
		this.a = a;
		this.b = b;
	}

	public Integer execute() {
		setExecuter(OpsUtil.getOperator(op.toString()), a, b); // Load the Actual Operator class
		return get();
	}

	private void setExecuter(Operator op, Integer a, Integer b) {
		this.ex = ObjectsFactory.getExecuteClass(op, a, b); // Set the Actual Executer class
	}
	
	private Integer get() {
		ex.execute();
		return ex.get();
	}

}
