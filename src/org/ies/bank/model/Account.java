package org.ies.bank.model;

import java.util.Objects;

public class Account {
    private String iban;
    private Double saldo;
    private Customer customer;

    public Account(String iban, Double saldo, Customer customer) {
        this.iban = iban;
        this.saldo = saldo;
        this.customer = customer;
    }

    public void showInfo(){
        System.out.println("IBAN " + iban +
                "saldo " + saldo +
                "NIF cliente " + customer.getNif());
    }

    public void desposit(double amount){
        saldo+=amount;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(iban, account.iban) && Objects.equals(saldo, account.saldo) && Objects.equals(customer, account.customer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iban, saldo, customer);
    }

    @Override
    public String toString() {
        return "Account{" +
                "iban='" + iban + '\'' +
                ", saldo=" + saldo +
                ", customer=" + customer +
                '}';
    }
}
