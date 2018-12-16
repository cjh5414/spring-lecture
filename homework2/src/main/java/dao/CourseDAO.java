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

    public boolean insert(Course course) {
        int year = 2019;
        int semester = 1;
        String code = course.getCode();
        String name = course.getName();
        String section = course.getSection();
        int credit = course.getCredit();

        String sqlStatement = "insert into courses (year, semester, code, name, section, credit) value (?, ?, ?, ?, ?, ?)";

        return jdbcTemplate.update(sqlStatement, new Object[]{year, semester, code, name, section, credit}) == 1;
    }

    public List<Course> getCourses() {
        String sqlStatement = "select * from courses order by year, semester";

        return jdbcTemplate.query(sqlStatement, new CourseRowMapper());
    }

    public List<Course> getCourses(int year, int semester) {
        String sqlStatement = "select * from courses where year=? and semester=?";

        return jdbcTemplate.query(sqlStatement, new Object[]{year, semester},new CourseRowMapper());
    }

    public List<Grade> getGrades() {
        String sqlStatement = "select year, semester, sum(credit) credit from courses group by year, semester order by year, semester";

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

    public List<Course> getRegisteredCourses() {
        String sqlStatement = "select * from courses where year = 2019 and semester = 1";

        return jdbcTemplate.query(sqlStatement, new CourseRowMapper());
    }

    private class CourseRowMapper implements RowMapper<Course> {
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
    }
}
