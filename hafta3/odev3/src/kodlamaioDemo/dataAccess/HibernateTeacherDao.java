package kodlamaioDemo.dataAccess;

import kodlamaioDemo.entities.Teacher;

public class HibernateTeacherDao implements ITeacherDao{
    @Override
    public void add (Teacher teacher) {
        System.out.println("Hibernate ile veritabanına kaydedildi.");
    }
}
