package main;

import clases.Gato;
import clases.Perro;
import clases.Pez;
import java.util.ArrayList;

public class main {

    public static void main(String[] args) {

        ArrayList<Gato> gato = new ArrayList<>();
        Gato gato1 = new Gato("Macri", "MIAU MIAU", 5);
        Gato gato2 = new Gato("michin", "MEOU MEOU", 10);
        gato.add(gato1);
        gato.add(gato2);

        ArrayList<Pez> pez = new ArrayList<>();
        Pez pez1 = new Pez("Tirael", 1);
        Pez pez2 = new Pez("atun", 1);
        pez.add(pez1);
        pez.add(pez2);

        ArrayList<Perro> perro = new ArrayList<>();
        Perro perro1 = new Perro("firulais", "miau ", 20);
        Perro perro2 = new Perro("calabresa", "GUAU GUAU", 35);

        System.out.println("==================================");
        gato1.jugar();
        gato1.comer();
        gato1.emitirSonido();
        System.out.println("==================================");
        gato2.jugar();
        gato2.comer();
        gato2.emitirSonido();
        System.out.println("==================================");
        pez1.comer();
        pez1.jugar();
        System.out.println("==================================");
        pez2.comer();
        pez2.jugar();
        System.out.println("==================================");
        perro1.emitirSonido();
        perro1.comer();
        System.out.println("==================================");
        perro2.comer();
        perro2.emitirSonido();
        System.out.println("==================================");

    }

}
