package com.sumit.NoSqlRest.controller;

import com.sumit.NoSqlRest.document.Request;
import com.sumit.NoSqlRest.repository.RequestRepository;
import com.sumit.NoSqlRest.service.RequestService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RequestController {

    private RequestRepository repository;

    private RequestService service;

    @Autowired
    public RequestController(RequestRepository repository, RequestService service) {
        this.repository = repository;
        this.service = service;
    }

    @PostMapping(value = "/save")
    public ResponseEntity<String> saveRequest(@RequestBody List<Request> requests){
        requests.forEach(r -> {
            r.set_id(ObjectId.get());
            repository.save(r);
        });
        return new ResponseEntity<>("Awesome", HttpStatus.ACCEPTED);
    }

    @GetMapping(value = "/{id}")
    public List<Request> getLatestRequest(@PathVariable("id") String id) {
        return service.findLatest(id);
    }

    @GetMapping(value = "/allRequests/{apesId}")
    public List<Request> getAllRequest(@PathVariable("apesId") String apesId) {
        return this.repository.findAllByAepsId(apesId);
    }

}
