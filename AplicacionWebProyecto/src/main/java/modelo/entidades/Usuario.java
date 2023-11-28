
package modelo.entidades;

import java.time.LocalDate;
import java.time.LocalTime;

import org.bson.types.ObjectId;

public class Usuario {
    
    private ObjectId id;
    private String nombre;
    private Long telefono;
    private LocalDate fechaNacimiento;
    private String correo;
    private String contraseña;
    private String genero;
    private String tipo;

    public Usuario() {
    }

    public Usuario(String nombre, Long telefono, LocalDate fechaNacimiento, String correo, String contraseña, String genero, String tipo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.correo = correo;
        this.contraseña = contraseña;
        this.genero = genero;
        this.tipo = tipo;
    }

   

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

  

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", telefono=" + telefono + ", fechaNacimiento=" + fechaNacimiento + ", correo=" + correo + ", contrase\u00f1a=" + contraseña + ", genero=" + genero + ", tipo=" + tipo + '}';
    }    
    
}
