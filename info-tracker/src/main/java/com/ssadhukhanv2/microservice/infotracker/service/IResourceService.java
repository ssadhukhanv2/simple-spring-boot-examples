package com.ssadhukhanv2.microservice.infotracker.service;

import com.ssadhukhanv2.microservice.infotracker.domains.Resource;

import java.util.List;

public interface IResourceService {
    public List<Resource> getResourceList();

    public Resource getResource(int id);

    public Resource createResource(Resource resource);

    public Resource updateResource(Resource resource);

    public Resource deleteResource(Resource resource);

}
