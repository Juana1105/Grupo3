package com.example.grupo3;

public class Modulo {
    private String nombre;
    private String ciclo;
    private int curso;
    private int foto;


    public Modulo() {
    }

    public Modulo(String nombre, String ciclo, int curso, int foto) {
        this.nombre = nombre;
        this.ciclo = ciclo;
        this.curso = curso;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}