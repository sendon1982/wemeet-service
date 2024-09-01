package org.wemeet.service.svc;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.wemeet.service.gen.jpa.PlaySpaceEntity;
import org.wemeet.service.gen.jpa.SupplierEntity;
import org.wemeet.service.gen.model.CreatePlaySpaceRequest;
import org.wemeet.service.gen.model.CreatePlaySpaceResponse;
import org.wemeet.service.gen.model.CreateSupplierRequest;
import org.wemeet.service.gen.model.SupplierResponse;
import org.wemeet.service.repository.jpa.PlaySpaceRepository;
import org.wemeet.service.repository.jpa.SupplierInfoRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class SupplierServiceImpl implements SupplierService {

    private final SupplierInfoRepository supplierInfoRepository;
    private final PlaySpaceRepository playSpaceRepository;

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
    public void createNewPlaySpace(Long supplierId, CreatePlaySpaceRequest request) {
        PlaySpaceEntity playSpaceEntity = new PlaySpaceEntity();
        playSpaceEntity.setName(request.getName());
        playSpaceEntity.setDescription(request.getDescription());
        playSpaceEntity.setCapacity(request.getCapacity());
        playSpaceEntity.setAddress(request.getAddress());
        playSpaceEntity.setBeginDateTime(request.getBeginDateTime());
        playSpaceEntity.setEndDateTime(request.getEndDateTime());
        playSpaceEntity.setCreatedBy(supplierId);

        playSpaceRepository.save(playSpaceEntity);
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
        response.setId(Long.toString(supplierEntity.getId()));
        return response;
    }
}
