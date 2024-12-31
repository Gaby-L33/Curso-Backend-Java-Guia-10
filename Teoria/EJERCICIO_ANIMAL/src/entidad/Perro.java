package entidad;

import interfaz.Acciones_animales;

public class Perro extends Animal implements Acciones_animales {
    
    @Override
    public String hacerRuido(){
        return "Guau Guau!!";
    }

    @Override
    public void proteger() {
        System.out.println("El perro está protegiendo su territorio");
    }
    
    
}
