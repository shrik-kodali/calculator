package com.sri.calc.server.ops;

import com.sri.calc.server.service.AbstractExecute;

public class MultiplyOperation extends AbstractExecute {

	public MultiplyOperation(Integer a, Integer b) {
		this.a = a;
		this.b = b;
	}

	public void execute() {
		result = a * b;
	}

}
