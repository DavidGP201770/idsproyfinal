package idsfinal.org.idsproy;

import org.springframework.data.annotation.Id;

public class Ruta {
    @Id


    private String id;
    private String destino;
    private String distancia;
    private String taprox;
    private String mapa;
    private String servicio;

    public Ruta(String id) {
        this.id = id;
    }

    public Ruta(String id, String destino, String distancia, String taprox, String mapa, String servicio) {
        this.id = id;
        this.destino = destino;
        this.distancia = distancia;
        this.taprox = taprox;
        this.mapa = mapa;
        this.servicio = servicio;
    }

    public Ruta(String destino, String distancia, String taprox, String mapa, String servicio) {
        this.destino = destino;
        this.distancia = distancia;
        this.taprox = taprox;
        this.mapa = mapa;
        this.servicio = servicio;
    }

    public Ruta() {
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

    public String getMapa() {
        return mapa;
    }

    public void setMapa(String mapa) {
        this.mapa = mapa;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }
}
