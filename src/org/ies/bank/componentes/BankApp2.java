package org.ies.bank.componentes;
import org.ies.bank.model.Account;
import org.ies.bank.model.Bank;
import java.util.Scanner;

public class BankApp2 {
    private final Scanner scanner;
    private final BankReader bankReader;

    public BankApp2(Scanner scanner, BankReader bankReader) {
        this.scanner = scanner;
        this.bankReader = bankReader;
    }

    public void run(){
        Bank bank = bankReader.read();

        bank.showAccounts();

        Account account = bank.findAccount("ES0003");
        account.desposit(-50);

        bank.showCustomerAccounts("000X");

        account = bank.findAccount("ES0004");
        account.desposit(300);

        bank.findAccount("ES0001");
    }
}
