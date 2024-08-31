package org.wemeet.service.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wemeet.service.gen.api.SpaceSupplierApi;
import org.wemeet.service.gen.model.CreatePlaySpaceRequest;
import org.wemeet.service.gen.model.CreatePlaySpaceResponse;
import org.wemeet.service.gen.model.CreateSupplierRequest;
import org.wemeet.service.gen.model.SupplierResponse;
import org.wemeet.service.svc.SupplierService;


@RequiredArgsConstructor
@Slf4j
@RestController
@RequestMapping("/")
public class SupplierController implements SpaceSupplierApi {

    private final SupplierService supplierService;

    @Override
    public ResponseEntity<SupplierResponse> registerNewSupplier(CreateSupplierRequest request) {
        supplierService.createSupplier(request);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<CreatePlaySpaceResponse> createNewPlaySpace(String supplierId, CreatePlaySpaceRequest request) {
        supplierService.createNewPlaySpace(supplierId, request);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
