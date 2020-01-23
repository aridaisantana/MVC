/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginmvc.controller;

import java.util.List;
import loginmvc.model.Account;
import loginmvc.persistance.DB.AccountsLoaderDB;
import loginmvc.view.Display;

/**
 *
 * @author usuario
 */
public class LogingCommand implements Command{
    
    private Display display;
    private AccountsLoaderDB accountsLoader;
    private List <Account> accounts;
    
    public LogingCommand(Display display, AccountsLoaderDB accountsLoader) {
        this.display = display;
        this.accountsLoader = accountsLoader;
        this.accounts = accountsLoader.accounts();
    }

    @Override
    public void execute() {
        String result = "Something went wrong";
        
        for (Account a : accounts) {
            if (a.getUser().equals(display.getName()) && a.getPassword().equals(display.getPassword())){
            result = "Loging succesful";
            }
        }
     
        
        display.updateStatusLabel(result);
    }

    @Override
    public String name() {
        return "loging";
    }
    
    
}
