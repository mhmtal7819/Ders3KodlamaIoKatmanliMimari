package oopKodlamaIo.business;

import oopKodlamaIo.database.CourseDao;
import oopKodlamaIo.entities.Education;
import oopKodlamaIo.loggers.LoggerDao;

public class CourseManager {
    private CourseDao courseDao;
    private LoggerDao[] loggers;

    public CourseManager(CourseDao courseDao,LoggerDao[] loggers) {
        this.courseDao = courseDao;
        this.loggers=loggers;
    }

    public void add(Education education) throws Exception {
        if(education.getCoursePrice()<0){
            throw new Exception("Kurs fiyatı sıfırdan küçük olamaz");
        }
        courseDao.add(education);

        for(LoggerDao loggerss:loggers){
            loggerss.add(education);
        }
    }
}
