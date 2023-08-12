package oopKodlamaIo.loggers;

import oopKodlamaIo.entities.Education;

public class MailLogger implements LoggerDao{
    @Override
    public void add(Education education) {
        System.out.println("Mail ile loglandı: "+education.getCourseName());
    }
}
