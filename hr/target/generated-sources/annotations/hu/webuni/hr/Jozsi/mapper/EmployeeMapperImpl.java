package hu.webuni.hr.Jozsi.mapper;

import hu.webuni.hr.Jozsi.dto.CompanyDto;
import hu.webuni.hr.Jozsi.dto.EmployeeDto;
import hu.webuni.hr.Jozsi.model.Company;
import hu.webuni.hr.Jozsi.model.Employee;
import hu.webuni.hr.Jozsi.model.Position;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-16T18:12:35+0200",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.4.50.v20210914-1429, environment: Java 17.0.1 (Eclipse Adoptium)"
)
@Component
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public List<EmployeeDto> employeesToDtos(List<Employee> employees) {
        if ( employees == null ) {
            return null;
        }

        List<EmployeeDto> list = new ArrayList<EmployeeDto>( employees.size() );
        for ( Employee employee : employees ) {
            list.add( employeeToDto( employee ) );
        }

        return list;
    }

    @Override
    public EmployeeDto employeeToDto(Employee employee) {
        if ( employee == null ) {
            return null;
        }

        EmployeeDto employeeDto = new EmployeeDto();

        if ( employee.getEmployeeId() != null ) {
            employeeDto.setId( employee.getEmployeeId() );
        }
        employeeDto.setTitle( employeePositionName( employee ) );
        employeeDto.setEntryDate( employee.getDateOfStartWork() );
        employeeDto.setName( employee.getName() );
        employeeDto.setSalary( employee.getSalary() );
        employeeDto.setCompany( companyToCompanyDto( employee.getCompany() ) );

        return employeeDto;
    }

    @Override
    public Employee dtoToEmployee(EmployeeDto employeeDto) {
        if ( employeeDto == null ) {
            return null;
        }

        Employee employee = new Employee();

        employee.setPosition( employeeDtoToPosition( employeeDto ) );
        employee.setEmployeeId( employeeDto.getId() );
        employee.setDateOfStartWork( employeeDto.getEntryDate() );
        employee.setName( employeeDto.getName() );
        employee.setSalary( employeeDto.getSalary() );
        employee.setCompany( companyDtoToCompany( employeeDto.getCompany() ) );

        return employee;
    }

    @Override
    public List<Employee> dtosToEmployees(List<EmployeeDto> employees) {
        if ( employees == null ) {
            return null;
        }

        List<Employee> list = new ArrayList<Employee>( employees.size() );
        for ( EmployeeDto employeeDto : employees ) {
            list.add( dtoToEmployee( employeeDto ) );
        }

        return list;
    }

    private String employeePositionName(Employee employee) {
        if ( employee == null ) {
            return null;
        }
        Position position = employee.getPosition();
        if ( position == null ) {
            return null;
        }
        String name = position.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    protected CompanyDto companyToCompanyDto(Company company) {
        if ( company == null ) {
            return null;
        }

        CompanyDto companyDto = new CompanyDto();

        companyDto.setId( company.getId() );
        companyDto.setRegistrationNumber( company.getRegistrationNumber() );
        companyDto.setName( company.getName() );
        companyDto.setAddress( company.getAddress() );

        return companyDto;
    }

    protected Position employeeDtoToPosition(EmployeeDto employeeDto) {
        if ( employeeDto == null ) {
            return null;
        }

        Position position = new Position();

        position.setName( employeeDto.getTitle() );

        return position;
    }

    protected Company companyDtoToCompany(CompanyDto companyDto) {
        if ( companyDto == null ) {
            return null;
        }

        Company company = new Company();

        company.setId( companyDto.getId() );
        company.setRegistrationNumber( companyDto.getRegistrationNumber() );
        company.setName( companyDto.getName() );
        company.setAddress( companyDto.getAddress() );
        company.setEmployees( dtosToEmployees( companyDto.getEmployees() ) );

        return company;
    }
}
