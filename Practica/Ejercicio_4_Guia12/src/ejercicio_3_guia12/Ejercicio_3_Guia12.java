package ejercicio_3_guia12;

import entidades.Circulo;
import entidades.Rectangulo;

public class Ejercicio_3_Guia12 {

    /**
     * Se plantea desarrollar un programa que nos permita calcular el área y el
     * perímetro de formas geométricas, en este caso un círculo y un rectángulo.
     * Ya que este cálculo se va a repetir en las dos formas geométricas, vamos
     * a crear una Interfaz, llamada calculosFormas que tendrá, los dos métodos
     * para calcular el área, el perímetro y el valor de PI como constante.
     * Desarrollar el ejercicio para que las formas implementen los métodos de
     * la interfaz y se calcule el área y el perímetro de los dos. En el main se
     * crearán las formas y se mostrará el resultado final. Área circulo: PI *
     * radio ^ 2 / Perímetro circulo: PI * diámetro. Área rectángulo: base *
     * altura / Perímetro rectángulo: (base + altura) * 2.
     */
    public static void main(String[] args) {
         /**
         * En el main se crearán las formas y se mostrará el
         * resultado final.
         */
        Rectangulo rectangulo1 = new Rectangulo(5d, 10d);
        System.out.println("Area: " + rectangulo1.calcularArea() + " Perimetro: " + rectangulo1.calcularPerimetro());
        Rectangulo rectangulo2 = new Rectangulo(10d, 5d);
        System.out.println("Area: " + rectangulo2.calcularArea() + " Perimetro: " + rectangulo2.calcularPerimetro());
        Circulo circulo1 = new Circulo(5d);
        System.out.println("Area: " + circulo1.calcularArea() + " Perimetro: " + circulo1.calcularPerimetro());
        Circulo circulo2 = new Circulo(10d);
        System.out.println("Area: " + circulo2.calcularArea() + " Perimetro: " + circulo2.calcularPerimetro());
    }

}
