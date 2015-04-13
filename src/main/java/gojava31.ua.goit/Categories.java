package gojava31.ua.goit;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@WebServlet("/categories")
public class Categories extends HttpServlet {
    private CategoryManager cm = (CategoryManager) getServletContext().getAttribute("categoryManager");

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
		List<Project> projects = new CopyOnWriteArrayList<Project>();
		projects.add(new Project("1"));
        projects.add(new Project("2"));
        cm.addCategory("IT", projects);
        cm.addCategory("Music", projects);
        cm.addCategory("Films", projects);
     }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        String uri = request.getRequestURI();
        for (Category category : cm.getAllCategories()) {
            writer.write(String.format("<a href=\"/viewcategory?category=%s\">%s</a><br>", category.getName(), category.getName()));
        }
    }
}
