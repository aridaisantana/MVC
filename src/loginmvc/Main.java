/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginmvc;

import loginmvc.controller.LogingCommand;
import loginmvc.persistance.DB.AccountsLoaderDB;
import loginmvc.view.swing.SwingDisplay;

/**
 *
 * @author usuario
 */
public class Main {

    
    public static void main(String[] args) {
        
        AccountsLoaderDB loader = new AccountsLoaderDB();
        SwingDisplay display = new SwingDisplay();
        display.add(new LogingCommand(display, loader));
        display.display();
    }
    
}
