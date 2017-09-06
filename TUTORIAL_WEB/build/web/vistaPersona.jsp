<%-- 
    Document   : vistaPersona
    Created on : 03-09-2017, 16:16:29
    Author     : luis
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="uml.Persona"%>
<%@page import="modelo.DAOPersona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link href="https://fonts.googleapis.com/css?family=Amatic+SC:700" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Fjord+One" rel="stylesheet">
        <link rel="stylesheet" href="css/animate.min.css">
        <title>sksksk</title>
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
        <link rel="stylesheet" type="text/css" href="css/estilo.css">
    </head>
    <%
        DAOPersona dao = new DAOPersona();
        List<Persona> datos = new ArrayList();
    %>
    <body>

        <nav class="navbar navbar-toggleable-md navbar-inverse bg-inverse">
            <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo02" aria-controls="navbarTogglerDemo02" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <a class="navbar-brand" href="#">Navbar</a>
            <div class="collapse navbar-collapse " id="navbarTogglerDemo02">
                <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
                <a class="nav-link" href="#">Link</a>
                <a class="nav-link disabled" href="#">Disabled</a>
            </div>
        </nav>

        <div class="container-fluid">
            <div class="row">
                <div class="col-12 col-md-6  contenido">
                    <h1 class="text-center">Luis Orellana Sepulveda</h1>
                    <div class="">
                        <p >

                            <img  class="rounded float-right animated bounceInLeft" src="8.svg" >
                            Hola , mi nombre es Luis Orellana Sepulveda ,soy estudiante de la carrera Analista Programador Computacional  de Duoc Uc sede en Maipú.
                            Me encanta la programación , trato de aprender algo nuevo todos los días y estar al tanto de  lo nuevo que nace en este hermoso mundo de la Informática.
                        </p>
                    </div>
                </div>

                <div class=" col-12  col-md-6 contenido2">
                    <table class="table table-inverse">
                        <thead>
                            <tr>
                                <th>Id</th>
                                <th>Nombre</th>
                                <th>Apellido</th>
                                <th>Edad</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                                datos = dao.consulta();
                                for (Persona p : datos) {
                            %>

                            <tr> 
                                <td><%= p.getId()%> </td>
                                <td><%= p.getNombre()%> </td>
                                <td><%= p.getApellidos()%></td>
                                <td><%= p.getEdad()%></td>
                            </tr>

                            <%
                                }
                            %>
                        </tbody>
                    </table>

                </div>
                <div class="col-12 formulario-dao">
                   ¨ <%-- // if (request.getAttribute("respuesta") != null &&  (request.getAttribute("respuesta")) != "0" ) {


                    %>
                    <h3><%=// request.getAttribute("respuesta")%></h3>
                    <%      //request.setAttribute("respuesta", null);
                            //  }
                    --%>
                    <form method="POST" action="SERVPersona">
                        <div class="form-group col-6">
                            <label for="formGroupExampleInput">ID:</label>
                            <input type="text" name="txtId" class="form-control" id="formGroupExampleInput" placeholder="Id">
                        </div>
                        <div class="form-group col-6">
                            <label for="formGroupExampleInput2">Nombre</label>
                            <input type="text" name="txtNombre" class="form-control" id="formGroupExampleInput2" placeholder="Nombre">
                        </div>
                        <div class="form-group col-6">
                            <label for="formGroupExampleInput2">Apellido</label>
                            <input type="text" name="txtApellido"  class="form-control" id="formGroupExampleInput2" placeholder="Apellido">
                        </div>
                        <div class="form-group col-6">
                            <label for="formGroupExampleInput2">Edad</label>
                            <input type="text" name="txtEdad" class="form-control" id="formGroupExampleInput2" placeholder="Edad">
                        </div>
                        <input type="submit" class="btn btn-primary" name="btnInsertar" value="Insertar" >
                        <input type="submit" class="btn btn-warning" name="btnModificar" value="Modificar" >
                        <input type="submit" class="btn btn-danger" name="btnEliminar" value="Eliminar" >
                    </form>

                </div>
            </div>
        </div>

        <!-- jQuery first, then Tether, then Bootstrap JS. -->
        <script src="https://code.jquery.com/jquery-3.1.1.slim.min.js" integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn" crossorigin="anonymous"></script>
        <script src="js/bootstrap.min.js"></script>


    </body>
</html>