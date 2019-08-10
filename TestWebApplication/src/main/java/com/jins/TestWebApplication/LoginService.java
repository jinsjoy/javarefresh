package com.jins.TestWebApplication;

public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("jins") && password.equals("dummy");
	}

}
