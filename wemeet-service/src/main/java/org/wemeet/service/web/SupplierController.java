package org.wemeet.service.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;
import org.wemeet.service.gen.api.SpaceSupplierApi;
import org.wemeet.service.gen.model.CreatePlaySpaceRequest;
import org.wemeet.service.gen.model.CreatePlaySpaceResponse;
import org.wemeet.service.gen.model.CreateSupplierRequest;
import org.wemeet.service.gen.model.SupplierResponse;
import org.wemeet.service.svc.SupplierService;

import java.util.List;
import java.util.Optional;


@RequiredArgsConstructor
@Slf4j
@RestController
@RequestMapping("/")
public class SupplierController implements SpaceSupplierApi {

    private final SupplierService supplierService;

    @Override
    public ResponseEntity<SupplierResponse> registerNewSupplier(CreateSupplierRequest request) {
        SupplierResponse supplierResponse = supplierService.createSupplier(request);
        log.info("=====Created new supplier=====");
        return new ResponseEntity<>(supplierResponse, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<CreatePlaySpaceResponse> createNewPlaySpace(String supplierId, CreatePlaySpaceRequest request) {
        supplierService.createNewPlaySpace(supplierId, request);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<CreatePlaySpaceResponse> getAllPlaySpaceList() {
        return SpaceSupplierApi.super.getAllPlaySpaceList();
    }

    @Override
    public ResponseEntity<CreatePlaySpaceResponse> getPlaySpaceListBySupplierId(String supplierId) {
        return SpaceSupplierApi.super.getPlaySpaceListBySupplierId(supplierId);
    }

    @Override
    public ResponseEntity<List<SupplierResponse>> getSuppliersByQuery(String query, String sort, Integer pageSize, Integer pageNo) {
        List<SupplierResponse> supplierResponseList = supplierService.getSuppliersByQuery(query, sort, pageSize, pageNo);
        return ResponseEntity.ok(supplierResponseList);
    }
}
