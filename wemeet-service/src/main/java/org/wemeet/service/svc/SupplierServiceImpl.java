package org.wemeet.service.svc;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.wemeet.service.gen.jpa.SupplierEntity;
import org.wemeet.service.gen.model.CreatePlaySpaceRequest;
import org.wemeet.service.gen.model.CreateSupplierRequest;
import org.wemeet.service.gen.model.SupplierResponse;
import org.wemeet.service.repository.jpa.SupplierInfoRepository;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<SupplierResponse> getSuppliersByQuery(String query, String sort, Integer pageSize, Integer pageNo) {
        var res = supplierInfoRepository.findByAddressContainsOrEmailContainsOrNameContainsOrMobileContains(query, query, query, query);
        List<SupplierResponse> supplierResponses = new ArrayList<>();
        for(var entity : res) {
            supplierResponses.add(supplierEntityToResponse(entity));
        }
        return supplierResponses;
    }

    private SupplierResponse supplierEntityToResponse(SupplierEntity supplierEntity) {
        SupplierResponse response = new SupplierResponse();
        response.setAddress(supplierEntity.getAddress());
        response.setName(supplierEntity.getName());
        response.setMobile(supplierEntity.getMobile());
        response.setEmail(supplierEntity.getEmail());
        response.setId(supplierEntity.getId().toString());
        return response;
    }
}
