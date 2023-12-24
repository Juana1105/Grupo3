package Tablas;

import java.time.LocalDate;

public class Tarea {
    private int id;
    private int asignatura;
    private String tituloTarea;
    private String descripcion;
    private LocalDate fechaEntrega;

    public Tarea(int id, int asignatura, String tituloTarea, String descripcion, LocalDate fechaEntrega) {
        this.id = id;
        this.asignatura = asignatura;
        this.tituloTarea = tituloTarea;
        this.descripcion = descripcion;
        this.fechaEntrega = fechaEntrega;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(int asignatura) {
        this.asignatura = asignatura;
    }

    public String getTituloTarea() {
        return tituloTarea;
    }

    public void setTituloTarea(String tituloTarea) {
        this.tituloTarea = tituloTarea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
}
