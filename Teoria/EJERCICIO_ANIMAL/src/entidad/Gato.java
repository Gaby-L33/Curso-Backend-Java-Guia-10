package entidad;

import interfaz.Acciones_animales;

public class Gato extends Animal implements Acciones_animales{
    
    @Override
    public String hacerRuido(){
        return("Miau!!");
    } 

    @Override
    public void proteger() {
        System.out.println("El gato está protegiendo su territorio");
    }
    
    
}
