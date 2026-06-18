package CapaDeNegocio;

public class CalculadorTec {
    public CalculadorTec() {
    }

    private static final double PERDIDA_METRO = 0.003;
    private final double PERDIDA_CONECTOR = 0.75;
    private final double LIMITE_ESTANDAR = 2.10;

    if (longitud < 0 || conectores < 0) return -1;

    public double calcularAtenuacion(double longitud, int conectores) {
        return (longitud * PERDIDA_METRO) + (conectores * PERDIDA_CONECTOR);
    }

    public String evaluarEstado(double atenuacion) {
        return (atenuacion <= LIMITE_ESTANDAR) ? "PASS / DENTRO DE RANGO" : "FAIL / FUERA DE RANGO";
    }
    
    public boolean estaDentroRango(double atenuacion) {
    return atenuacion <= LIMITE_ESTANDAR;
    }
}
