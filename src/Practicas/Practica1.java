package Practicas;


import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author AscCrs
 */
public class Practica1 {
    public static void main(String[] args) {
        run();
    }
    
    public static void run() {
        JFrame frame = new JFrame("Saludador");        
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Este metodo permite terminar el programa al cerrar la ventana
        
        JLabel lable = new JLabel("Escribe un nombre para saludar");
        JTextField txtF = new JTextField();
        JButton btn = new JButton("Saludar!");
        
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(
                        frame, "Hola " + txtF.getText() + "!!",
                        "Saludo", 
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        
        });
        
        frame.add(lable, BorderLayout.PAGE_START);
        frame.add(txtF, BorderLayout.CENTER);
        frame.add(btn, BorderLayout.PAGE_END);
        
        frame.pack(); //Ajusta el tamanio de la ventana a el tamanio que tienen los componentes
        frame.setVisible(true);
    }
}
