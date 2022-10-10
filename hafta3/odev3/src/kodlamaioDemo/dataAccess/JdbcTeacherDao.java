package kodlamaioDemo.dataAccess;

import kodlamaioDemo.entities.Teacher;

public class JdbcTeacherDao implements ITeacherDao{

    @Override
    public void add(Teacher teacher) {
        System.out.println("Jdbc ile veritabanına eklendi.");
    }
}
