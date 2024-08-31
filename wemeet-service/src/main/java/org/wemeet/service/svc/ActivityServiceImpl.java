package org.wemeet.service.svc;


import io.swagger.v3.oas.annotations.servers.Server;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.wemeet.service.gen.jpa.ActivityEntity;
import org.wemeet.service.gen.model.ActivityResponse;
import org.wemeet.service.repository.jpa.ActivityRepository;

import java.time.LocalDateTime;

@Service
@Slf4j
@RequiredArgsConstructor
public class ActivityServiceImpl implements ActivityService {

    private final ActivityRepository activityRepository;

    public ActivityResponse createNewActivity(org.wemeet.service.gen.model.CreatActivityRequest request) {

        ActivityEntity activityEntity = new ActivityEntity();

        activityEntity.setHostUserId(request.getHostUserId());
        activityEntity.setPostedUserId(request.getPostedUserId());
        activityEntity.setActivityName(request.getActivityName());
        activityEntity.setActivityStatus(ActivityResponse.ActivityStatusEnum.ACTIVE.name());
        activityEntity.setDescription(request.getDescription());
        //activityEntity.setStartDateTime(request.getStartDateTime());
        activityEntity.setEndDateTime(request.getEndDateTime());
        activityEntity.setPlaySpaceId(request.getPlaySpaceId());
        activityEntity.setMaxSlot(request.getMaxSlot());
        activityEntity.setAvailableSlot(request.getAvailableSlot());
        activityEntity.setCreatedAt(LocalDateTime.now());
        activityEntity.setCreatedBy("");

        ActivityEntity entity = activityRepository.save(activityEntity);

        ActivityResponse response = new ActivityResponse();
        return response;
    }
}
