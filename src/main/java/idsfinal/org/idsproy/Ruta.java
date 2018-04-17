package idsfinal.org.idsproy;

import org.springframework.data.annotation.Id;

public class Ruta {
    @Id


    private String id;
    private String destino;
    private String distancia;
    private String taprox;
    private String lat;
    private String lon;
    private String servicio;

    public Ruta() {
    }

    public Ruta(String destino, String distancia, String taprox, String lat, String lon, String servicio) {
        this.destino = destino;
        this.distancia = distancia;
        this.taprox = taprox;
        this.lat = lat;
        this.lon = lon;
        this.servicio = servicio;
    }

    public Ruta(String id, String destino, String distancia, String taprox, String lat, String lon, String servicio) {
        this.id = id;
        this.destino = destino;
        this.distancia = distancia;
        this.taprox = taprox;
        this.lat = lat;
        this.lon = lon;
        this.servicio = servicio;
    }

    public Ruta(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDistancia() {
        return distancia;
    }

    public void setDistancia(String distancia) {
        this.distancia = distancia;
    }

    public String getTaprox() {
        return taprox;
    }

    public void setTaprox(String taprox) {
        this.taprox = taprox;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }
}











