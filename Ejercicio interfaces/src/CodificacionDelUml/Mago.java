package CodificacionDelUml;

public class Mago extends PersonajeBase{
    int nivelPoder;
    String tipoDeMagia;

    public Mago(int nivel, String nombre, int puntosDeVida, int nivelPoder, String tipoDeMagia) {
        super(nivel, nombre, puntosDeVida);
        this.nivelPoder = nivelPoder;
        this.tipoDeMagia = tipoDeMagia;
    }

    @Override
    public int atacar() {
        return this.nivelPoder * 3;
    }
}
