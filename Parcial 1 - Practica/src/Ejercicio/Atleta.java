package Ejercicio;

public class Atleta implements Contrato, Math{
    private double altura;
    private int edad;
    private double peso;

    public Atleta(double altura, int edad, double peso) {
        this.altura = altura;
        this.edad = edad;
        this.peso = peso;
    }

    @Override
    public double calculaIMC() {
        return peso / (altura * altura);
    }

    @Override
    public double hayPesoExtra() {
        double imc = calculaIMC();
        if (imc > 25.0) {
            return peso - (25.0 * altura * altura);
        } else {
            return 0.0;
        }
    }

    @Override
    public double tomarPulsaciones() {
        return 0.0;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }
}
