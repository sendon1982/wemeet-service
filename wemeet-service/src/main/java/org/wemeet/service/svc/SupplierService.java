package org.wemeet.service.svc;

import org.wemeet.service.gen.model.CreatePlaySpaceRequest;
import org.wemeet.service.gen.model.CreatePlaySpaceResponse;
import org.wemeet.service.gen.model.CreateSupplierRequest;
import org.wemeet.service.gen.model.SupplierResponse;

import java.util.List;

public interface SupplierService {
    List<SupplierResponse> getSuppliersByQuery(String query, String sort, Integer pageSize, Integer pageNo);

    SupplierResponse createSupplier(CreateSupplierRequest request);

    void createNewPlaySpace(Long supplierId, CreatePlaySpaceRequest request);
}
