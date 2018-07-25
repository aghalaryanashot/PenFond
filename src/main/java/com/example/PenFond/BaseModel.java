package com.example.PenFond;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

@MappedSuperclass
public abstract class BaseModel {
    @Id
    long id;

    @Version
    long version;

}
