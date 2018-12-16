package service;

import dao.CourseDAO;
import model.Course;
import model.Grade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseDAO courseDAO;

    public boolean insert(Course course) {
        return courseDAO.insert(course);
    }

    public List<Grade> getGrades() {
        return courseDAO.getGrades();
    }

    public List<Course> getCourses() {
        return courseDAO.getCourses();
    }

    public List<Course> getCourses(int year, int semester) {
        return courseDAO.getCourses(year, semester);
    }

    public List<Course> getRegisteredCourses() {
        return courseDAO.getRegisteredCourses();
    }
}
