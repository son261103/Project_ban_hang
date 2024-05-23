package com.example.jsp_lean_1;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


@WebServlet(name = "home", value = "/home")
public class testController extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/pages/home.jsp");
        res.setContentType("text/html;charset=UTF-8");
        req.setCharacterEncoding("utf-8");
        requestDispatcher.forward(req , res);
    }
}
