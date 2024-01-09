package com.example.grupo3;

public class Modulo {
    private int id;
    private String nombre;
    private String ciclo;
    private int curso;
    private int foto;


    public Modulo() {
    }

    public Modulo(int id,String nombre, String ciclo, int curso, int foto) {
        this.id=id;
        this.nombre = nombre;
        this.ciclo = ciclo;
        this.curso = curso;
        this.foto = foto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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