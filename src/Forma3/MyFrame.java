/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Forma3;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

/**sss
 * @author AscCrs
 */
public class MyFrame extends JFrame {
    JButton button;
    MyFrame() {
        this.setSize(640, 480);
        button = new JButton("Cerrar");
        
        button.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
       
        this.add(button);
    }
    
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        
        frame.setVisible(true);
    }
}
