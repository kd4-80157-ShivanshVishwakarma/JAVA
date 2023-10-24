package com.sunbeam.user;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import sunbeam.com.cand.User;
import sunbeam.com.cand.UserDao;



public class MainTest {
	public static Date parseDate(String str) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		    Date sDate=sdf.parse(str);
		    return sDate;
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int choice;
		User u;
		do {
			System.out.println("1. Add a new user");
			System.out.println("2. Update a user by id");
			System.out.println("3. Find a user by id");
			System.out.println("4. Find all users");
			System.out.println("5. Delete a user by id");
			System.out.println("--------------------------");
			System.out.println("Enter your choice : ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				try(UserDao ud = new UserDao()){
					System.out.println("Adding new user");
					System.out.println("-------------------");
					u=new User();
					System.out.println("Enter first name : ");
					String fName=sc.next();
					System.out.println("Enter last name : ");
					String lName=sc.next();
					System.out.println("Enter email id : ");
					String eMail=sc.next();
					System.out.println("Enter password : ");
					String passWd=sc.next();
					
					System.out.println("Enter date of birth : ");
					String dob=sc.next();
					System.out.println("Enter status : ");
					boolean status=sc.nextBoolean();
					System.out.println("Enter your role : ");
					String role=sc.next();
					Date uDate=parseDate(dob);
					java.sql.Date sDate=new java.sql.Date(uDate.getTime());
					u.setfName(fName);
					u.setlName(lName);
					u.seteMail(eMail);
					u.setPassWd(passWd);
					u.setDob(sDate);
					u.setStatus(status);
					u.setRole(role);
					int cnt=ud.newUser(u);
					System.out.println("Rows affected : "+cnt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 2:
				try(UserDao ud = new UserDao()){
					User us=new User();
					System.out.println("Updating user by Id");
					System.out.println("---------------------");
					System.out.println("Enter user Id");
					int x=sc.nextInt();
					System.out.println("Enter first name : ");
					String fName=sc.next();
					System.out.println("Enter last name : ");
					String lName=sc.next();
					System.out.println("Enter email id : ");
					String eMail=sc.next();
					System.out.println("Enter your role : ");
					String role=sc.next();
					us.setfName(fName);
					us.setlName(lName);
					us.seteMail(eMail);
					us.setRole(role);
					us.setId(x);
					int cnt=ud.update(us);
					System.out.println("Rows affected : "+cnt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 3:
				try(UserDao ud = new UserDao()){
					List<User> uList=new ArrayList<>();
					System.out.println("Finding user by Id");
					System.out.println("---------------------");
					System.out.println("Enter user Id");
					int x=sc.nextInt();
					 uList=ud.findUser(x);
					System.out.println(uList);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 4:
				try(UserDao ud = new UserDao()){
					List<User> uList=new ArrayList<>();
					System.out.println("Finding all user by Id");
					System.out.println("---------------------");
					uList=ud.findAll();
					uList.forEach(m->System.out.println(m));
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 5:
				try(UserDao ud = new UserDao()){
					System.out.println("Deleting user by Id");
					System.out.println("---------------------");
					System.out.println("Enter user Id");
					int x=sc.nextInt();
					int c=ud.deleteBy(x);
					System.out.println("Rows affected : "+c);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}while(choice!=0);
	}

}
