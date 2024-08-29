package org.wemeet.service.repository;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BaseRepository {

    @Autowired
    protected DSLContext context;
}