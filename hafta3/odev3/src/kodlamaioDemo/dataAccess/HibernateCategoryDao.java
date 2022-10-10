package kodlamaioDemo.dataAccess;

import kodlamaioDemo.entities.Category;

public class HibernateCategoryDao implements ICategoryDao {
    @Override
    public void add(Category category){
        System.out.println("Hibernate ile veritabanına eklendi.");
    }

    @Override
    public boolean isNameAvailable(String name) {
        String[] dbCategoryNames= {"Programlama"};
        for (String categoryNames : dbCategoryNames) {
            if (categoryNames == name)
                return true;
        }
        return false;
    }
}
