package gojava31.ua.goit;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class Category {
    private String name;
    private List<Project> projects;

    public Category() {
    }

    public Category(String name) {
        this.name = name;
    }

    public Category(String name, List<Project> projects) {
        this.name = name;
        this.projects = projects;
    }

    public String getName() {
        return name;
    }

    public List<Project> getProjects() {
        List<Project> clone = new CopyOnWriteArrayList<Project>();
        Collections.copy(clone, projects);
        return clone;
    }

    public void addProject(String name) {
        projects.add(new Project(name));
    }
}
