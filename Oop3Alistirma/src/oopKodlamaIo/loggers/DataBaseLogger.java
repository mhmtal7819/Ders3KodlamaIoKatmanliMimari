package oopKodlamaIo.loggers;

import oopKodlamaIo.entities.Education;

public class DataBaseLogger implements LoggerDao{
    @Override
    public void add(Education education) {
        System.out.println("Database ile loglandı: "+education.getCourseName());
    }
}
