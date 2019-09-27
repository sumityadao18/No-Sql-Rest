package com.sumit.NoSqlRest.service;

import com.sumit.NoSqlRest.configuration.MongoConfig;
import com.sumit.NoSqlRest.document.Request;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestService {

    private ApplicationContext ctx =
            new AnnotationConfigApplicationContext(MongoConfig.class);
    private MongoOperations mongoOperation =
            (MongoOperations) ctx.getBean("mongoTemplate");

    public List<Request> findLatest(String id) {
        Query query = new Query();
        query.limit(1);
        query.with(new Sort(Sort.Direction.DESC, "_id"));
        return mongoOperation.find(query, Request.class);
    }
}
