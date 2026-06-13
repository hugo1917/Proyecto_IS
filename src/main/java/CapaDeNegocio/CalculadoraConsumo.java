package CapaDeNegocio;

public class CalculadoraConsumo {
   
    private final double MARGEN_SEGURIDAD = 0.20; // 20%
    private final double FACTOR_POTENCIA = 0.7;    // Watts a VA

    public double calcularTotal(double potenciaUnit, int cantidad) {
        return potenciaUnit * cantidad;
    }

    public double calcularMargen(double consumoTotal) {
        return consumoTotal * MARGEN_SEGURIDAD;
    }

    public double calcularCapacidadUPS(double consumoTotal, double margen) {
        // Fórmula básica: (Total + Margen) / Factor de Potencia
        return (consumoTotal + margen) / FACTOR_POTENCIA;
    }
}
