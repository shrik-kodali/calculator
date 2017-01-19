package com.sri.calc.server.factory;

import com.sri.calc.server.command.Operator;
import com.sri.calc.server.ops.DivideOperation;
import com.sri.calc.server.ops.MultiplyOperation;
import com.sri.calc.server.ops.PlusOperation;
import com.sri.calc.server.ops.SubtractOperation;
import com.sri.calc.server.service.Execute;

public class ObjectsFactory {
	
	public static Execute getExecuteClass(Operator o, Integer a, Integer b) {
		Execute e = null;
		//TODO use class.forname to create objects, In case of more number of operations.
		switch (o) {
		case PLUS: e = new PlusOperation(a, b);
			break;
		case MINUS: e = new SubtractOperation(a, b);
			break;
		case DIVIDE: e = new DivideOperation(a, b);
			break;
		case MULTIPLY: e = new MultiplyOperation(a, b);
			break;
		default:
			break;
		}
		return e;

	}

}
