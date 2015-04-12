package gojava31.ua.goit;

import java.util.List;

public class Category {
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
        return projects;
    }

    public void addProject(String name) {
        projects.add(new Project(name));
    }
}
