package org.wemeet.service.repository;


import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.wemeet.service.gen.jooq.tables.SupplierInfo;
import org.wemeet.service.gen.jooq.tables.records.SupplierInfoRecord;
import org.wemeet.service.gen.model.CreateSupplierRequest;

import java.time.LocalDateTime;
import java.util.List;

import static org.wemeet.service.gen.jooq.tables.SupplierInfo.SUPPLIER_INFO;

@RequiredArgsConstructor
@Transactional
@Repository
public class SupplierInfoRepository {

    private final DSLContext dslContext;

    public SupplierInfoRecord save(CreateSupplierRequest request) {
        String admin = "ADMIN";

        SupplierInfoRecord infoRecord = dslContext.insertInto(SUPPLIER_INFO)
                .set(SUPPLIER_INFO.EMAIL, request.getName())
                .set(SUPPLIER_INFO.CREATEDAT, LocalDateTime.now())
                .set(SUPPLIER_INFO.CREATEDBY, admin)
                .returning()
                .fetchOne();

        return infoRecord;
    }
}
