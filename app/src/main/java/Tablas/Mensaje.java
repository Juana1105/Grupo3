package Tablas;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

import java.time.LocalDate;

public class Mensaje implements Parcelable {
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

    protected Mensaje(Parcel in) {
        id = in.readInt();
        emisor = in.readString();
        receptor = in.readString();
        tituloMensaje = in.readString();
        mensaje = in.readString();
    }

    public static final Creator<Mensaje> CREATOR = new Creator<Mensaje>() {
        @Override
        public Mensaje createFromParcel(Parcel in) {
            return new Mensaje(in);
        }

        @Override
        public Mensaje[] newArray(int size) {
            return new Mensaje[size];
        }
    };

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(emisor);
        dest.writeString(receptor);
        dest.writeString(tituloMensaje);
        dest.writeString(mensaje);
    }
}
