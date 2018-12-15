package service;

import dao.CourseDAO;
import model.Grade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseDAO courseDAO;

    public List<Grade> getGrades() {
        return courseDAO.getGrades();
    }
}
