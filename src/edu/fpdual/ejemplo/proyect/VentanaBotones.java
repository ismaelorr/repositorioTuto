package edu.fpdual.ejemplo.proyect;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VentanaBotones extends JFrame implements ActionListener {

        private ArrayList <JButton> botones = new ArrayList<>();

        public VentanaBotones(){
            super("Ventana Ejecución");
            propiedades();
            crearBotones();
        }

        public void propiedades(){
            this.setSize(200,200);
            this.setLayout(new FlowLayout());
            this.setLocation(200,200);
        }

        public void crearBotones(){
            for(int i=0;i<6;i++){
                botones.add(new JButton("boton"+(i+1)));
                botones.get(i).addActionListener(this);
                add(botones.get(i));
            }
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand()==botones.get(0).getText()){
            new Ejer1();
        }
        else if(e.getActionCommand()==botones.get(1).getText()){
            new Ejer2();
        }
        else if(e.getActionCommand()==botones.get(2).getText()){
            new Ejer3();
        }
        else if(e.getActionCommand()==botones.get(3).getText()){
            new Ejer4();
        }
        else if(e.getActionCommand()==botones.get(4).getText()){
            new Ejer5();
        }
        if(e.getActionCommand()==botones.get(5).getText()){
            new Ejer6();
        }
    }

    public static void main(String[] args) {
        new VentanaBotones().setVisible(true);
    }
}
