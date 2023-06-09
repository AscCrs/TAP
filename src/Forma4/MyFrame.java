/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Forma4;

import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author AscCrs
 */
public class MyFrame extends JFrame{
    JButton button;
    MyFrame() {
        this.setSize(640, 480);
        this.setTitle("Practica: Listener Forma 4");
        button = new JButton("Cerrar");
        
        button.addMouseListener(
                new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        System.out.println("X = " + e.getX() + "Y = " + e.getY());
                    }                    
                }
        );
        
       
        this.add(button);
    }
    
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        
        frame.setVisible(true);
    }
}
