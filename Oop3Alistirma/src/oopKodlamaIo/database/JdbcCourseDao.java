package oopKodlamaIo.database;

import oopKodlamaIo.entities.Education;

public class JdbcCourseDao implements CourseDao{
    @Override
    public void add(Education education) {
        System.out.println("jdbc girişi yapıldı..");
    }
}
