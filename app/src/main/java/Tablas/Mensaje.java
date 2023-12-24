package Tablas;

import java.time.LocalDate;

public class Mensaje {
    private int id;
    private String emisor;
    private String receptor;
    private String tituloMensaje;
    private String mensaje;
    private LocalDate fechaRealizado;

    public Mensaje(int id, String emisor, String receptor, String tituloMensaje, String mensaje, LocalDate fechaRealizado) {
        this.id = id;
        this.emisor = emisor;
        this.receptor = receptor;
        this.tituloMensaje = tituloMensaje;
        this.mensaje = mensaje;
        this.fechaRealizado = fechaRealizado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    public String getTituloMensaje() {
        return tituloMensaje;
    }

    public void setTituloMensaje(String tituloMensaje) {
        this.tituloMensaje = tituloMensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public LocalDate getFechaRealizado() {
        return fechaRealizado;
    }

    public void setFechaRealizado(LocalDate fechaRealizado) {
        this.fechaRealizado = fechaRealizado;
    }
}
