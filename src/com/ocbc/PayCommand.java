package com.ocbc;

import java.util.Map;

public class PayCommand implements Command {
    @Override
    public void invoke(String[] inputs, Account currentUserAcc, Map<String, Account> userAccounts) {
        Account sourceAccount = currentUserAcc;
        String destinationUser = inputs[1];
        Account destinationUserAccount = userAccounts.get(destinationUser);
        long amount = Integer.parseInt(inputs[2]);
        long transferAmount = (sourceAccount.getBalance() >= amount) ? amount : sourceAccount.getBalance();

        if (sourceAccount.getBalance() > 0) {
            System.out.println("Transferred " + transferAmount + " to " + destinationUser);
            destinationUserAccount.setBalance(destinationUserAccount.getBalance() + transferAmount);
        }

        sourceAccount.setBalance(sourceAccount.getBalance() - amount);
        String displaySourceBalance = sourceAccount.getBalance() > 0 ? String.valueOf(sourceAccount.getBalance())  : "0";
        System.out.println("Your balance is " +  displaySourceBalance);

        if(sourceAccount.getBalance() < 0) {

            Map<String, Long> debtMap = currentUserAcc.getDebtMap();
            Long currentDebt = debtMap.get(destinationUser) != null ? debtMap.get(destinationUser) : 0L;
            debtMap.put(destinationUser,   currentDebt  - (amount - transferAmount));
            System.out.println("Owing " + String.valueOf(debtMap.get(destinationUser) * -1));
        }


    }
}
