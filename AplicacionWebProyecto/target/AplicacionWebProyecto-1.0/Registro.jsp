
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina de registro</title>
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <form class="frm" method="POST" action="SvUsuario">

            <h1 class="titulo">Registro</h1><br>

            <input type="text" id="nombre" name="nombre" placeholder="Nombre completo" value="${nombre}" required>
            <br>

            <input type="tel" id="numero" name="telefono" placeholder="Número de teléfono" value="${telefono}" required>
            <br>

            <input type="date" id="fechaNacimiento" name="fechaNacimiento" value="${fechaNacimiento}" required>
            <br>

            <input type="email" id="email" name="correo" placeholder="Correo electrónico" required>
            <br>

            <input type="password" id="password" name="contraseña" placeholder="Contraseña" value="${contraseña}" required>
            <br>

            <label>Género:</label>
            <section class="contenedorRadios">

                <label><input type="radio" name="genero" value="masculino" > Masculino</label>
                <label><input type="radio" name="genero" value="femenino"> Femenino</label>
                <label><input type="radio" name="genero" value="otro"> Otro</label>
            </section>

            <label>Tipo de Usuario:</label>
            <section class="contenedorRadios">

                <label><input type="radio" name="tipoUsuario" value="general"> General</label>
                <label><input type="radio" name="tipoUsuario" value="administrativo"> Administrativo</label>
            </section>

            <input type="submit" name="btnRegistrarse" value="Registrarse">
            <br>
            <span>${mensajeIncorrecto}</span>
            <span>${mensajeCorrecto}</span>
            <br>
            <a href="Inicio.jsp" class="registrar">Volver</a>
        </form>
    </body>
</html>
