package controller;

import model.Grade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.CourseService;

import java.util.List;

@Controller
public class GradeController {
    @Autowired
    private CourseService courseService;

    @RequestMapping("/grades")
    public String showGrade(Model model) {
        List<Grade> grades = courseService.getGrades();
        model.addAttribute("grades", grades);
        return "grades";
    }
}
