package servicio;

import entidad.Animal;
import entidad.Caballo;
import entidad.Gato;
import entidad.Perro;
import java.util.ArrayList;

public class ServicioAnimal {
    public void mostrarTipo(ArrayList<Animal> animales) {
        for (Animal animal : animales) {
            if (animal instanceof Perro) {
                System.out.println(animal.getNombre() + " es un perro");
            } else if (animal instanceof Gato) {
                System.out.println(animal.getNombre() + " es un gato");
            } else if (animal instanceof Caballo) {
                System.out.println(animal.getNombre() + " es un caballo");
            }
        }
    }
}
