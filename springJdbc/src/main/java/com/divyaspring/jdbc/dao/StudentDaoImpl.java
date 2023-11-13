package com.divyaspring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.divyaspring.jdbc.entities.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;

//	insert operation
	public int insert(Student student) {
		String insertQuery = "insert into student(id,name,city) values(?,?,?)";
		int result = this.jdbcTemplate.update(insertQuery, student.getId(), student.getName(), student.getCity());
		return result;
	}

//	update operation
	public int change(Student student) {
		String updateQuery = "update student set name =?, city=? where id = ?";
		int result = this.jdbcTemplate.update(updateQuery, student.getName(), student.getCity(), student.getId());
		return result;
	}

//		delete operation
	public int delete(int studentId) {
		String deleteQuery = "delete from student where id = ?";
		int result = this.jdbcTemplate.update(deleteQuery, studentId);
		return result;
	}

//	selecting single student data 
	public Student getStudent(int studentId) {
		String selectQuery = "select * from student where id = ?";
//		anonymous rowMapper object
		RowMapper<Student> rowMapper = new RowMapper<Student>() {
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student student = new Student();
				student.setId(rs.getInt(1));
				student.setName(rs.getString(2));
				student.setCity(rs.getString(3));
				return student;
			}
		};

		Student student = this.jdbcTemplate.queryForObject(selectQuery, rowMapper, studentId);
		return student;
	}

//	select all/multiple data
	public List<Student> getAllStudents() {
		String selectAllQuery = "select * from student";

		List<Student> students = this.jdbcTemplate.query(selectAllQuery, new RowMapperImpl());

		return students;
	}

//	setters & getters
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
