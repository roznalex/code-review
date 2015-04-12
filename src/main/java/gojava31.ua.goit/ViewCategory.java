package gojava31.ua.goit;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/viewcategory")
public class ViewCategory extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        String categoryName = request.getParameter("category");
        Category category = Categories.getCategory(categoryName);
        for (Project project : category.getProjects()) {
            writer.write(String.format("%s<br>", project.getName()));
        }
    }}
