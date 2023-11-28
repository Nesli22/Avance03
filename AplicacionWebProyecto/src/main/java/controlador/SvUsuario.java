/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Date;
import modelo.Fabrica;
import modelo.FabricaImplementacion;
import modelo.entidades.Usuario;


/**
 *
 * @author Rodrigo Gtz
 */
@WebServlet(name = "SvUsuario", urlPatterns = {"/SvUsuario"})
public class SvUsuario extends HttpServlet {

    Fabrica fabrica = new FabricaImplementacion();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            HttpSession session = request.getSession();

            String nombre = request.getParameter("nombre");
            Long telefono = Long.valueOf(request.getParameter("telefono"));
            LocalDate fechaNacimiento = LocalDate.parse(request.getParameter("fechaNacimiento"));
            String correo = request.getParameter("correo");
            String contraseña = request.getParameter("contraseña");
            String genero = request.getParameter("genero");
            String tipoUsuario = request.getParameter("tipoUsuario");
            Usuario user = new Usuario(nombre, telefono, fechaNacimiento, correo, contraseña, genero, tipoUsuario);
            if (this.fabrica.ValidarUsuario(correo)) {
                 response.sendRedirect("Registro.jsp");
                 session.setAttribute("nombre", nombre);
                 session.setAttribute("telefono", telefono);
                 session.setAttribute("fechaNacimiento", fechaNacimiento);
                 session.setAttribute("contraseña", contraseña);            
                 session.setAttribute("mensajeIncorrecto", "El correo ya está registrado. Por favor, ingresa otro correo.");
                 session.setAttribute("mensajeCorrecto", "");
            }else{
                 this.fabrica.CrearUsuario(user);
                 response.sendRedirect("Registro.jsp");
                 session.setAttribute("nombre", "");
                 session.setAttribute("telefono", "");
                 session.setAttribute("fechaNacimiento", "");
                 session.setAttribute("contraseña", "");
                 session.setAttribute("mensajeIncorrecto", "");
                 session.setAttribute("mensajeCorrecto", "Registrado correctamente.");
            }                            
    }
}
