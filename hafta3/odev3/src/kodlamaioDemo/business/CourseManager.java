package kodlamaioDemo.business;

import kodlamaioDemo.core.logging.ILogger;
import kodlamaioDemo.dataAccess.ICourseDao;
import kodlamaioDemo.entities.Course;

public class CourseManager {
    private ICourseDao courseDao;
    private ILogger[] loggers;

    public CourseManager(ICourseDao courseDao, ILogger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void add(Course course) throws Exception {
        if (courseDao.isNameAvailable(course.getName())) {
            throw new Exception("Bu isimde kurs daha önce açılmıştır!");
        }
        if (course.getPrice() < 0) {
            throw new Exception("Kurs fiyatı 0 tlden küçük olamaz!");
        }
        courseDao.add(course);
        for (ILogger logger : loggers) {
            logger.log(course.getName());
        }
    }
}
