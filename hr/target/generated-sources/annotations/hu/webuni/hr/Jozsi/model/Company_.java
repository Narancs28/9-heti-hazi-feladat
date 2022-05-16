package hu.webuni.hr.Jozsi.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Company.class)
public abstract class Company_ {

	public static volatile SingularAttribute<Company, String> address;
	public static volatile SingularAttribute<Company, CompanyType> companyType;
	public static volatile SingularAttribute<Company, Integer> registrationNumber;
	public static volatile SingularAttribute<Company, String> name;
	public static volatile SingularAttribute<Company, Long> id;
	public static volatile ListAttribute<Company, Employee> employees;

	public static final String ADDRESS = "address";
	public static final String COMPANY_TYPE = "companyType";
	public static final String REGISTRATION_NUMBER = "registrationNumber";
	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String EMPLOYEES = "employees";

}

