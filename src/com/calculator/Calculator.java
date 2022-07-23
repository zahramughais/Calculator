package com.calculator;

public class Calculator {
	
	//variables
	private double operandOne;
	private String operation;
	private double operandTwo;
	private double results;
	private String longOper ="";
	private String longO ="";
	
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

	public String getLongOper() {
		return longOper;
	}

	public void setLongOper(String longOper) {
		this.longOper = longOper;
	}
	public String getLongO() {
		return longO;
	}
	
	public void setLongO(String longO) {
		this.longO = longO;
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
	

	public void performOperation(String oper) {
		if (oper != "=") {			
			this.setLongO(this.getLongO() + oper + ",");
		} else {
			String[] s = this.getLongOper().split(",");
			String[] o = this.getLongO().split(",");	
				for (int x = 0; x <o.length ; x++) {
					if (o[x].equals("*")) {
						System.out.println(o[x]);
						this.setResults(this.getResults() + Double.parseDouble(s[x]) * Double.parseDouble(s[x+1]));
					} else if (o[x].equals("/")) {
						this.setResults(this.getResults() + Double.parseDouble(s[x]) / Double.parseDouble(s[x+1]));
					}
				}
				for (int x = 0; x <o.length ; x++) {
					if (o[x].equals("+")) {
						System.out.println(o[x]);
						this.setResults(this.getResults() + Double.parseDouble(s[x]));
					} else if (o[x].equals("-")) {
						this.setResults(this.getResults() - Double.parseDouble(s[x]));
					}
				}
		}
	}
	
	public void performOperation(double num) {
		String str = Double.toString(num);
		this.setLongOper(this.getLongOper() + str +",");
		
	}
	
}
