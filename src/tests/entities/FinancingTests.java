package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;
import tests.factory.FinancingFactory;

public class FinancingTests {
	
	@Test
	public void entryShouldBe20PercenteTotalAmount() {
		double totalAmount = 1000.0;
		double expectedValueEntry = 200.0;
		
		Financing fin = FinancingFactory.createFinancing(totalAmount, 100.0, 5);
		
		Assertions.assertEquals(expectedValueEntry, fin.entry());
	}
	
	@Test
	public void quotaShouldBe80PercenteTotalAmount() {
		double totalAmount = 1000.0;
		double expectedValueQuota = 100.0;
		
		Financing fin = FinancingFactory.createFinancing(totalAmount, 3.000, 8);
		
		Assertions.assertEquals(expectedValueQuota, fin.quota());
	}
	//quota = prestação mensal do financiamento
	@Test
	public void quotaShouldNotBeAHalfIncome() {
		double totalAmount = 1000.0;

		Financing fin = FinancingFactory.createFinancing(totalAmount, 50.0, 8);
		
		Assertions.assertFalse(fin.quota() > fin.getIncome()/2.0, "O valor da prestação não pode ser maior que metade da renda do cliente");
		
	}

}
