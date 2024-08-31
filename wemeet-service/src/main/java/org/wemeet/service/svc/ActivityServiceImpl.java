package org.wemeet.service.svc;


import io.swagger.v3.oas.annotations.servers.Server;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.wemeet.service.gen.jpa.ActivityEntity;
import org.wemeet.service.repository.jpa.ActivityRepository;

import java.time.LocalDateTime;

@Server
@Slf4j
@RequiredArgsConstructor
public class ActivityServiceImpl implements ActivityService {

    private final ActivityRepository activityRepository;

    public void createNewActivity() {

        ActivityEntity activityEntity = new ActivityEntity();

//        activityEntity.setHostUserId();
//        activityEntity.setPostedUserId();
//        activityEntity.setActivityName();
//        activityEntity.setActivityStatus();
//        activityEntity.setDescription();
//        activityEntity.setEndDateTime();
//        activityEntity.setPlaySpaceId();
//        activityEntity.setMaxSlot();
//        activityEntity.setAvailableSlot();
        activityEntity.setCreatedAt(LocalDateTime.now());
        activityEntity.setCreatedBy("");

        activityRepository.save(activityEntity);
    }
}
