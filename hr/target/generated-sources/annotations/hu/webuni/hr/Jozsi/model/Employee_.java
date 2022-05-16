package hu.webuni.hr.Jozsi.model;

import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Employee.class)
public abstract class Employee_ {

	public static volatile ListAttribute<Employee, HolidayRequest> holidayRequests;
	public static volatile SingularAttribute<Employee, String> password;
	public static volatile SingularAttribute<Employee, Employee> manager;
	public static volatile SingularAttribute<Employee, String> name;
	public static volatile SingularAttribute<Employee, Long> employeeId;
	public static volatile SingularAttribute<Employee, Company> company;
	public static volatile SingularAttribute<Employee, Position> position;
	public static volatile SingularAttribute<Employee, Integer> salary;
	public static volatile SingularAttribute<Employee, LocalDateTime> dateOfStartWork;
	public static volatile SingularAttribute<Employee, String> username;

	public static final String HOLIDAY_REQUESTS = "holidayRequests";
	public static final String PASSWORD = "password";
	public static final String MANAGER = "manager";
	public static final String NAME = "name";
	public static final String EMPLOYEE_ID = "employeeId";
	public static final String COMPANY = "company";
	public static final String POSITION = "position";
	public static final String SALARY = "salary";
	public static final String DATE_OF_START_WORK = "dateOfStartWork";
	public static final String USERNAME = "username";

}

