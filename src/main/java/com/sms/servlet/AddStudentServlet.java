package com.sms.servlet;

import com.sms.dao.StudentDAO;
import com.sms.model.Student;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addStudent")
public class AddStudentServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String course = req.getParameter("course");
        int age = Integer.parseInt(req.getParameter("age"));

        Student s = new Student(0, name, email, course, age);
        StudentDAO.addStudent(s);

        resp.sendRedirect("list-students.jsp");
    }
}
