package org.wemeet.service.repository;


import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
@Repository
public class SupplierInfoRepository {



//    public SupplierInfoRecord save(CreateSupplierRequest request) {
//        String admin = "ADMIN";
//
//        SupplierInfoRecord infoRecord = dslContext.insertInto(SUPPLIER_INFO)
//                .set(SUPPLIER_INFO.EMAIL, request.getName())
//                .set(SUPPLIER_INFO.CREATEDAT, LocalDateTime.now())
//                .set(SUPPLIER_INFO.CREATEDBY, admin)
//                .returning()
//                .fetchOne();
//
//        return infoRecord;
//    }
}
