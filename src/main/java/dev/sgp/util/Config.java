package dev.sgp.util;

import java.util.ResourceBundle;

public class Config {
	public static String mail;
	
	static {
		load();
	}
	
	public static final void load(){
		ResourceBundle props = ResourceBundle.getBundle("application");
		
		mail = props.getString("mail");
	}
}
