/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginmvc.view.swing;

import java.awt.GridLayout;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import loginmvc.controller.Command;
import loginmvc.view.Display;

/**
 *
 * @author usuario
 */
public class SwingDisplay extends JFrame implements Display {
    
    private Map <String,Command> commands = new HashMap<>();
    private JLabel user,pass;
    private JTextField userName, password;
    private JButton loging;
    private JLabel statusLabel;
    
    public SwingDisplay() {
        createComponents();
        this.add(createPanel());
        this.setTitle("Loging");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
    }

    @Override
    public void display() {
        this.setVisible(true);
    }

    private JPanel createPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,2));
        panel.add(user);
        panel.add(userName);
        panel.add(pass);
        panel.add(password);
        panel.add(loging);
        panel.add(statusLabel);
        return panel;
    }

    private void createComponents() {
        user = new JLabel("User name:");
        pass = new JLabel("Password:");
        userName = new JTextField(20);
        password = new JTextField(20);
        loging = new JButton("loging");
        statusLabel = new JLabel("This updates in reponse to input: ");
        
        loging.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                commands.get("loging").execute();
            }
        });
        
    }
    
    @Override
    public String getName(){
        return this.userName.getText();
    }
    
    @Override
    public String getPassword(){
        return this.password.getText();
    }

    @Override
    public void updateStatusLabel(String result) {
        this.statusLabel.setText(result);
    }

    public void add(Command command){
        commands.put(command.name(), command);
    }
    
}
