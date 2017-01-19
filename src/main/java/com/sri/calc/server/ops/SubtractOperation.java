package com.sri.calc.server.ops;

import com.sri.calc.server.service.AbstractExecute;

public class SubtractOperation extends AbstractExecute {

	public SubtractOperation(Integer a, Integer b) {
		this.a = a;
		this.b = b;
	}

	public void execute() {
		result = a - b;
	}

}
