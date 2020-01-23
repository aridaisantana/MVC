/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginmvc.view;

/**
 *
 * @author usuario
 */
public interface Display {
    
    void display();
    String getName();
    String getPassword();
    public void updateStatusLabel(String result);
}
