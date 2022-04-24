package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class CompanyEmployeeFacadeTestSuite {

    @Autowired
    private EmployeeAndCompanySearchFacade employeeAndCompanySearchFacade;
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    private ArrayList<Employee>resultEmploy = new ArrayList<>();
    private ArrayList<Company>resultCopmany = new ArrayList<>();

    @Test
    public void employSearchTest() throws SearchProcessingException {


        //given
        Employee employee = new Employee("Andrzej", "Tomala");
        Employee employee1 = new Employee("Jan", "Błachowicz");
        Employee employee2 = new Employee("Borys", "Budka");
        Employee employee3 = new Employee("Gertruda", "Sasin");

        Company company = new Company("Drutex");
        Company company1 = new Company("Kodilla");
        Company company2 = new Company("Microsoft");
        Company company3 = new Company("Intel");

        company.getEmployees().add(employee);
        company1.getEmployees().add(employee1);
        company2.getEmployees().add(employee2);
        company3.getEmployees().add(employee3);

        employee.getCompanies().add(company);
        employee1.getCompanies().add(company1);
        employee2.getCompanies().add(company2);
        employee3.getCompanies().add(company3);

        companyDao.save(company);
        companyDao.save(company1);
        companyDao.save(company2);
        companyDao.save(company3);

        resultEmploy.add(employee);
        resultEmploy.add(employee1);

        resultCopmany.add(company);
        resultCopmany.add(company1);


        //when

        List<Employee> searchList = employeeAndCompanySearchFacade.searchEmployeeName("mala");

        //then

       Assertions.assertEquals(3, searchList.size());

       //CleanUp
        try{
            companyDao.delete(company);
            companyDao.delete(company1);
            companyDao.delete(company2);
            companyDao.delete(company3);

        }catch(Exception e) {
            //do nothing
        }


    }

    @Test
    public void companySearchName() {

        //given
        Employee employee = new Employee("Andrzej", "Tomala");
        Employee employee1 = new Employee("Jan", "Błachowicz");
        Employee employee2 = new Employee("Borys", "Budka");
        Employee employee3 = new Employee("Gertruda", "Sasin");

        Company company = new Company("Drutex");
        Company company1 = new Company("Kodilla");
        Company company2 = new Company("Microsoft");
        Company company3 = new Company("Intel");

        company.getEmployees().add(employee);
        company1.getEmployees().add(employee1);
        company2.getEmployees().add(employee2);
        company3.getEmployees().add(employee3);

        employee.getCompanies().add(company);
        employee1.getCompanies().add(company1);
        employee2.getCompanies().add(company2);
        employee3.getCompanies().add(company3);

        companyDao.save(company);
        companyDao.save(company1);
        companyDao.save(company2);
        companyDao.save(company3);

        resultEmploy.add(employee);
        resultEmploy.add(employee1);

        resultCopmany.add(company);
        resultCopmany.add(company1);


        //when

        List<Company> searchList1 = employeeAndCompanySearchFacade.searchCompanyName("rut");

        //then

        Assertions.assertEquals(4, searchList1.size());

        //CleanUp
        try{
            companyDao.delete(company);
            companyDao.delete(company1);
            companyDao.delete(company2);
            companyDao.delete(company3);
        }catch(Exception e) {
            //do nothing
        }
    }


}
