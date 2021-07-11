package org.acme.getting.started.knative;

public class Account {
    String customerName;
    String accountNumber;
    String accountSortCode;
    String accountType;
    String accountBalance;

    public Account(String customerName, String accountNumber, String accountSortCode, String accountType, String accountBalance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountSortCode = accountSortCode;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountSortCode() {
        return accountSortCode;
    }

    public String getAccountType() {
        return accountType;
    }

    public String getAccountBalance() {
        return accountBalance;
    }


}
