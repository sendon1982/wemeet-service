package org.wemeet.service.svc;

import jakarta.annotation.PostConstruct;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import org.wemeet.service.gen.jpa.SupplierInfo;
import org.wemeet.service.gen.model.CreatePlaySpaceRequest;
import org.wemeet.service.gen.model.CreateSupplierRequest;
import org.wemeet.service.gen.model.SupplierResponse;
import org.wemeet.service.repository.jpa.SupplierInfoRepository;

@Service
@RequiredArgsConstructor
@Slf4j
public class SupplierServiceImpl implements SupplierService {

    private final SupplierInfoRepository supplierInfoRepository;

    @Override
    public SupplierResponse createSupplier(CreateSupplierRequest request) {

        SupplierResponse supplierResponse = new SupplierResponse();

        SupplierInfo supplierInfo = new SupplierInfo();
        supplierInfo.setEmail("sendon1982@gmail.com");

        supplierInfoRepository.save(supplierInfo);

        return supplierResponse;
    }

    @Override
    public void createNewPlaySpace(String supplierId, CreatePlaySpaceRequest request) {


    }


}
