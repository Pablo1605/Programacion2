package CodificacionDelUml;

public class Main {
    public static void main(String[] args) {
        Guerrero g1 = new Guerrero(10,"Arturo",100,"Espada",50);
        Mago m1 = new Mago(9,"Gandalf",130,12,"Fuego");
        Picaro p1 = new Picaro(5,"Legolas",90,"Daga","Sigilo");

        int damage = g1.atacar();
        m1.defender(damage);

        damage = m1.atacar();
        g1.defender(damage);
    }
}
