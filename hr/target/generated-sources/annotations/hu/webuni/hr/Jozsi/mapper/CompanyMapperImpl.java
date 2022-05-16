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
    date = "2022-05-16T18:12:36+0200",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.4.50.v20210914-1429, environment: Java 17.0.1 (Eclipse Adoptium)"
)
@Component
public class CompanyMapperImpl implements CompanyMapper {

    @Override
    public List<CompanyDto> companiesToDtos(List<Company> companies) {
        if ( companies == null ) {
            return null;
        }

        List<CompanyDto> list = new ArrayList<CompanyDto>( companies.size() );
        for ( Company company : companies ) {
            list.add( companyToDto( company ) );
        }

        return list;
    }

    @Override
    public List<CompanyDto> companiesToDtosNoEmployees(List<Company> companies) {
        if ( companies == null ) {
            return null;
        }

        List<CompanyDto> list = new ArrayList<CompanyDto>( companies.size() );
        for ( Company company : companies ) {
            list.add( companyToDtoNoEmployees( company ) );
        }

        return list;
    }

    @Override
    public CompanyDto companyToDto(Company company) {
        if ( company == null ) {
            return null;
        }

        CompanyDto companyDto = new CompanyDto();

        companyDto.setId( company.getId() );
        companyDto.setRegistrationNumber( company.getRegistrationNumber() );
        companyDto.setName( company.getName() );
        companyDto.setAddress( company.getAddress() );
        companyDto.setEmployees( employeeListToEmployeeDtoList( company.getEmployees() ) );

        return companyDto;
    }

    @Override
    public CompanyDto companyToDtoNoEmployees(Company company) {
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

    @Override
    public Company dtoToCompany(CompanyDto companyDto) {
        if ( companyDto == null ) {
            return null;
        }

        Company company = new Company();

        company.setId( companyDto.getId() );
        company.setRegistrationNumber( companyDto.getRegistrationNumber() );
        company.setName( companyDto.getName() );
        company.setAddress( companyDto.getAddress() );
        company.setEmployees( employeeDtoListToEmployeeList( companyDto.getEmployees() ) );

        return company;
    }

    @Override
    public List<Company> dtosToCompanies(List<CompanyDto> companies) {
        if ( companies == null ) {
            return null;
        }

        List<Company> list = new ArrayList<Company>( companies.size() );
        for ( CompanyDto companyDto : companies ) {
            list.add( dtoToCompany( companyDto ) );
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
        employee.setCompany( dtoToCompany( employeeDto.getCompany() ) );

        return employee;
    }

    protected List<EmployeeDto> employeeListToEmployeeDtoList(List<Employee> list) {
        if ( list == null ) {
            return null;
        }

        List<EmployeeDto> list1 = new ArrayList<EmployeeDto>( list.size() );
        for ( Employee employee : list ) {
            list1.add( employeeToDto( employee ) );
        }

        return list1;
    }

    protected List<Employee> employeeDtoListToEmployeeList(List<EmployeeDto> list) {
        if ( list == null ) {
            return null;
        }

        List<Employee> list1 = new ArrayList<Employee>( list.size() );
        for ( EmployeeDto employeeDto : list ) {
            list1.add( dtoToEmployee( employeeDto ) );
        }

        return list1;
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

    protected Position employeeDtoToPosition(EmployeeDto employeeDto) {
        if ( employeeDto == null ) {
            return null;
        }

        Position position = new Position();

        position.setName( employeeDto.getTitle() );

        return position;
    }
}
