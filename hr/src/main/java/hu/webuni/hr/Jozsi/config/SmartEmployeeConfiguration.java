package hu.webuni.hr.Jozsi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import hu.webuni.hr.Jozsi.service.EmployeeService;
import hu.webuni.hr.Jozsi.service.SmartEmployeeService;

@Configuration
@Profile("smart")
public class SmartEmployeeConfiguration {

	public EmployeeService employeeService() {
		return new SmartEmployeeService();
	}

}
