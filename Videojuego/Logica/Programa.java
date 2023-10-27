package Videojuego.Logica;

import java.util.ArrayList;

import Videojuego.Logica.Interfaz.VJ;

public class Programa {
    public static void main(String[] args) {

        //creando un objeto y usando un get para probar
        VJ j1 = new VJ(1,"nfs","ps4/ps3/ps2",2,"carreras");
        j1.getCategoria();

        // creando el arraylist

        ArrayList<VJ> listota = new ArrayList<VJ>();

        // creando los 4 juegos más

        VJ j2 = new VJ(2,"Mu","ps4",4,"accion");
        VJ j3 = new VJ(3,"dota","ps3",1,"perder tiempo");
        VJ j4 = new VJ(4,"Lolsito","pc",4,"estrategia");
        VJ j5 = new VJ(5,"mk4","wii",1,"fight");

        listota.add(j1);
        listota.add(j2);
        listota.add(j3);
        listota.add(j4);
        listota.add(j5);

        
        //System.out.println(listota);
    
        for (VJ vj : listota) {
            System.out.println("titulo: "+vj.getTitulo());
            System.out.println("consola: "+vj.getConsola());
            System.out.println("cantidad de jugadores: "+vj.getCantidadDeJugadores());
        }
    
    }    
}
