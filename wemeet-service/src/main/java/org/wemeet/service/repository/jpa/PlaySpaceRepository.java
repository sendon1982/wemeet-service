package org.wemeet.service.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.wemeet.service.gen.jpa.PlaySpaceEntity;

import java.util.List;

@Repository
public interface PlaySpaceRepository extends JpaRepository<PlaySpaceEntity, Long> {
    List<PlaySpaceEntity> findByCreatedBy(Long supplierId);
}
