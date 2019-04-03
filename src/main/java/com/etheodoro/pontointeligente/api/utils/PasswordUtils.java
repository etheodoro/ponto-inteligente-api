package com.etheodoro.pontointeligente.api.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordUtils {

	public static Logger log = LoggerFactory.getLogger(PasswordUtils.class);
	
	public PasswordUtils() {
	}
	
	public static String geraBCrypt(String senha) {
		if (senha == null) {
			return senha;
		}
		
		log.info("Gerando hash com BCrypt");
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(); 
		return encoder.encode(senha);
	}
}
