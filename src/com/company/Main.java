package com.company;

import java.math.BigDecimal;
import java.math.BigInteger;


public class Main {
    public static void main(String[] args) {

        Bank stateBank = new Bank();

        stateBank.bankName = "USA Bank";
        stateBank.bankId = 127;
        stateBank.currency = '\u0024';
        stateBank.clients = 1_999_999_999;
        stateBank.deposits = 32767;
        stateBank.bills = 12_222_222_453L;
        stateBank.sumBills = 252352523f;
        stateBank.sumDeposit = 57543152.2;
        stateBank.isWork = true;

        System.out.println("\nBank name: " + stateBank.bankName);
        System.out.println("\tBank id = " + stateBank.bankId);
        System.out.println("\tCurrency: " + stateBank.currency);
        System.out.println("\tNumber of clients = " + stateBank.clients);
        System.out.println("\tNumber of deposits = " + stateBank.deposits);
        System.out.println("\tNumber of accounts = " + stateBank.bills);
        System.out.println("\nBank info");
        System.out.println("Invoice amount = " + stateBank.sumBills);
        System.out.println("Amount of deposits = " + stateBank.sumDeposit);

        int a = 10_000_000;
        double b = 100.066_123_455;
        double c = 15_500_088.443_311_220_1;

        System.out.println("\n\tTask Two Numbers");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        char d = '\u00A9';
        char e = '\u00B5';
        char f = '\u00AE';

        System.out.println("\n\tTask Three Unicode");
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        int decimal = 1000; // 10-я система исчисления
        int binary = 0b100110100; // 2-я система исчисления
        int octal = 0177; // 8-я система исчисления
        int hexa = 0x128; // 16-я система исчисления

        System.out.println("\n\tTest");
        System.out.println("Decimal " + decimal);
        System.out.println("Binary " + binary);
        System.out.println("Octal " + octal);
        System.out.println("Hexa " + hexa);
        System.out.println(decimal + binary + octal + hexa);
        System.out.println("\r\f");

        System.out.println("\tlarge numbers");
        BigDecimal decimalTest = new BigDecimal("1234567890987654321.09876543211234567890");
        System.out.println(decimalTest);

        BigInteger integer = new BigInteger("1234567890987654321123456789009876543211234567890");
        System.out.println(integer);

    }
}
