package gojava31.ua.goit;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class Listener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        CategoryManager cm = new CategoryManager();
        servletContextEvent.getServletContext().setAttribute("categoryManager", cm);
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
