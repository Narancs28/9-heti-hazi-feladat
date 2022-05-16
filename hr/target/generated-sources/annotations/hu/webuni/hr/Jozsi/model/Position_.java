package hu.webuni.hr.Jozsi.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Position.class)
public abstract class Position_ {

	public static volatile SingularAttribute<Position, Qualification> qualification;
	public static volatile SingularAttribute<Position, String> name;
	public static volatile SingularAttribute<Position, Integer> id;
	public static volatile ListAttribute<Position, Employee> employees;

	public static final String QUALIFICATION = "qualification";
	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String EMPLOYEES = "employees";

}

