package oopKodlamaIo.loggers;

import oopKodlamaIo.entities.Education;

public class FileLogger implements LoggerDao{
    @Override
    public void add(Education education) {
        System.out.println("File ile loglandı: "+education.getCourseName());
    }
}
