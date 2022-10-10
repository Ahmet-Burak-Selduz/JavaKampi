import kodlamaioDemo.business.CategoryManager;
import kodlamaioDemo.business.CourseManager;
import kodlamaioDemo.business.TeacherManager;
import kodlamaioDemo.core.logging.DatabaseLogger;
import kodlamaioDemo.core.logging.EmailLogger;
import kodlamaioDemo.core.logging.FileLogger;
import kodlamaioDemo.core.logging.ILogger;
import kodlamaioDemo.dataAccess.HibernateCategoryDao;
import kodlamaioDemo.dataAccess.HibernateCourseDao;
import kodlamaioDemo.dataAccess.HibernateTeacherDao;
import kodlamaioDemo.dataAccess.JdbcCategoryDao;
import kodlamaioDemo.dataAccess.JdbcCourseDao;
import kodlamaioDemo.dataAccess.JdbcTeacherDao;
import kodlamaioDemo.entities.Category;
import kodlamaioDemo.entities.Course;
import kodlamaioDemo.entities.Teacher;

public class Main {
    public static void main(String[] args) throws Exception {
        ILogger[] loggers = {new DatabaseLogger(), new FileLogger(), new EmailLogger()};

        Course course1 = new Course(1,"Java",800);
        CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers);
        courseManager.add(course1);

        Category category1 = new Category(1,"Tasarım");
        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
        categoryManager.add(category1);

        Teacher teacher1 = new Teacher(1, "Engin", "Demiroğ");
        TeacherManager teacherManager = new TeacherManager(new JdbcTeacherDao(), loggers);
        teacherManager.add(teacher1);
    }
}
