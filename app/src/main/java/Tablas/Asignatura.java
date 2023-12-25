package Tablas;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Asignatura implements Parcelable {
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

    protected Asignatura(Parcel in) {
        id = in.readInt();
        asignatura = in.readString();
        curso = in.readInt();
        ciclo = in.readString();
        profesor = in.readString();
    }

    public static final Creator<Asignatura> CREATOR = new Creator<Asignatura>() {
        @Override
        public Asignatura createFromParcel(Parcel in) {
            return new Asignatura(in);
        }

        @Override
        public Asignatura[] newArray(int size) {
            return new Asignatura[size];
        }
    };

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(asignatura);
        dest.writeInt(curso);
        dest.writeString(ciclo);
        dest.writeString(profesor);
    }
}
