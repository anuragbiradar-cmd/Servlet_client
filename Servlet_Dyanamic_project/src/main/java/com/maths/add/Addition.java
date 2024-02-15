package com.maths.add;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Addition extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String parameter =req.getParameter("value1");
    int parseInt = Integer.parseInt(parameter);
    String parameter2 = req.getParameter("value2");
    int parseInt2 = Integer.parseInt(parameter2);
    int result=parseInt+parseInt2;
    PrintWriter writer = resp.getWriter();
    writer.print(result);
    
    
}
}
