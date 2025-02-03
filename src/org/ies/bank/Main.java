package org.ies.bank;

import org.ies.bank.componentes.AccountReader;
import org.ies.bank.componentes.BankApp;
import org.ies.bank.componentes.BankReader;
import org.ies.bank.componentes.CustomerReader;
import org.ies.bank.model.Bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        var customerReader = new CustomerReader(scanner);
        var accountReader= new AccountReader(scanner, customerReader);
        var bankReader = new BankReader(scanner, accountReader);
        Bank bank = bankReader.read();

        System.out.println(bank);
        //BankApp bankApp = new BankApp(scanner, bankReader);

        //bankApp.run();
    }
}