package oopKodlamaIo.database;

import oopKodlamaIo.entities.Education;

public class HibernateCourseDao implements CourseDao{
    @Override
    public void add(Education education) {
        System.out.println("Hibernate girişi yapıldı..");
    }
}
