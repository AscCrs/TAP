/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Forma2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author AscCrs
 */
public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    MyFrame() {
        this.setSize(640, 480);
        this.setTitle("Practica: Listener metodo 2");
        button = new JButton("Cerrar");
        
        button.addActionListener(this);
       
        this.add(button);
    }
    
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
