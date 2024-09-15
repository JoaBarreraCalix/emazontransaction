package com.example.emazontransaction.common;

public class Constants {
    //ALL CONSTANTS GO HERE BOI
    public static final String SUPPLY_NOT_FOUND_EXCEPTION = "Supply not found for Article ID: ";

    public static final String SALE_NOT_FOUND_EXCEPTION = "Sale not found for Article ID: ";
    public static final String ARTICLE_ID_NOTNULL = "Article id cannot be null";
    public static final long MIN_SUPPLY_VALUE = 1;
    public static final String MIN_SUPPLY_MESSAGE = "Quantity must be greater than 0";


    public static final long TOKEN_EXPIRATION_TIME_IN_MILLI = 600000;
    public static final String TOKEN_CLAIM_ROLE = "role";
    public static final String TOKEN_SECRET_KEY = "byu45h90tg7qwcphuo234t-80NUOPG34H790345YKO[]asxnuio2345g90hwefp[";
    public static final String LOGIN_USER_NOT_FOUND = "User not found in database";
    public static final String LOGIN_AUTH_HEADER = "Authorization";
    public static final String TOKEN_IS_EXPIRED = "Token is expired";
    public static final String TOKEN_IS_INVALID = "Token is invalid";
    public static final String TOKEN_GENERAL_ERROR = "There is an error with the token";
    public static final String LOGIN_AUTH_HEADER_START = "Bearer ";
    public static final String LOGIN_ROLE_NOT_FOUND = "Role not found";
    public static final String AUX_BODEGA_RESTRAINT = "ADMIN";
    public static final String USER_DUP_EMAIL = "El correo ya está en uso";
    public static final String USER_DUP_DOCID = "El documento de identificación ya está en uso";
    public static final String USER_EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@(.+)$";
    public static final String USER_NUMBER_REGEX = "^\\+57\\d{10}$";

}
