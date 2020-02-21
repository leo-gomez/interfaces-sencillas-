package clases;

import interfases.Mascota;
import interfases.EmitirSonido;

public class Gato extends Animal implements Mascota, EmitirSonido {

    private String nombre;
    private final String sonido;

    public Gato(String nombre, String sonido, int peso) {
        super(peso);
        this.nombre = nombre;
        this.sonido = sonido;
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
    public void jugar() {
        System.out.println("A " + this.getNombre() + " por mas que lo intentes le chupas un huevo");
    }

    @Override
    public void comer() {
        System.out.println("por mas que tenga comida en el plato sigue queriendo mas ");
    }

    @Override
    public void emitirSonido() {
        System.out.println(this.getSonido() + " dijo el " + this.getNombre());
    }

    @Override
    public String getSonido() {
        return sonido;
    }

    @Override
    public void setSonido(String n) {

    }
    
    @Override
    public void CompararPeso (){
        
    }
}
