package com.ssadhukhanv2.microservice.infotracker.controllers;

import com.ssadhukhanv2.microservice.infotracker.domains.Resource;
import com.ssadhukhanv2.microservice.infotracker.service.IResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/resource")
public class ResourceController {

    @Autowired
    IResourceService resourceService;


    @GetMapping("/")
    public List<Resource> getResourceList() {
        return resourceService.getResourceList();
    }


    /*
     * The below has been implemented with "Path Variable" same could be achieved with
     * Query Params: https://www.baeldung.com/spring-requestparam-vs-pathvariable
     * Sample Url: http://localhost:8080/resource?id=9
     *
     * Path Variable: https://www.baeldung.com/spring-pathvariable
     * Sample Url: http://localhost:8080/resource/1
     * */
    @GetMapping("/{resourceIdentifier}")
    public Resource getResource(@PathVariable(name = "resourceIdentifier") int id) {
        return resourceService.getResource(id);
    }

    @PostMapping("/")
    public Resource createResource(@RequestBody Resource resource) {
        return resourceService.createResource(resource);
    }

    @PutMapping("/")
    public Resource updateResource(@RequestBody Resource resource) {
        return resourceService.updateResource(resource);
    }

    @DeleteMapping("/")
    public Resource deleteResource(@RequestBody Resource resource) {
        return resourceService.deleteResource(resource);
    }

}
