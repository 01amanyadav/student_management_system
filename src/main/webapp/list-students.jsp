<%@ page import="com.sms.dao.StudentDAO,com.sms.model.Student" %>
<%
    java.util.List<Student> list = StudentDAO.getAllStudents();
%>

<h2>All Students</h2>
<a href="add-student.jsp">Add Student</a>

<table border="1">
<tr>
    <th>ID</th><th>Name</th><th>Email</th><th>Course</th><th>Age</th><th>Action</th>
</tr>

<% for(Student s : list) { %>
<tr>
    <td><%=s.getId()%></td>
    <td><%=s.getName()%></td>
    <td><%=s.getEmail()%></td>
    <td><%=s.getCourse()%></td>
    <td><%=s.getAge()%></td>
    <td>
        <a href="edit-student.jsp?id=<%=s.getId()%>">Edit</a>
        <a href="deleteStudent?id=<%=s.getId()%>">Delete</a>
    </td>
</tr>
<% } %>
</table>
