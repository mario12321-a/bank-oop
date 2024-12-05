package org.ies.bank.componentes;

import org.ies.bank.model.Account;
import org.ies.bank.model.Customer;

import java.util.Scanner;

public class AccountReader {
    private final Scanner scanner;
    private final CustomerReader customerReader;

    public AccountReader(Scanner scanner, CustomerReader customerReader) {
        this.scanner = scanner;
        this.customerReader = customerReader;
    }

    public Account read(){
        System.out.println("introduce los datos de la cuenta ");
        System.out.println("IBAN");
        String iban= scanner.nextLine();

        System.out.println("Saldo ");
        double saldo = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("nombre del cliente ");
        Customer customer = customerReader.read();

        return new Account(
                iban,
                saldo,
                customer
        );
    }
}
