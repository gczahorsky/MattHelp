package com;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * Created by grantzahorsky on 4/7/17.
 */
@WebServlet(name = "Servlet2")
public class Servlet2 extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getParameter("button1") != null) {
            System.out.println("WOO");
            System.out.flush();
        }
    }
}
