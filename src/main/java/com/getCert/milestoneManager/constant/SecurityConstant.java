package com.getCert.milestoneManager.constant;

public class SecurityConstant {

	public static final long EXPIRATION_TIME = 604_800_000; //7 days expressed in milliseconds
	
	public static final String TOKEN_PREFIX = "Bearer";
	public static final String JWT_TOKEN_HEADER = "Jwt-Token";
	public static final String TOKEN_CANNOT_BE_VERIFIED = "Token cannot be verified";
	public static final String OFK_LLC = "Omer LLC";
	public static final String OFK_ADMINISTRATION = "Account Manager Portal";
	public static final String AUTHORITIES = "authorities";
	public static final String FORBIDDEN_MESSAGE = "You need to login to access this page";
	public static final String ACCESS_DENIED_MESSAGE = "You do not have permission to access this page";
	public static final String OPTIONS_HTTP_METHOD  = "OPTIONS";
	public static final String[] PUBLIC_URLS = {"/manager/login", "/manager/register", "/manager/resetpassword/**", "/manager/image/**"};
	
	
}
