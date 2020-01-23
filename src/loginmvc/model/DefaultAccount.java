/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginmvc.model;

/**
 *
 * @author usuario
 */
public class DefaultAccount implements Account{
    
    private String userName;
    private String password;

    public DefaultAccount(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    
    @Override
    public String getUser() {
        return this.userName;
    }

    @Override
    public String getPassword() {
        return this.password;
    }
    
}
