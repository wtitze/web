import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
 
public class Welcome extends HttpServlet {
   @Override
   public void doGet(HttpServletRequest request, HttpServletResponse response)
               throws IOException, ServletException {
      // Set the response message's MIME type
      response.setContentType("text/html;charset=UTF-8");
      // Allocate a output writer to write the response message into the network socket
      PrintWriter out = response.getWriter();
 
      // Write the response message, in an HTML page
      try {
         out.println("<!DOCTYPE html>");
         out.println("<html><head>");
         out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
         out.println("<title>Saluto personalizzato</title></head>");
         out.println("<body>");
         // preleva le informazioni che arrivano dal form (modulo) presente nella pagina form.html
         // notare che come parametro viene utilizzato il name del componente di input (es. <input type=text name=nome />)
         out.println("<h1>Hello, " + request.getParameter("nome") + "</h1>");  // says Hello
         out.println("</body>");
         out.println("</html>");
      } finally {
         out.close();  // Always close the output writer
      }
   }
}
