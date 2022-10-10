package kodlamaioDemo.business;

import kodlamaioDemo.core.logging.ILogger;
import kodlamaioDemo.dataAccess.ITeacherDao;
import kodlamaioDemo.entities.Teacher;

public class TeacherManager {
    private ITeacherDao teacherDao;
    private ILogger[] loggers;

    public TeacherManager (ITeacherDao teacherDao, ILogger[] loggers) {
        this.teacherDao = teacherDao;
        this.loggers = loggers;
    }

    public void add (Teacher teacher) {
        teacherDao.add(teacher);
        for (ILogger logger : loggers) {
            logger.log(teacher.getFirstName()+" "+teacher.getLastName());
        }
    }
}
