package hu.webuni.hr.Jozsi.mapper;

import hu.webuni.hr.Jozsi.dto.HolidayRequestDto;
import hu.webuni.hr.Jozsi.model.Employee;
import hu.webuni.hr.Jozsi.model.HolidayRequest;
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
public class HolidayRequestMapperImpl implements HolidayRequestMapper {

    @Override
    public List<HolidayRequestDto> holidayRequestsToDtos(List<HolidayRequest> holidayRequests) {
        if ( holidayRequests == null ) {
            return null;
        }

        List<HolidayRequestDto> list = new ArrayList<HolidayRequestDto>( holidayRequests.size() );
        for ( HolidayRequest holidayRequest : holidayRequests ) {
            list.add( holidayRequestToDto( holidayRequest ) );
        }

        return list;
    }

    @Override
    public HolidayRequestDto holidayRequestToDto(HolidayRequest holidayRequest) {
        if ( holidayRequest == null ) {
            return null;
        }

        HolidayRequestDto holidayRequestDto = new HolidayRequestDto();

        holidayRequestDto.setEmployeeId( holidayRequestEmployeeEmployeeId( holidayRequest ) );
        holidayRequestDto.setApproverId( holidayRequestApproverEmployeeId( holidayRequest ) );
        holidayRequestDto.setId( holidayRequest.getId() );
        holidayRequestDto.setCreatedAt( holidayRequest.getCreatedAt() );
        holidayRequestDto.setApproved( holidayRequest.getApproved() );
        holidayRequestDto.setApprovedAt( holidayRequest.getApprovedAt() );
        holidayRequestDto.setStartDate( holidayRequest.getStartDate() );
        holidayRequestDto.setEndDate( holidayRequest.getEndDate() );

        return holidayRequestDto;
    }

    @Override
    public HolidayRequest dtoToHolidayRequest(HolidayRequestDto holidayRequestDto) {
        if ( holidayRequestDto == null ) {
            return null;
        }

        HolidayRequest holidayRequest = new HolidayRequest();

        holidayRequest.setId( holidayRequestDto.getId() );
        holidayRequest.setCreatedAt( holidayRequestDto.getCreatedAt() );
        holidayRequest.setApproved( holidayRequestDto.getApproved() );
        holidayRequest.setApprovedAt( holidayRequestDto.getApprovedAt() );
        holidayRequest.setStartDate( holidayRequestDto.getStartDate() );
        holidayRequest.setEndDate( holidayRequestDto.getEndDate() );

        return holidayRequest;
    }

    @Override
    public List<HolidayRequest> dtosToHolidayRequests(List<HolidayRequestDto> holidayRequestDtos) {
        if ( holidayRequestDtos == null ) {
            return null;
        }

        List<HolidayRequest> list = new ArrayList<HolidayRequest>( holidayRequestDtos.size() );
        for ( HolidayRequestDto holidayRequestDto : holidayRequestDtos ) {
            list.add( dtoToHolidayRequest( holidayRequestDto ) );
        }

        return list;
    }

    private Long holidayRequestEmployeeEmployeeId(HolidayRequest holidayRequest) {
        if ( holidayRequest == null ) {
            return null;
        }
        Employee employee = holidayRequest.getEmployee();
        if ( employee == null ) {
            return null;
        }
        Long employeeId = employee.getEmployeeId();
        if ( employeeId == null ) {
            return null;
        }
        return employeeId;
    }

    private Long holidayRequestApproverEmployeeId(HolidayRequest holidayRequest) {
        if ( holidayRequest == null ) {
            return null;
        }
        Employee approver = holidayRequest.getApprover();
        if ( approver == null ) {
            return null;
        }
        Long employeeId = approver.getEmployeeId();
        if ( employeeId == null ) {
            return null;
        }
        return employeeId;
    }
}
