package CodificacionDelUml;

public class Guerrero extends PersonajeBase{
    String arma;
    int nivelDeDefensa;

    public Guerrero(int nivel, String nombre, int puntosDeVida, String arma, int nivelDeDefensa) {
        super(nivel, nombre, puntosDeVida);
        this.arma = arma;
        this.nivelDeDefensa = nivelDeDefensa;
    }

    @Override
    public int atacar() {
        return this.nivel * 2;
    }
}
