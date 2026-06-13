/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaDeNegocio;

/**
 *
 * @author FRAID
 */
public class CalculadorTec {
    public CalculadorTec() {
    }

    private final double PERDIDA_METRO = 0.003; 
    private final double PERDIDA_CONECTOR = 0.75;
    private final double LIMITE_ESTANDAR = 2.10;

    public double calcularAtenuacion(double longitud, int conectores) {
        return (longitud * PERDIDA_METRO) + (conectores * PERDIDA_CONECTOR);
    }

    public String evaluarEstado(double atenuacion) {
        return (atenuacion <= LIMITE_ESTANDAR) ? "PASS / DENTRO DE RANGO" : "FAIL / FUERA DE RANGO";
    }
}
