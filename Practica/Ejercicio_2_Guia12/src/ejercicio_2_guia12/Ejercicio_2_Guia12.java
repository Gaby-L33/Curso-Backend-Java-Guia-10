package ejercicio_2_guia12;

import entidad.Electrodomestico;
import entidad.Lavadora;
import entidad.Televisor;
import java.util.ArrayList;

public class Ejercicio_2_Guia12 {

    public static void main(String[] args) {
         //Parte Ejerc 02
//        Lavadora lavadoraObj = new Lavadora();
//        lavadoraObj.crearLavadora();
//        System.out.println(lavadoraObj);
//        Televisor televisorObj = new Televisor();
//        televisorObj.crearTelevisor();
//        System.out.println(televisorObj);

        //Parte Ejerc 03
//       Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
//       para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
//       Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
//       deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
//       televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
//       precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
//       2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
//       electrodomésticos, 2000 para lavadora y 5000 para televisor.
        ArrayList<Electrodomestico> electrodomesticoArrayList = new ArrayList<>();
        Lavadora lavadora1 = new Lavadora(1000d, "Blanco", 'A', 80d, 15);
        Lavadora lavadora2 = new Lavadora(1500d, "Negro", 'F', 60d, 10);
        Televisor televisor1 = new Televisor(500d, "Gris", 'B', 15d, 32, true);
        Televisor televisor2 = new Televisor(500d, "Negro", 'C', 10d, 24, false);
        electrodomesticoArrayList.add(lavadora1);
        electrodomesticoArrayList.add(lavadora2);
        electrodomesticoArrayList.add(televisor1);
        electrodomesticoArrayList.add(televisor2);

        double lavadoras = 0;
        double televisores = 0;
        for (Electrodomestico electrodomesticoobj : electrodomesticoArrayList) {
            //NO BORRAR
            electrodomesticoobj.precioFinal();
            if (electrodomesticoobj instanceof Lavadora) {
                System.out.println("Lavadora: " + electrodomesticoobj.getPrecio());
                lavadoras += electrodomesticoobj.getPrecio();
            }
            if (electrodomesticoobj instanceof Televisor) {
                System.out.println("Televisor: " + electrodomesticoobj.getPrecio());
                televisores += electrodomesticoobj.getPrecio();
            }
        }
        String totales1 = String.format("Total lavadoras: %.2f", lavadoras);
        String totales2 = String.format("Total televisores: %.2f", televisores);
        System.out.println(totales1);
        System.out.println(totales2);
        System.out.println("Total: " + (lavadoras + televisores));
    }
    
}
