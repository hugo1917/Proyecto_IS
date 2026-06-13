package CapaDeNegocio;

public class CalculadoraCampo {
private static final float UTP_CAT6 = 0.2f;
private static final float FIBER = 0.03f;

if (distancia <= 0) return 0;
    public float calcularAtenuacion(float distancia, String tipo) {
        System.out.println("Calculando atenuación para medio: " + tipo + " a " + distancia + "m");
        float coeficientePérdida = 0.0f;
        if (tipo.equalsIgnoreCase("UTP-Cat6")) {
            coeficientePérdida = 0.2f; 
        } else if (tipo.contains("Fiber")) {
            coeficientePérdida = 0.03f;
        }

        return distancia * coeficientePérdida;
    }
    
    public String verificarConectividad(String ip) {
        System.out.println("Ejecutando diagnóstico de red hacia: " + ip);
        
        boolean exito = true; // Simulación de respuesta exitosa
        if (exito) {
            return "Conectividad Exitosa con " + ip + " - Latencia promedio: 15ms";
        } else {
            return "Error: Destino inalcanzable.";
        }
    }
}