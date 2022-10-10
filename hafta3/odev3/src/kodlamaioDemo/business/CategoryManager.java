package kodlamaioDemo.business;

import kodlamaioDemo.core.logging.ILogger;
import kodlamaioDemo.dataAccess.ICategoryDao;
import kodlamaioDemo.entities.Category;

public class CategoryManager {
    private ICategoryDao categoryDao;
    private ILogger[] loggers;

    public CategoryManager(ICategoryDao categoryDao, ILogger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    public void add(Category category) throws Exception {
        if (categoryDao.isNameAvailable(category.getName())) {
            throw new Exception("Bu isimde kategori daha önce açılmıştır!");
        }
        categoryDao.add(category);
        for (ILogger logger : loggers) {
            logger.log(category.getName());
        }
    }
}
