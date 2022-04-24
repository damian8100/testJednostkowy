package com.kodilla.hibernate.manytomany.facade;

public class SearchProcessingException extends Exception {

    public static String ERR_COMPANY_NAME_NOT_FOUND = "The Company with this names not found";
    public static String ERR_EMPLOYEE_NAME_NOT_FOUND = "The Employee with this names not found";


    public SearchProcessingException(String message) {
        super(message);
    }
}
