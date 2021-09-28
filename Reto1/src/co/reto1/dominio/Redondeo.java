package co.reto1.dominio;

import java.text.DecimalFormat;

public class Redondeo {
    private DecimalFormat numRedondeado = new DecimalFormat("0.00");

    public double redondear(double numero){
        return Double.parseDouble(numRedondeado.format(numero).replace(",", "."));
    }
}//prueba

