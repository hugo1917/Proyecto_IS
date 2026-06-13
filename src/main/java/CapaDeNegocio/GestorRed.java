package CapaDeNegocio;
import java.util.List;

public class GestorRed {

    public List<String> calcularVLSM(String ipBase, List<Integer> hosts) {
        System.out.println("Iniciando cálculo VLSM para la red: " + ipBase);
        return null; 
    }

    public boolean validarTopologia(List<Object> nodos) {
        System.out.println("Validando integridad de la topología...");
        if (nodos == null || nodos.isEmpty()) {
            return false;
        }
        return true;
    }
}