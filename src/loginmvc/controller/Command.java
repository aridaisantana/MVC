/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginmvc.controller;

/**
 *
 * @author usuario
 */
public interface Command {
    void execute();
    String name();
}
