package clases;

import interfases.EmitirSonido;

public class Perro extends Animal implements EmitirSonido {

    private String nombre;
    private final String sonido;

    public Perro(String nombre, String sonido, int peso) {
        super(peso);
        this.nombre = nombre;
        this.sonido = sonido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    public void comer() {
        System.out.println("A " + this.getNombre() + " le viene bien cualquier cosa no como al gato");
    }
    
    @Override
    public void CompararPeso (){
        
    }

}
