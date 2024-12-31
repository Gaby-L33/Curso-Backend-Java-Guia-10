package entidad;

public class Caballo extends Animal {

    public Caballo() {
    }

    public Caballo(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getAlimento() {
        return alimento;
    }

    @Override
    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public Integer getEdad() {
        return edad;
    }

    @Override
    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String getRaza() {
        return raza;
    }

    @Override
    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void alimentarse() {
//        super.alimentarse();
        System.out.println(this.nombre + " se alimenta de " + this.alimento);
    }
}
