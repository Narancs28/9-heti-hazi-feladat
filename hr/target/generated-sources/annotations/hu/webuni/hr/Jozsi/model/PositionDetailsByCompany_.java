package hu.webuni.hr.Jozsi.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(PositionDetailsByCompany.class)
public abstract class PositionDetailsByCompany_ {

	public static volatile SingularAttribute<PositionDetailsByCompany, Company> company;
	public static volatile SingularAttribute<PositionDetailsByCompany, Long> id;
	public static volatile SingularAttribute<PositionDetailsByCompany, Integer> minSalary;
	public static volatile SingularAttribute<PositionDetailsByCompany, Position> position;

	public static final String COMPANY = "company";
	public static final String ID = "id";
	public static final String MIN_SALARY = "minSalary";
	public static final String POSITION = "position";

}

