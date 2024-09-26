package com.example.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncryptPassword {
	
	/*
		public static void main(String[] args) {
			
			var passwordUser = "";
			var passwordAdmin = "";
				
			System.out.println("User password: " + passwordUser);
			System.out.println("Encrypted user password: " + encryptPassword(passwordUser));
				
			System.out.println("Admin password: " + passwordAdmin);
			System.out.println("Encrypted admin password: " + encryptPassword(passwordAdmin));
			
		}
	*/
	 
	public static String encryptPassword(String password) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		return encoder.encode(password);
	}

}
