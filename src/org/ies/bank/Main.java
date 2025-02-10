package org.ies.bank;

import org.ies.bank.componentes.AccountReader;
import org.ies.bank.componentes.BankApp1;
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
        var bankApp1 = new BankApp1(scanner, bankReader);

        bankApp1.run();
    }
}