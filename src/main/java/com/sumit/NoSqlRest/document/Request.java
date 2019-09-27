package com.sumit.NoSqlRest.document;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
@Data
public class Request {
    @Id
    public ObjectId _id;

    public Long id;

    private String name;

    private String eClassId;

    private String eClassName;

    private String brandEval;

    private String groupEval;

    private String aepsId;

    private String globeId;

    private int status;

    private String prmNote;

    private String dueDate;

    private String presentationDateAgenda;

    private String presentationDateProposed;

    private String receivedDate;

    private String modifiedDate;

    private String serviceCategory;
}
