package oopKodlamaIo;

import oopKodlamaIo.business.CourseManager;
import oopKodlamaIo.database.HibernateCourseDao;
import oopKodlamaIo.entities.Education;
import oopKodlamaIo.loggers.DataBaseLogger;
import oopKodlamaIo.loggers.FileLogger;
import oopKodlamaIo.loggers.LoggerDao;
import oopKodlamaIo.loggers.MailLogger;

public class Main {
    public static void main(String[] args) throws Exception {
        Education education=new Education("Java Kursu","Engin Demirog",10);
        LoggerDao[] loggerDaos={new FileLogger(),new MailLogger(),new DataBaseLogger()};
        CourseManager courseManager=new CourseManager(new HibernateCourseDao(),loggerDaos);
        courseManager.add(education);

    }
}
