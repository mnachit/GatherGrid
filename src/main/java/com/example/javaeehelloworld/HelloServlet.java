package com.example.javaeehelloworld;

import java.io.*;

import com.example.javaeehelloworld.service.EventService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "", loadOnStartup = 1)
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        EventService service = new EventService();
        message = "Hello World! mohamed";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        String message = "hello nachit" ;
//        request.setAttribute("saad",message);
//       this.getServletContext().getRequestDispatcher("/WEB-INF/nachit.jsp").forward(request,response);
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>"+message+"</h1>");
    }


    public void destroy() {
    }
}