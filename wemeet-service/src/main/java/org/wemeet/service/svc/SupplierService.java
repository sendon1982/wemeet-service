package org.wemeet.service.svc;

import org.wemeet.service.gen.model.CreatePlaySpaceRequest;
import org.wemeet.service.gen.model.CreateSupplierRequest;
import org.wemeet.service.gen.model.SupplierResponse;

public interface SupplierService {

    SupplierResponse createSupplier(CreateSupplierRequest request);

    void createNewPlaySpace(String supplierId, CreatePlaySpaceRequest request);
}
