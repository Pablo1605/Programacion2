package Ejercicio;

public class EquipoNacional {
    private String color;
    private String pais;
    private Atleta[] atletas;
    private int numAtletas;

    public EquipoNacional(String color, String pais) {
        this.color = color;
        this.pais = pais;
        this.atletas = new Atleta[10];
        this.numAtletas = 0;
    }

    public void agregarAtleta(Atleta atleta) {
        if (numAtletas < atletas.length) {
            atletas[numAtletas] = atleta;
            numAtletas++;
        } else {
            System.out.println("No se pueden agregar más atletas. Equipo completo.");
        }
    }

    public double[] obtenerAlturas() {
        double[] alturas = new double[numAtletas];
        for (int i = 0; i < numAtletas; i++) {
            alturas[i] = atletas[i].getAltura();
        }
        return alturas;
    }

    public double[] obtenerPesosExtra() {
        double[] pesosExtra = new double[numAtletas];
        for (int i = 0; i < numAtletas; i++) {
            pesosExtra[i] = atletas[i].hayPesoExtra();
        }
        return pesosExtra;
    }
}
