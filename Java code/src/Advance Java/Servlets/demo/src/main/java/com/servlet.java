package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialException;

public class servlet extends HttpServlet{
    public void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException{
   
         response.setContentType("text/html;charset-UTF-8");

         PrintWriter out;
        try {
            out = response.getWriter();
            out.println("<html>");
            out.println("<h1> Servlet NewServlet at " + request.getContextPath() + "</h1>" );
            String user =  request.getParameter("user");

            out.println("<h2> Welcome + " + user + "</h2>");
            out.println("<body>");
            out.println("</html>");
        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    
         

    }

    @Override
    public void doGet(HttpServletRequest request , HttpServletResponse response) throws  IOException{
        processRequest(request, response);
    }

    @Override
    public void doPost(HttpServletRequest request , HttpServletResponse response) throws  IOException{
        processRequest(request, response);
    }




}
