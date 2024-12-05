package org.ies.bank.componentes;

import org.ies.bank.model.Account;
import org.ies.bank.model.Bank;

import java.util.Scanner;

public class BankReader {
    private final Scanner scanner;
    private final AccountReader accountReader;

    public BankReader(Scanner scanner, AccountReader accountReader) {
        this.scanner = scanner;
        this.accountReader = accountReader;
    }

    public Bank read(){

        System.out.println("introduce los datos del banco ");
        System.out.println("nombre");
        String name = scanner.nextLine();

        System.out.println("¿cuantas cuentas hay ?");
        int numAccounts = scanner.nextInt();
        scanner.nextLine();

        Account[] accounts= new Account[numAccounts];

        for(int i=0; i<accounts.length; i++){
            accounts[i]=accountReader.read();
        }
        return new Bank(
                name,
                accounts
        );
    }
}
