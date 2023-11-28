/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import modelo.Fabrica;
import modelo.FabricaImplementacion;
import modelo.entidades.Usuario;

/**
 *
 * @author Rodrigo Gtz
 */
@WebServlet(name = "SvInicioSesion", urlPatterns = {"/SvInicioSesion"})
public class SvInicioSesion extends HttpServlet {
    
    Fabrica fabrica = new FabricaImplementacion();
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        
        String correo = request.getParameter("correo");
        String contraseña = request.getParameter("contraseña");
        if (this.fabrica.AutenticarUsuario(correo, contraseña)) {

            Usuario usuario = this.fabrica.obtenerUsuario(correo);
            session.setAttribute("Usuario", usuario);
            
            
            session.setAttribute("mensajeIncorrecto", "");
            response.sendRedirect("Principal.jsp");
        } else {
            response.sendRedirect("Inicio.jsp");
            session.setAttribute("mensajeIncorrecto", "Correo y/o contraseña incorrectos.");
            session.setAttribute("mensajeCorrecto", "");
        }
    }
    
//     public void obtenerUsuarioLogueado(HttpServletRequest request){
//        HttpSession session = request.getSession();
//        Object correoObj = session.getAttribute("correoLogueado");
//        String correo = correoObj.toString();
//        Usuario usuario = this.fabrica.obtenerUsuario(correo);
//        session.setAttribute("UsuarioLogueado", usuario);
//       }


}
