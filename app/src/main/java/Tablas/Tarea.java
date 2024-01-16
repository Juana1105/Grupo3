package Tablas;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

import java.time.LocalDate;


public class Tarea {
    private int id;
    private String modulo;
    private String tarea;
    private LocalDate fechaEntrega;

    public Tarea() {
    }

    public Tarea(String modulo, String tarea, LocalDate fechaEntrega) {
        this.modulo = modulo;
        this.tarea = tarea;
        this.fechaEntrega = fechaEntrega;
    }

    public Tarea(int id, String modulo, String tarea, LocalDate fechaEntrega) {
        this.id = id;
        this.modulo = modulo;
        this.tarea = tarea;
        this.fechaEntrega = fechaEntrega;
    }

    public Tarea(String programacion, String tarea) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
}
