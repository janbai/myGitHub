package ocp_self_test;

import java.io.IOException;
import java.sql.SQLException;

public class Testtest {
public static void main(String[] args) {
	
	SQLException exi = new SQLException();
	System.out.println(exi.getSQLState());
	System.out.println(exi.getErrorCode());
	
	
	try {
		if(true) throw new SQLException("test");
		throw new IOException("test3");
	} catch (SQLException | IOException e) {
		System.out.println(((SQLException) e).getSQLState());
	}

} }