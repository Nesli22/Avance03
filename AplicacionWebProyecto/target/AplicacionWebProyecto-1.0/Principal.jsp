
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Principal</title>
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
    
        <header class="headerPrincipal">
            <section>
                <label class="nombreUsuario">Bienvenido, <span>${sessionScope.Usuario.nombre}</span></label>
            </section>
            <form class="buscador" method="POST">
                <input type="text" class="buscar" placeholder="Buscar...">
                <input type="submit" class="btnHeader" value="Buscar">
            </form>
            <section>
                <form action="SvPrincipal" method="GET">
                <input type="submit" class="btnHeader btnCerrarSesion" name="btnCerrarSesion" value="Cerrar Sesion">
                </form>>
            </section>   
        </header>
        <main class="main">
            <section class="muroPrincipal">
                 <form class="publicar" action="SvPrincipal" method="POST">
                <input type="text" class="titulo" name="titulo" placeholder="Titulo">
                <input type="text" class="publicacion" name="contenido" placeholder="Publicación">
                <input type="submit" name="seleccion" value="Publicar">
                <span>${mensajeCorrecto}</span>
                <br>
            </form>
            <section class="muro" id="muro">    
                <c:forEach var="publicacion" items="${sessionScope.Publicaciones}">
                    <form class="panel" action="SvPrincipal" method="POST">
                        <label class="lblUsuario"><span>${publicacion.nombreUsuario}</span></label>
                        <input type="text" class="titulo" name="titulo" value="${publicacion.titulo}">
                        <input type="text" class="publicacion" name="contenido" value="${publicacion.contenido}">
                        <label class="lblPanel">Fecha de creacion:<span>${publicacion.fechaCreacion}</span></label>
                        <label class="lblPanel">Comentarios</label>
                        <input type="text" class="comentario" name="comentario" placeholder="Agregar comentario">
                        <input type="submit" name="seleccion" value="Comentar">
                        <c:forEach var="comentario" items="${sessionScope.Comentarios}">
                            <form>
                                 <label class="lblUsuario"><span>${comentario.nombreUsuario}</span></label>
                                 <input type="text" class="comentario" name="comentario" value="${comentario.contenido}">
                                 <label class="lblPanel">Fecha de comentario:<span>${comentario.fecha}</span></label>
                            </form>
                        </c:forEach>
                    </form>                   
                </c:forEach>
            </section>
            </section>
           
        </main>
        <footer class="footerPrincipal">
            <p>Copyright © 2023 Rodrigo Gtz.</p>
        </footer>

    </body>
</html>
