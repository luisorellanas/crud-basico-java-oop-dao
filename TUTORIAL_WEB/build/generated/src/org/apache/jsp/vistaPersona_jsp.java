package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.List;
import uml.Persona;
import modelo.DAOPersona;

public final class vistaPersona_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("    <head>\n");
      out.write("        <!-- Required meta tags -->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Amatic+SC:700\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Fjord+One\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/animate.min.css\">\n");
      out.write("        <title>sksksk</title>\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/estilo.css\">\n");
      out.write("    </head>\n");
      out.write("    ");

        DAOPersona dao = new DAOPersona();
        List<Persona> datos = new ArrayList();
    
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-toggleable-md navbar-inverse bg-inverse\">\n");
      out.write("            <button class=\"navbar-toggler navbar-toggler-right\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarTogglerDemo02\" aria-controls=\"navbarTogglerDemo02\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">Navbar</a>\n");
      out.write("            <div class=\"collapse navbar-collapse \" id=\"navbarTogglerDemo02\">\n");
      out.write("                <a class=\"nav-link\" href=\"#\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                <a class=\"nav-link\" href=\"#\">Link</a>\n");
      out.write("                <a class=\"nav-link disabled\" href=\"#\">Disabled</a>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-12 col-md-6  contenido\">\n");
      out.write("                    <h1 class=\"text-center\">Luis Orellana Sepulveda</h1>\n");
      out.write("                    <div class=\"\">\n");
      out.write("                        <p >\n");
      out.write("\n");
      out.write("                            <img  class=\"rounded float-right animated bounceInLeft\" src=\"8.svg\" >\n");
      out.write("                            Hola , mi nombre es Luis Orellana Sepulveda ,soy estudiante de la carrera Analista Programador Computacional  de Duoc Uc sede en Maipú.\n");
      out.write("                            Me encanta la programación , trato de aprender algo nuevo todos los días y estar al tanto de  lo nuevo que nace en este hermoso mundo de la Informática.\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\" col-12  col-md-6 contenido2\">\n");
      out.write("                    <table class=\"table table-inverse\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Id</th>\n");
      out.write("                                <th>Nombre</th>\n");
      out.write("                                <th>Apellido</th>\n");
      out.write("                                <th>Edad</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            ");

                                datos = dao.consulta();
                                for (Persona p : datos) {
                            
      out.write("\n");
      out.write("\n");
      out.write("                            <tr> \n");
      out.write("                                <td>");
      out.print( p.getId());
      out.write(" </td>\n");
      out.write("                                <td>");
      out.print( p.getNombre());
      out.write(" </td>\n");
      out.write("                                <td>");
      out.print( p.getApellidos());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( p.getEdad());
      out.write("</td>\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-12 formulario-dao\">\n");
      out.write("                   ¨ ");
      out.write("\n");
      out.write("                    <form method=\"POST\" action=\"SERVPersona\">\n");
      out.write("                        <div class=\"form-group col-6\">\n");
      out.write("                            <label for=\"formGroupExampleInput\">ID:</label>\n");
      out.write("                            <input type=\"text\" name=\"txtId\" class=\"form-control\" id=\"formGroupExampleInput\" placeholder=\"Id\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group col-6\">\n");
      out.write("                            <label for=\"formGroupExampleInput2\">Nombre</label>\n");
      out.write("                            <input type=\"text\" name=\"txtNombre\" class=\"form-control\" id=\"formGroupExampleInput2\" placeholder=\"Nombre\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group col-6\">\n");
      out.write("                            <label for=\"formGroupExampleInput2\">Apellido</label>\n");
      out.write("                            <input type=\"text\" name=\"txtApellido\"  class=\"form-control\" id=\"formGroupExampleInput2\" placeholder=\"Apellido\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group col-6\">\n");
      out.write("                            <label for=\"formGroupExampleInput2\">Edad</label>\n");
      out.write("                            <input type=\"text\" name=\"txtEdad\" class=\"form-control\" id=\"formGroupExampleInput2\" placeholder=\"Edad\">\n");
      out.write("                        </div>\n");
      out.write("                        <input type=\"submit\" class=\"btn btn-primary\" name=\"btnInsertar\" value=\"Insertar\" >\n");
      out.write("                        <input type=\"submit\" class=\"btn btn-warning\" name=\"btnModificar\" value=\"Modificar\" >\n");
      out.write("                        <input type=\"submit\" class=\"btn btn-danger\" name=\"btnEliminar\" value=\"Eliminar\" >\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- jQuery first, then Tether, then Bootstrap JS. -->\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.1.1.slim.min.js\" integrity=\"sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js\" integrity=\"sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js\" integrity=\"sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
