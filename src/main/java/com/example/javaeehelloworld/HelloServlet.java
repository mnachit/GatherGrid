package com.example.javaeehelloworld;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import jakarta.ws.rs.core.Response;

//@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World! mohamed";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        String message = "hello nachit" ;
//        request.setAttribute("saad",message);
//       this.getServletContext().getRequestDispatcher("/WEB-INF/nachit.jsp").forward(request,response);
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>hhh</h1>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        
    }


    public void destroy() {
    }
}