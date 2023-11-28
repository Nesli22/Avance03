
package modelo.entidades;

import java.time.LocalDateTime;
import org.bson.types.ObjectId;

public class Comentario {
    
    private ObjectId ID;
    private String contenido;
    private LocalDateTime fecha;
    private String idUsuario;
    private String nombreUsuario;
   
    public Comentario() {
    }

    public Comentario(String contenido, LocalDateTime fecha, String idUsuario, String nombreUsuario) {
        this.contenido = contenido;
        this.fecha = fecha;
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
    }

    public ObjectId getID() {
        return ID;
    }

    public void setID(ObjectId ID) {
        this.ID = ID;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    
    
}
