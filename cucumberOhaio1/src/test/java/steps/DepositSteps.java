package steps;

import org.junit.Assert;

import cucumberOhaio1.cucumberOhaio1.Bank;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DepositSteps {
	Bank bank;
	
	@Given("I have an account with {int} amount.")
	public void i_have_an_account_with_amount(Integer init) {
	bank = new Bank (init);	
	 
		
	}

	@When("I deposit {int} amount in my account.")
	public void i_deposit_amount_in_my_account(Integer some) {
		bank.deposit(some);
		
	   	}
	@When("I withdraw {int} amount from my account.")
	public void i_withdraw_amount_from_my_account(Integer some) {
	bank.withdraw(some);	
	}
	@Then("I verify the balance will be {int} in my account.")
	public void i_verify_the_balance_will_be_in_my_account(Integer expectedBal) {
	int currentBalance = bank.getBalance();
	Integer acctualBalance = new Integer (currentBalance);
	Assert.assertEquals(expectedBal, acctualBalance);
	}

	@Then("I verifiy the balance will be {int} in my account.")
	public void i_verifiy_the_balance_will_be_in_my_account(Integer expectedBal) {
	int currentBalance = bank.getBalance();	
	Integer actualBalance = new Integer(currentBalance);
	Assert.assertEquals(expectedBal, actualBalance);
	
	  }
}