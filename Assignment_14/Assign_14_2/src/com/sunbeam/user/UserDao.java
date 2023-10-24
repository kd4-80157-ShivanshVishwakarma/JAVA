package com.sunbeam.user;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao implements AutoCloseable {
	private Connection con;
	public UserDao() throws SQLException {
		con=DbUtil.getConnection();
	}
	@Override
	public void close() throws Exception {
		try {
			if (con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//1. Adding user
	public int newUser(User u) throws SQLException {
		String sql="insert into users values(default,?,?,?,?,?,?,?)";
		try(PreparedStatement stmt=con.prepareStatement(sql)){
			stmt.setString(1, u.getfName());
			stmt.setString(2, u.getlName());
			stmt.setString(3, u.geteMail());
			stmt.setString(4, u.getPassWd());
			stmt.setDate(5, u.getDob());
			stmt.setBoolean(6, u.isStatus());
			stmt.setString(7, u.getRole());
			int cnt=stmt.executeUpdate();
			return cnt;
		}
	}
	//2.update user by id
	public int update(User us) throws SQLException {
		String sql="update users set first_name=?,last_name=?,email=?,role=? where id=?";
		try(PreparedStatement stmt=con.prepareStatement(sql)){
			stmt.setString(1, us.getfName());
			stmt.setString(2, us.getlName());
			stmt.setString(3, us.geteMail());
			stmt.setString(4, us.getRole());
			stmt.setInt(5, us.getId());
			int cnt=stmt.executeUpdate();
			return cnt;
		}
	}
	//3.Find user by id
	public List<User> findUser(int x) throws SQLException{
		List<User> uList=new ArrayList<>();
		String sql="select * from users where id=?";
		try(PreparedStatement stmt=con.prepareStatement(sql)){
			stmt.setInt(1, x);
			try(ResultSet rs=stmt.executeQuery()){
				while (rs.next()) {
	                int id = rs.getInt("id");
	                String fname = rs.getString("first_name");
	                String lname = rs.getString("last_name");
	                String email = rs.getString("email");
	                String pass = rs.getString("password");
	                Date dob = rs.getDate("dob");
	                boolean status = rs.getBoolean("status");
	                String role = rs.getString("role");
	                User u = new User(id, fname, lname, email, pass, dob, status, role);
	                uList.add(u);
			   }
				return uList;	
	 	    }
	   }
   }
	//4.Find all users
	public List<User> findAll() throws SQLException{
		List<User> uList=new ArrayList<>();
		String sql="select * from users";
		try(PreparedStatement stmt=con.prepareStatement(sql)){
			try(ResultSet rs=stmt.executeQuery()){
				while (rs.next()) {
	                int id = rs.getInt("id");
	                String fname = rs.getString("first_name");
	                String lname = rs.getString("last_name");
	                String email = rs.getString("email");
	                String pass = rs.getString("password");
	                Date dob = rs.getDate("dob");
	                boolean status = rs.getBoolean("status");
	                String role = rs.getString("role");
	                User u = new User(id, fname, lname, email, pass, dob, status, role);
	                uList.add(u);
			   }
					
	 	    }
	   }
		return uList;
   }
	//5.delete a user by id
	public int deleteBy(int x) throws SQLException{
		String sql="delete from users where id=?";
		try(PreparedStatement stmt=con.prepareStatement(sql)){
			stmt.setInt(1, x);
			int cnt=stmt.executeUpdate();
			return cnt;
		}
	}
}
