package com.ocbc;

import java.util.HashMap;
import java.util.Map;

public class Account {
    private String username;
    private long balance;
    private Map<String, Long> debtMap;

    public Account(String uname) {
        this.username = uname;
        this.balance = 0;
        debtMap = new HashMap<String, Long>();
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Map<String, Long> getDebtMap() {
        return debtMap;
    }

    public void setDebtMap(Map<String, Long> debtMap) {
        this.debtMap = debtMap;
    }
}
