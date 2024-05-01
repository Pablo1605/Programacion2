package Ejercicio;

public class Prueba {
    private int codigo;
    private String titulo;
    private Instalacion[] instalaciones;
    private int numInstalaciones;

    public Prueba(int codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.instalaciones = new Instalacion[10];
        this.numInstalaciones = 0;
    }

    public void agregarInstalacion(Instalacion instalacion) {
        if (numInstalaciones < instalaciones.length) {
            instalaciones[numInstalaciones] = instalacion;
            numInstalaciones++;
        } else {
            System.out.println("No se pueden agregar más instalaciones. Prueba completa.");
        }
    }

    public int getCodigo() {
        return codigo;
    }
}
