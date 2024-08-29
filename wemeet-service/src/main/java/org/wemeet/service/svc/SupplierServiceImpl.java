package org.wemeet.service.svc;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.wemeet.service.gen.jooq.tables.SupplierInfo;
import org.wemeet.service.gen.jooq.tables.records.SupplierInfoRecord;
import org.wemeet.service.gen.model.CreateSupplierRequest;
import org.wemeet.service.gen.model.SupplierResponse;
import org.wemeet.service.repository.SupplierInfoRepository;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
@Slf4j
public class SupplierServiceImpl implements SupplierService {

    private final SupplierInfoRepository supplierInfoRepository;

    @Override
    public SupplierResponse createSupplier(CreateSupplierRequest request) {
        SupplierInfo supplierInfo = new SupplierInfo();

        SupplierInfoRecord record = new SupplierInfoRecord();

        record.setEmail(request.getAddress());
        record.setMobile(request.getName());
        record.setCreatedat(LocalDateTime.now());
        record.setCreatedby("Admin");

        SupplierInfoRecord save = supplierInfoRepository.save(request);
        log.debug("xxx");

        SupplierResponse supplierResponse = new SupplierResponse();

        return supplierResponse;
    }
}
