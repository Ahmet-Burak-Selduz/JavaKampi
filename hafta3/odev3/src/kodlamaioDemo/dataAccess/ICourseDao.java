package kodlamaioDemo.dataAccess;

import kodlamaioDemo.entities.Course;

public interface ICourseDao {
    void add(Course course);
    boolean isNameAvailable(String name);
}
