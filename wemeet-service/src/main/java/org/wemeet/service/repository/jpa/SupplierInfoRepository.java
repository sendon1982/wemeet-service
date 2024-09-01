package org.wemeet.service.repository.jpa;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.wemeet.service.gen.jpa.PlaySpaceEntity;
import org.wemeet.service.gen.jpa.SupplierEntity;

import java.util.List;

@Repository
public interface SupplierInfoRepository extends JpaRepository<SupplierEntity, Long> {
    List<SupplierEntity> findByAddressContainsOrEmailContainsOrNameContainsOrMobileContains(String add, String email, String name, String mobile);
}


