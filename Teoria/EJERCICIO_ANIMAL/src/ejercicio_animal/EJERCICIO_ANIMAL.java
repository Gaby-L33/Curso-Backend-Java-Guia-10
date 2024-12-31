package ejercicio_animal;

import entidad.Animal;
import entidad.Gato;
import entidad.Perro;
import interfaz.Acciones_animales;
import java.util.ArrayList;

public class EJERCICIO_ANIMAL {

    /**
     * Vamos a crear una clase Animal que tenga un método hacerRuido() que
     * devuelva un saludo “Hola”. Luego haremos clase Perro y clase Gato que
     * extiendan de Animal y sobreescriban el método hacerRuido() con el ruido
     * que corresponda a cada uno. Luego, en el main vamos a crear un ArrayList
     * de animales y los siguientes animales Animal a = new Animal(); Animal b =
     * new Perro(); Animal c = new Gato(); Agregaremos a la lista a cada uno y
     * luego, con un for each, recorreremos la lista llamando al método
     * hacerRuido() de cada ítem.
     */
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();
        
        Perro perroProteccion = new Perro();
        Gato gatoProteccion = new Gato();
                
        Animal a = new Animal();
        animales.add(a);
        Animal b = new Perro();
        animales.add(b);
        Animal c = new Gato();
        animales.add(c);
        
        for (Animal aux : animales) {
            System.out.println(aux.hacerRuido());
        }
        
        perroProteccion.proteger();
        gatoProteccion.proteger();
       
    }

}
