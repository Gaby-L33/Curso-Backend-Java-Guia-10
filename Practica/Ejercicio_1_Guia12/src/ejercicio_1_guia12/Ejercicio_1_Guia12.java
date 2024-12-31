package ejercicio_1_guia12;

import entidad.Animal;
import entidad.Gato;
import entidad.Perro;
import java.util.ArrayList;
import servicio.ServicioAnimal;
import entidad.Caballo;

public class Ejercicio_1_Guia12 {

    /**
     * Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato,
     * Caballo. La clase Animal tendrá como atributos el nombre, alimento, edad
     * y raza del Animal. Crear un método en la clase Animal a través del cual
     * cada clase hija deberá mostrar luego un mensaje por pantalla informando
     * de que se alimenta.
     */
    public static void main(String[] args) {
        ServicioAnimal animalesService = new ServicioAnimal();
        ArrayList<Animal> animales = new ArrayList<>();
        
//        Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
//        generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
//        de rango).

        try{
        Animal perroObj = new Perro("Firulais", "Carne", 7, "Pitbull");
        animales.add(perroObj);
        perroObj.alimentarse();

        Animal gatoObj = new Gato("Pelusa", "Croquetas", 5, "Siames");
        animales.add(gatoObj);
        gatoObj.alimentarse();

        Animal caballoObj = new Caballo("Pegaso", "Alfalfa", 10, "Caballo andaluz");
        animales.add(caballoObj);
        caballoObj.alimentarse();
        
            System.out.println(animales.get(3).getNombre());
            
        } catch(IndexOutOfBoundsException e){
            System.out.println("Excepción capturada: Índice fuera de rango.");
        }

        System.out.println("\nTipo de animal: ");
        animalesService.mostrarTipo(animales);
    }
}
