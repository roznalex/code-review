package gojava31.ua.goit;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CategoryManager {
    private List<Category> categories = new CopyOnWriteArrayList<Category>();

    public Category getCategory(String name) {
        for (Category category : categories) {
            if (category.getName().equals(name)) {
                return category;
            }
        }
        return null;
    }

    public List<Category> getAllCategories() {
        List<Category> clone = new CopyOnWriteArrayList<Category>();
        Collections.copy(clone, categories);
        return clone;
    }

    public void addCategory(String name, List<Project> projects) {
            categories.add(new Category(name, projects));
    }
}