package com.flaginfo.wdy.commons.util;

import java.security.SecureRandom;
import java.util.UUID;

import javax.ws.rs.ext.ParamConverter.Lazy;

import org.springframework.stereotype.Service;

@Service
@Lazy
public abstract class IdGen {
	
	@SuppressWarnings("unused")
	private static SecureRandom random = new SecureRandom();
	
	public static String uuid(){
		return UUID.randomUUID().toString().replace("-", "");
	}
}
