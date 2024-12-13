package org.ies.bank.componentes;

import org.ies.bank.model.Bank;

import java.util.Scanner;

public class BankApp {
        private final Scanner scanner;
        private final BankReader bankReader;

    public BankApp(Scanner scanner, BankReader bankReader) {
        this.scanner = scanner;
        this.bankReader = bankReader;
    }
    public void run(){
        Bank bank = bankReader.read();
        int option;
        do{
            option = chooseOption();
            if(option==1){
                bank.showAccounts();

            }else if (option==2){
                System.out.println("introduce el iban ");
                String iban = scanner.nextLine();
                bank.showAccounts(iban);

            }else if(option==3){
                System.out.println("introduce NIF");
                String nif = scanner.nextLine();
                bank.showCustomerAccounts(nif);

            }else if(option==4){
                System.out.println("introduce el IBAN ");
                String iban = scanner.nextLine();
                System.out.println("¿cuanto dinero va a ingresar? ");
                double amount = scanner.nextDouble();
                scanner.nextLine();
                bank.showCustomerAccounts(iban);
            }
        }while(option!=6);
    }

    private int chooseOption(){
        int option;
        do{
            System.out.println("elige una opcion ");
            System.out.println("1. mostrar cuentas ");
            System.out.println("2. mostrar datos cuenta ");
            System.out.println("3. mostrar cuentas del cliente ");
            System.out.println("4. ingresar ");
            System.out.println("5. Sacar ");
            System.out.println("6. salir ");
            option = scanner.nextInt();
            scanner.nextLine();
        } while(option<1 || option>6);
        return option;
    }
}
