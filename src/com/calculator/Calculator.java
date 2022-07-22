package com.calculator;

public class Calculator {
	
	//variables
	private double operandOne;
	private String operation;
	private double operandTwo;
	private double results;
	
	//constructor
	public Calculator() {
	}	
	
	//getters and setters
	public double getOperandOne() {
		return operandOne;
	}
	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public double getOperandTwo() {
		return operandTwo;
	}
	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}
	public double getResults() {
		return results;
	}
	public void setResults(double results) {
		this.results = results;
	}

	//methods
	public void performOperation() {
		String oper = this.getOperation();
		
		if(oper == "+") {
			this.setResults(this.getOperandOne() + this.getOperandTwo());
		} else if (oper == "-") {
			this.setResults(this.getOperandOne() - this.getOperandTwo());
		}

	}
	
}
