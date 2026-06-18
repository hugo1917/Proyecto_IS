package CapaDatos;


public class Dispositivo {

    private String hostname;
    private String ip;
    private String mac;
    private String estado;

    
    public Dispositivo() {
    }

    public Dispositivo(String hostname, String ip, String mac, String estado) {
        this.hostname = hostname;
        this.ip = ip;
        this.mac = mac;
        this.estado = estado;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Dispositivos [Hosts=" + hostname + ", IP=" + ip + ", MAC=" + mac + ", Estado=" + estado + "]";
    }
}
