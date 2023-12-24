package Tablas;

public class Asignatura {
    private int id;
    private String asignatura;
    private int curso;
    private String ciclo;
    private String profesor;

    public Asignatura(int id, String asignatura, int curso, String ciclo, String profesor) {
        this.id = id;
        this.asignatura = asignatura;
        this.curso = curso;
        this.ciclo = ciclo;
        this.profesor = profesor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }
}
