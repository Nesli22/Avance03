
package modelo;

import java.util.ArrayList;
import modelo.entidades.Comentario;
import modelo.entidades.Publicacion;
import modelo.entidades.Usuario;


public interface Fabrica {
    
    void CrearUsuario(Usuario usuario);
    boolean AutenticarUsuario(String correo, String contraseña);
    boolean ValidarUsuario(String correo);
    Usuario obtenerUsuario(String correo);
    ArrayList<Usuario> obtenerUsuarios();
    
    void CrearPublicacion(Publicacion publicacion);
    ArrayList<Publicacion> obtenerPublicaciones();
    
    void CrearComentario(Comentario comentario);
    ArrayList<Comentario> obtenerComentarios();
}
