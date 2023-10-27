package logica;

public abstract class Pokemon {
    //atributos de cada objeto pokemon
    protected int numPokedex; 
    protected String nombrePokemon;
    protected double pesoPokemon;
    protected String sexo;
    protected int temporada;
    //metodos heredados de cada pokemon, serán los metodos comunes de cada pokemon

    protected abstract void atacarPlacaje();
    protected abstract void atacarmordisco();
    protected abstract void atacararaniazo();

}
