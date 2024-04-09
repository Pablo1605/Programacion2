package AsociacionUnidireccional;

public class Main {
    public static void main(String[] args) {
        Universidad u1 =new Universidad("Universidad A");
        Universidad u2 =new Universidad("Universidad B");
        Estudiante e1 = new Estudiante("Estudiante 1",u1);
        Estudiante e2 = new Estudiante("Estudiante 2",u2);

        System.out.println(e1.getNombre()+" pertenece a la universidad: "+ e1.getUniversidadAsociada().getNombre());
        System.out.println(e2.getNombre()+" pertenece a la universidad: "+ e2.getUniversidadAsociada().getNombre());

        e1.cambiarUniversidad(u2);
        System.out.println(e1.getNombre()+" ahora pertenece a la universidad "+e1.getUniversidadAsociada().getNombre());
    }
}
