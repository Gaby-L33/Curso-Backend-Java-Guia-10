package entidad;
//Se debe crear también una subclase llamada Televisor con los siguientes atributos:
//resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
//heredados.
public class Televisor extends Electrodomestico{
    protected int pulgadas;
    protected boolean tdt;

    public Televisor() {
    }

    public Televisor(Double precio, String color, Character consumoEnergetico, Double peso, int pulgadas, boolean tdt) {
        super(precio, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.tdt = tdt;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }
//Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
//padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
//los atributos del televisor.
    public void crearTelevisor() {
        super.crearElectrodomestico();
        System.out.println("Ingrese las pulgadas del televisor");
        pulgadas = leer.nextInt();
        System.out.println("Ingrese si tiene TDT (true/false)");
        tdt = leer.nextBoolean();
        precioFinal();
    }
//Método precioFinal(): este método será heredado y se le sumará la siguiente
//funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
//incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
//$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
//también deben afectar al precio.
    public void precioFinal() {
        super.precioFinal();
        if (pulgadas > 40) {
            precio += precio * 0.3;
        }
        if (tdt) {
            precio += 500;
        }
    }

    @Override
    public String toString() {
        return "Televisor{" +
                "pulgadas=" + pulgadas +
                ", tdt=" + tdt +
                ", precio=" + precio +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                '}';
    }
}
