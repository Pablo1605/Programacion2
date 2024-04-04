package CodificacionDelUml;

public class Picaro extends PersonajeBase{
    String arma;
    String hablidadFurtiva;

    public Picaro(int nivel, String nombre, int puntosDeVida, String arma, String hablidadFurtiva) {
        super(nivel, nombre, puntosDeVida);
        this.arma = arma;
        this.hablidadFurtiva = hablidadFurtiva;
    }

    @Override
    public int atacar() {
        return this.nivel * 2 + 5;
    }
}
