package com.techpalle;

import java.sql.SQLException;

public class MyProgram {

	public static void main(String[] args) 
	{
		A a = new A();
		
		// a.creating();
		
		try 
		{
			a.deleting(3);
		}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
	}

}
