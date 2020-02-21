package clases;

import interfases.Mascota;

public class Pez extends Animal implements Mascota {

    private String nombre;

    public Pez(String nombre, int peso) {
        super(peso);
        this.nombre = nombre;

    }

    @Override
    public void jugar() {
        System.out.println(this.getNombre() + " es un maldito pez cuanto podes interactuar con el ");
    }

    @Override
    public void comer() {
        System.out.println("a " + this.getNombre() + " le interesa un sanguche de milanesa");
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
