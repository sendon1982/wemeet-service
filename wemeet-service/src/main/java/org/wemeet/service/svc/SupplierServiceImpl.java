package org.wemeet.service.svc;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.wemeet.service.gen.jpa.SupplierEntity;
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

        SupplierEntity supplierInfo = new SupplierEntity();
        supplierInfo.setEmail(request.getEmail());
        supplierInfo.setName(request.getName());
        supplierInfo.setAddress(request.getAddress());
        supplierInfo.setMobile(request.getMobile());

        supplierInfoRepository.save(supplierInfo);

        return supplierResponse;
    }

    @Override
    public void createNewPlaySpace(String supplierId, CreatePlaySpaceRequest request) {


    }


}
