package net.com.sam.organizationservice.service.impl;

import lombok.AllArgsConstructor;
import net.com.sam.organizationservice.repository.OrganizationRepository;
import net.com.sam.organizationservice.dto.OrganizationDto;
import net.com.sam.organizationservice.entity.Organization;
import net.com.sam.organizationservice.mapper.OrganizationMapper;
import net.com.sam.organizationservice.service.OrganizationService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrganizationServiceImpl implements OrganizationService {

    private OrganizationRepository organizationRepository;

    @Override
    public OrganizationDto saveOrganization(OrganizationDto organizationDto) {

        // convert OrganizationDto into Organization jpa entity
        Organization organization = OrganizationMapper.mapToOrganization(organizationDto);

        Organization savedOrganization = organizationRepository.save(organization);

        return OrganizationMapper.mapToOrganizationDto(savedOrganization);
    }

    @Override
    public OrganizationDto getOrganizationByCode(String organizationCode) {
        Organization organization = organizationRepository.findByOrganizationCode(organizationCode);
        return OrganizationMapper.mapToOrganizationDto(organization);
    }
}
