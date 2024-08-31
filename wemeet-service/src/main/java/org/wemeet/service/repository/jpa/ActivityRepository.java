package org.wemeet.service.repository.jpa;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.wemeet.service.gen.jpa.ActivityEntity;
import org.wemeet.service.gen.jpa.SupplierEntity;

@Repository
public interface ActivityRepository extends JpaRepository<ActivityEntity, Long> {

}
