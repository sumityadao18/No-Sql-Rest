package com.sumit.NoSqlRest.repository;

import com.sumit.NoSqlRest.document.Request;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RequestRepository extends MongoRepository<Request, ObjectId> {

    public List<Request> findAllByAepsId(String id);
}
