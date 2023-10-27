package Videojuego.Logica;

public abstract class Juego {
    protected int codigo;
    protected String titulo;
    protected String consola;
    protected int cantidadDeJugadores;
    protected String categoria;
    
    protected Juego() {
    }
    
    public Juego(int codigo, String titulo, String consola, int cantidadDeJugadores, String categoria) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.consola = consola;
        this.cantidadDeJugadores = cantidadDeJugadores;
        this.categoria = categoria;
    }
    


    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getConsola() {
        return consola;
    }
    public void setConsola(String consola) {
        this.consola = consola;
    }
    public int getCantidadDeJugadores() {
        return cantidadDeJugadores;
    }
    public void setCantidadDeJugadores(int cantidadDeJugadores) {
        this.cantidadDeJugadores = cantidadDeJugadores;
    }
    public String getCategoria() {
       System.out.println("que fue mardito, rescata tu categoría");
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    
    
}
