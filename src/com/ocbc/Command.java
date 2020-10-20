package com.ocbc;

import java.util.Map;

public interface Command {

    void invoke(String[] inputs, Account currentUserAcc, Map<String, Account> userAccounts);
}
