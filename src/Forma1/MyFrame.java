/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Forma1;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author AscCrs
 */
public class MyFrame extends JFrame {
    JButton button;
    MyFrame() {
        this.setSize(640, 480);
        button = new JButton("Cerrar");
        MyListener Listener = new MyListener();
        button.addActionListener(Listener);
       
        this.add(button);
    }
    
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        
        frame.setVisible(true);
    }
}
