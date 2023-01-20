package cucumberOhaio1.cucumberOhaio1;

public class Bank {
int balance;
public Bank (int b) {
	balance = b;
}
public int getBalance() {
	return balance;
}
public void withdraw(int amount) {
 balance = balance - amount;
}
public void deposit(int amount) {
 balance = balance + amount;
}
}