package edu.fpdual.ejemplo.proyect;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {

    public Ventana(String texto){
        super(texto);
        setSize(500,500);
        setLocation(100,100);
        setLayout(new FlowLayout());
        add(new JButton("Hola"));
        setVisible(true);
    }


    public static void main(String[] args) {
        new Ventana(args[0]);
    }

}
