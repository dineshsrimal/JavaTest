package com.ocbc;

import java.util.Map;

public class LoginCommand {

    public Account invoke(String[] inputs, Map<String, Account> userAccounts) {
        String username = inputs[1];
        Account account = userAccounts.get(username);

        if(account == null) {
            account = new Account(username);
            userAccounts.put(username, account);
        }

        System.out.println("Hello, " + username + "!");
        System.out.println("Your balance is " + account.getBalance());

        return account;
    }
}

