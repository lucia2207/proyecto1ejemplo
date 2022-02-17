package com.sofka.proyecto;


import javax.swing.*;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        String usuario ;
        String nrotel ;
        String edad ;
        usuario = JOptionPane.showInputDialog("Nombre de usuario") ;
        nrotel = JOptionPane.showInputDialog("Ingrese su numero de celular") ;
        edad = JOptionPane.showInputDialog("Ingrese su edad") ;
        System.out.println("Bienvenido/a " +usuario+" es un placer para nosotros contar con una persona de "+ edad +" años. " +
                "\n Próximamente nos comunicaremos con usted al numero " + nrotel + "\n Feliz día");
    }
}
