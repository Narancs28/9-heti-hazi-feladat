package hu.webuni.hr.Jozsi.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import hu.webuni.hr.Jozsi.model.Employee;
import hu.webuni.hr.Jozsi.model.HrUser;
import hu.webuni.hr.Jozsi.repository.EmployeeRepository;

@Service
public class HrUserDetailsService implements UserDetailsService{
	
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Employee employee = employeeRepository.findByUsername(username)
				.orElseThrow(()-> new UsernameNotFoundException(username));
		
		return new HrUser(
				username, 
				employee.getPassword(), 
				Arrays.asList(new SimpleGrantedAuthority("USER")), 
				employee);
	}

}
