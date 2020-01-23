/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginmvc.persistance;

import java.util.List;
import loginmvc.model.Account;

/**
 *
 * @author usuario
 */
public interface AccountsLoader {
    public List <Account> accounts();
}
