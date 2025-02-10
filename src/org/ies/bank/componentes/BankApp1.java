package org.ies.bank.componentes;

import org.ies.bank.model.Account;
import org.ies.bank.model.Bank;

import java.util.Scanner;

public class BankApp1 {
    private final Scanner scanner;
    private final BankReader bankReader;

    public BankApp1(Scanner scanner, BankReader bankReader) {
        this.scanner = scanner;
        this.bankReader = bankReader;
    }
    public void run(){
        Bank bank = bankReader.read();
        Account account = bank.findAccount("ES0001");
        if(account!=null){
            account.desposit(500);
        }else{
            System.out.println("no existe la cuenta ");
        }
        Account account2 = bank.findAccount("ES0002");
        if(account2!=null){
            account2.desposit(-30);
        }else{
            System.out.println("la cuenta no existe ");
        }
        account.showInfo();
        account2.showInfo();
    }
}
