package com.ocbc;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankCLI {
    private LoginCommand loginCommand;
    private Map<String, Command> commands;
    private Map<String, Account> userAccounts;
    private Account currentUserAccount;

    public BankCLI() {
        commands = new HashMap<>();
        userAccounts = new HashMap<>();
        commands.put("topup", new TopupCommand());
        commands.put("pay", new PayCommand());
        loginCommand = new LoginCommand();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankCLI bankCLI = new BankCLI();
        Map<String, Command> commandMap = bankCLI.getCommands();

        while(sc.hasNextLine()) {

            String line = sc.nextLine().replaceAll("\n", "");

            // return pressed
            if (line.length() == 0) {
                continue;
            }

            // split line into arguments
            String[] inputs = line.split(" ");

            // process arguments
            if (inputs.length > 0) {
                String input = inputs[0];
                Command cmd = commandMap.get(input);

                if(input.equalsIgnoreCase("login")) {
                    bankCLI.setCurrentUserAccount(bankCLI.getLoginCommand().invoke(inputs, bankCLI.getUserAccounts()));
                }else if(cmd != null) {
                   cmd.invoke(inputs, bankCLI.getCurrentUserAccount(), bankCLI.getUserAccounts());
                }else {
                    System.err.println("Unknown command " + cmd);
                }

               /* if (command.equalsIgnoreCase("q")) {
                    System.exit(0);
                } else {
                    Command cmd = commandMap.get(command);
                    if(cmd != null) cmd.invoke(input);
                    else System.err.println("Unknown command " + cmd);
                }*/
            }
        }
    }

    public Map<String, Command> getCommands() {
        return commands;
    }

    public void setCommands(Map<String, Command> commands) {
        this.commands = commands;
    }

    public Map<String, Account> getUserAccounts() {
        return userAccounts;
    }

    public void setUserAccounts(Map<String, Account> userAccounts) {
        this.userAccounts = userAccounts;
    }

    public Account getCurrentUserAccount() {
        return currentUserAccount;
    }

    public void setCurrentUserAccount(Account currentUserAccount) {
        this.currentUserAccount = currentUserAccount;
    }

    public LoginCommand getLoginCommand() {
        return loginCommand;
    }

    public void setLoginCommand(LoginCommand loginCommand) {
        this.loginCommand = loginCommand;
    }
}

