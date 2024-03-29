package co.reto1.dominio;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Multiplicacion {
    private List<Double> numeros;
    private static final int AGREGAR = 0;
    private static final int MULTIPLICAR = 1;

    public double multiplicar() {
        double multiplicacion = 1;
        boolean ciclo = true;
        numeros = new ArrayList<>();
        do {
            try{

                Double num = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese un numero: ", "Multiplicar", JOptionPane.INFORMATION_MESSAGE));
                this.numeros.add(num);
            }
            catch(Exception error){
                JOptionPane.showMessageDialog(null, "Ingrese un numero válido.","Multiplicar", JOptionPane.ERROR_MESSAGE);
                continue;
            }
            if (this.numeros.size() < 2) {
                ciclo = true;
            }
            else {
                int opcion = JOptionPane.showOptionDialog(null, "¿Desea agregar otro número?", "Multiplicar", 0, JOptionPane.INFORMATION_MESSAGE, null, Arrays.asList("Agregar", "Multiplicar").toArray(), null);
                switch (opcion) {
                    case AGREGAR: {
                        ciclo = true;
                        break;
                    }
                    case MULTIPLICAR: {
                        ciclo = false;
                        break;
                    }
                    case JOptionPane.CLOSED_OPTION: {
                        System.exit(0);
                    }
                }
            }
        } while (ciclo);
        for (double num : this.numeros) {
            multiplicacion *= num;
        }
        numeros.clear();
        return multiplicacion;
    }
}
