package com.ssadhukhanv2.microservice.infotracker.service;

import com.ssadhukhanv2.microservice.infotracker.domains.Resource;
import com.ssadhukhanv2.microservice.infotracker.repo.ResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ResourceService implements IResourceService {

    @Autowired
    ResourceRepository repository;

    @Override
    public List<Resource> getResourceList() {
        return repository.findAll();
    }

    @Override
    public Resource getResource(int id) {
        return repository.findById(id).get();
    }

    @Override
    public Resource createResource(Resource resource) {
        repository.save(resource);
        return resource;
    }

    @Override
    public Resource updateResource(Resource resource) {
        Resource r = repository.findById(resource.getId()).get();
        if (null != r) {
            r.setDescription(resource.getDescription());
            r.setName(resource.getName());
            r.setUrl(resource.getUrl());
            repository.save(r);
        } else {
            repository.save(resource);
        }
        return resource;
    }

    @Override
    public Resource deleteResource(Resource resource) {
        repository.delete(resource);
        return resource;
    }
}
