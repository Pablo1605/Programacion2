package CodificacionDelUml;

abstract class PersonajeBase implements Personaje{
    int nivel;
    String nombre;
    int puntosDeVida;

    public PersonajeBase(int nivel, String nombre, int puntosDeVida) {
        this.nivel = nivel;
        this.nombre = nombre;
        this.puntosDeVida = puntosDeVida;
    }

    public abstract int atacar();

    public void defender(int damage){
        this.puntosDeVida -= damage;
        if (this.puntosDeVida < 0){
            this.puntosDeVida = 0;
        }
        System.out.println(this.nombre + " recibió "+ damage + " de daño.Puntos de vida restantes: "+ this.puntosDeVida);
    }
}
