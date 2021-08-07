import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import logic.Cart;

import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/hello")
public class MainServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //  Integer count = (Integer) session.getAttribute("count");
//         Integer count = (Integer) session.getAttribute("cart");
//
//        if(count == null) {
//            session.setAttribute("count", 1  );
//            count = 1;
//        } else {
//            session.setAttribute("count", count++ );
//        }
//
//        String name = req.getParameter("name");
//        String surname = req.getParameter("surname");

//        PrintWriter pw = resp.getWriter();
//
//        pw.println("<html>");
//    //    pw.println("<h1>Hello " + name + " " + surname + "</h1>");
//        pw.println("<h1>Your count is " + count + "</h1>");
//        pw.println("</html>");

//        RequestDispatcher dispatcher = req.getRequestDispatcher("/TestJSP.jsp");
//        dispatcher.forward(req, resp);
//        getServletContext().getRequestDispatcher("/showCart.jsp").forward(req, resp);

        HttpSession session = req.getSession();
        String user = (String) session.getAttribute("current_user");

        if(user ==null) {
            //response для анонімного user
            //авторизація
            //реєстрація
            //session.setAttribute("current_user", ID );
        } else {
            //response для авторизованого user
        }
    }


}
