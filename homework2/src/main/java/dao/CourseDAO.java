package dao;

import model.Course;
import model.Grade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class CourseDAO {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<Course> getCourses() {
        String sqlStatement = "select * from courses";

        return jdbcTemplate.query(sqlStatement, new RowMapper<Course>() {
            @Override
            public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
                Course course = new Course();

                course.setId(rs.getInt("id"));
                course.setYear(rs.getInt("year"));
                course.setSemester(rs.getInt("semester"));
                course.setCredit(rs.getInt("credit"));
                course.setName(rs.getString("name"));
                course.setCode(rs.getString("code"));
                course.setSection(rs.getString("section"));

                return course;
            }

        });
    }

    public List<Grade> getGrades() {
        String sqlStatement = "select year, semester, sum(credit) credit from courses group by year, semester";

        return jdbcTemplate.query(sqlStatement, new RowMapper<Grade>() {
            @Override
            public Grade mapRow(ResultSet rs, int rowNum) throws SQLException {
                Grade grade = new Grade();

                grade.setYear(rs.getInt("year"));
                grade.setSemester(rs.getInt("semester"));
                grade.setCredit(rs.getInt("credit"));

                return grade;
            }

        });
    }
}
