package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")

public class Servlet extends HttpServlet {

    @Override
//agregamos esto ya que estamos sobreescribiendo este metodo
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //luego indicaremos que la respuesta sera del tipo text y el charsetsera del tipo UTF8
        response.setContentType("text/html;charset=UTF-8");
        //ahora solicitaremos la respuesta
        PrintWriter out = response.getWriter();
        String usuario = request.getParameter("usuario");//estamos recuperando el elemento usuario del index
        String password = request.getParameter("password");
        //ahora definiremos una variable tecnologias pero que sera un arreglo
        String tecnologias[] = request.getParameterValues("tecnologia");
        String genero = request.getParameter("genero");
        String ocupacion = request.getParameter("ocupacion");
        String musica[] = request.getParameterValues("musica");
        String comentario = request.getParameter("comentarios");
        //haciendo esto la info queda del lado del servidor
        //, y asi podemos guardarla en una base de datos o enviarla a cualquier parte del servidor segun la necesidad
        //ahora generaremos codigo html para contactar al usuario
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Resultado Servlet</title>");
        out.print("<head>");
        out.print("<body>");
        out.print("<h1>parametros procesados por el servlet:</h1>");
        out.print("<table border=´'1'>");//usamos comilla simple porque usamos atributos de una cadena
        
        out.print("<tr>");//abrimos un nuevo registro
        out.print("<td>");//aqui abrimos una nueva columna
        out.print("<Usuario>");
        out.print("</td>");
        out.print("<td>");
        out.print(usuario);
        out.print("</td>");
       
        out.print("<tr>");//abrimos un nuevo registro
        out.print("<td>");//aqui abrimos una nueva columna
        out.print("<Password>");
        out.print("</td>");
        out.print("<td>");
        out.print(password);
        out.print("</td>");
        out.print("</tr>");
        
        //como en tecnologias tenemos un arreglo hacemos esto
        out.print("<tr>");//abrimos un nuevo registro
        out.print("<td>");//aqui abrimos una nueva columna
        out.print("<Tecnologias>");
        out.print("</td>");
        out.print("<td>");
        for (String tecnologia:tecnologias){
            out.print(tecnologia);
            out.print("/");//si hay varias tecnologias se presentaran separadas por una diagonal
        }
        out.print("</td>");
        out.print("</tr>");
        
        
         out.print("<tr>");//abrimos un nuevo registro
        out.print("<td>");//aqui abrimos una nueva columna
        out.print("<Genero>");
        out.print("</td>");
        out.print("<td>");
        out.print(genero);
        out.print("</td>");
       
        
         out.print("<tr>");//abrimos un nuevo registro
        out.print("<td>");//aqui abrimos una nueva columna
        out.print("<Ocupacion>");
        out.print("</td>");
        out.print("<td>");
        out.print(ocupacion);
        out.print("</td>");
       
        //musica es muy similar a tecnologias salvo que antes de imprimir el valor debo verificar que el usuario haya elegido una opcion
        if (musica!=null){
         out.print("<tr>");//abrimos un nuevo registro
        out.print("<td>");//aqui abrimos una nueva columna
        out.print("<Musica Favorita>");
        out.print("</td>");
        out.print("<td>");
        for (String m:musica){
            out.print(m);
            out.print("/");//si hay varias tecnologias se presentaran separadas por una diagonal
        }}else 
            out.print("musica no seleccionada");
        out.print("</td>");
        out.print("</tr>");
       
        out.print("<tr>");//abrimos un nuevo registro
        out.print("<td>");//aqui abrimos una nueva columna
        out.print("<Comentarios>");
        out.print("</td>");
        out.print("<td>");
        out.print(comentario);
        out.print("</td>");
        
        
        out.print("</tr>");
        out.print("</table>");
        out.print("</body>");
        out.print("</html>");
    }

}
