package emp1;


import java.sql.SQLException;
import java.util.Scanner;

import emp1.dao.FacultyDao;
import emp1.model.Faculty;

public class Program {
	

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		FacultyDao facDao = new FacultyDao();
		do
		{
			System.out.println("1. for insert\n2 for update\n 3 for delete\n 4 for display 5 for exit");
			int c = Integer.parseInt(sc.nextLine());
			if(c == 1) {
				Faculty fac = new Faculty();
				System.out.println("Enter Name");
				fac.setName(sc.nextLine());
				System.out.println("Enter age");
				fac.setAge(Integer.parseInt(sc.nextLine()));
				System.out.println("Enter Mobile No");
				fac.setMobile(sc.nextLine());
				System.out.println("Enter Qualification");
				fac.setQualification(sc.nextLine());
				int i = facDao.addFaculty(fac);
				if(i!=0) {
					System.out.println("Added successfully");
				}else {
					System.out.println("not added");
				}
			}else if(c == 2) {
				
			}else if(c == 3) {
				
			}else if(c == 4) {
				
			}else if(c==5) {
				break;
			}else {
				System.out.println("Wrong input");
			}
		}while(true);
		sc.close();
	}

}