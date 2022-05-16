package hu.webuni.hr.Jozsi.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(HolidayRequest.class)
public abstract class HolidayRequest_ {

	public static volatile SingularAttribute<HolidayRequest, Employee> approver;
	public static volatile SingularAttribute<HolidayRequest, LocalDateTime> createdAt;
	public static volatile SingularAttribute<HolidayRequest, Boolean> approved;
	public static volatile SingularAttribute<HolidayRequest, LocalDate> endDate;
	public static volatile SingularAttribute<HolidayRequest, Long> id;
	public static volatile SingularAttribute<HolidayRequest, Employee> employee;
	public static volatile SingularAttribute<HolidayRequest, LocalDateTime> approvedAt;
	public static volatile SingularAttribute<HolidayRequest, LocalDate> startDate;

	public static final String APPROVER = "approver";
	public static final String CREATED_AT = "createdAt";
	public static final String APPROVED = "approved";
	public static final String END_DATE = "endDate";
	public static final String ID = "id";
	public static final String EMPLOYEE = "employee";
	public static final String APPROVED_AT = "approvedAt";
	public static final String START_DATE = "startDate";

}

