package entities;

public class Financing {
	
	private double totalAmount;
	private double income;
	private Integer months;
	
	public Financing() {
	}

	public Financing(double totalAmount, double income, Integer months) {
		this.totalAmount = totalAmount;
		this.income = income;
		this.months = months;
	}
	//valor da entrada
	public double entry() {
		return this.totalAmount * 0.2;
	}
	//valor mensal do financiamento 
	public double quota() {
		return (this.totalAmount * 0.8)/this.months;
	}
	
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public Integer getMonths() {
		return months;
	}
	public void setMonths(Integer months) {
		this.months = months;
	}

	
}
