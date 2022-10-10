package kodlamaioDemo.dataAccess;

import kodlamaioDemo.entities.Category;

public interface ICategoryDao {
    void add(Category category);
    boolean isNameAvailable(String name);
}
