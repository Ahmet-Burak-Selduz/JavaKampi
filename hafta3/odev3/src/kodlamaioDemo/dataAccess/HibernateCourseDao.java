package kodlamaioDemo.dataAccess;

import kodlamaioDemo.entities.Course;

public class HibernateCourseDao implements ICourseDao {
    @Override
    public void add(Course course) {
        System.out.println("Hibernate ile veritabanına eklendi.");
    }

    @Override
    public boolean isNameAvailable(String name) {
        String[] dbCourseNames= {"C#"};
        for (String courseNames : dbCourseNames) {
            if (courseNames == name)
                return true;
        }
        return false;
    }
}
