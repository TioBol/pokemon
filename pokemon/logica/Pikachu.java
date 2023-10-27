package logica;

public class Pikachu extends Pokemon implements IElectrico{

    public Pikachu() {
    }
    @Override
    public void atacarImpacTrueno() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void atacarPunioTrueno() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void atacarTunderbolt() {
        // TODO Auto-generated method stub
        
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("hola soy Pukachú y voy a usar placaje!");
    }

    @Override
    protected void atacarmordisco() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atacarmordisco'");
    }

    @Override
    protected void atacararaniazo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atacararaniazo'");
    }
    
}
