package emp1.dao;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import emp1.model.Faculty;

public class FacultyDao {
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/employees_db", "root", "Koila@2020");
	}

	public int addFaculty(Faculty faculty) throws SQLException {
		Connection con = null;
		int res = 0;
		try {
			con = FacultyDao.getConnection();
			PreparedStatement ps = con
					.prepareStatement("insert into employees (name,age,mobile,qualification) values(?,?,?,?)");

			ps.setString(1, faculty.getName());
			ps.setInt(2, faculty.getAge());
			ps.setString(3, faculty.getMobile());
			ps.setString(4, faculty.getQualification());

			res = ps.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			con.close();
		}
		return res;
	}

	public int updateFaculty(Faculty faculty) throws SQLException {
		Connection con = null;
		int res = 0;
		try {
			con = FacultyDao.getConnection();
			PreparedStatement ps = con.prepareStatement("update faculty set name=?, age=?,mobile=?,qualification=? where id=?");

			ps.setString(1, faculty.getName());
			ps.setInt(2, faculty.getAge());
			ps.setString(3, faculty.getMobile());
			ps.setString(4, faculty.getQualification());
			ps.setInt(5, faculty.getId());
			
			res = ps.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			con.close();
		}
		return res;
	}
}
