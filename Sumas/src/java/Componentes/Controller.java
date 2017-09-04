/**
 * CONTROLADOR
 * Alumno: López Esquivel Andrés
 * Grupo: 5IM8.
 * Version 1.0
 * Fecha: 31/08/2017
 */

/**
 * PACKAGES
 */
package Componentes;

/**
 * IMPORT
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *CLASS CONTROLLER
 */
@WebServlet(name = "Controller", urlPatterns = {"/Controller"})
public class Controller extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            //Creamos las variables correspondientes al número uno, el número dos 
            // y el resultado de dicha suma, la cual se obtendrá del modelo
            int NumeroUno = Integer.parseInt(request.getParameter("NumeroUno"));
            int NumeroDos = Integer.parseInt(request.getParameter("NumeroDos"));
            int ResultadoSuma = 0;
            //Creamos un objeto de la clase Model que funciona como nuestro Modelo
            Model ObjetoModelo = new Model();
            /**
             * Utitilizamos los métodos setNumeroUno y setNumeroDos
             * para guardar los valores de dichas variables dentro de nuestro
             * modelo. 
             */
            ObjetoModelo.setNumeroUno(NumeroUno);
            ObjetoModelo.setNumeroDos(NumeroDos);
            //Obtener el resultado de la suma mediante el método SumaNumeros
            ResultadoSuma = ObjetoModelo.SumaNumeros();
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controller</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>El resultado de la suma es " 
                    + ResultadoSuma + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
