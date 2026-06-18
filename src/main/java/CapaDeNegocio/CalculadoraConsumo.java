package CapaDeNegocio;

public class CalculadoraConsumo {
   if (potenciaUnit <= 0 || cantidad <= 0) {
    throw new IllegalArgumentException("Valores inválidos");
    }
// Calcula consumo total en watts

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

    public double calcularUPS(double potenciaUnit, int cantidad) {
    double total = calcularTotal(potenciaUnit, cantidad);
    double margen = calcularMargen(total);
    return calcularCapacidadUPS(total, margen);
}
}
