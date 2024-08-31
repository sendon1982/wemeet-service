package org.wemeet.service.gen.jpa;
// Generated 31 Aug 2024, 9:53:40 pm by Hibernate Tools 6.5.2.Final


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

/**
 * ActivityEntity generated by hbm2java
 */
@Entity
@Table(name="activity_entity"
    ,catalog="wemeetdb"
)
public class ActivityEntity  implements java.io.Serializable {


     private long activityId;
     private Long hostUserId;
     private Long postedUserId;
     private String activityName;
     private String activityStatus;
     private String description;
     private LocalDateTime startDateTime;
     private LocalDateTime endDateTime;
     private Long playSpaceId;
     private Integer maxSlot;
     private Integer availableSlot;
     private LocalDateTime createdAt;
     private String createdBy;

    public ActivityEntity() {
    }

	
    public ActivityEntity(long activityId) {
        this.activityId = activityId;
    }
    public ActivityEntity(long activityId, Long hostUserId, Long postedUserId, String activityName, String activityStatus, String description, LocalDateTime startDateTime, LocalDateTime endDateTime, Long playSpaceId, Integer maxSlot, Integer availableSlot, LocalDateTime createdAt, String createdBy) {
       this.activityId = activityId;
       this.hostUserId = hostUserId;
       this.postedUserId = postedUserId;
       this.activityName = activityName;
       this.activityStatus = activityStatus;
       this.description = description;
       this.startDateTime = startDateTime;
       this.endDateTime = endDateTime;
       this.playSpaceId = playSpaceId;
       this.maxSlot = maxSlot;
       this.availableSlot = availableSlot;
       this.createdAt = createdAt;
       this.createdBy = createdBy;
    }
   
     @Id 

    
    @Column(name="activity_id", unique=true, nullable=false)
    public long getActivityId() {
        return this.activityId;
    }
    
    public void setActivityId(long activityId) {
        this.activityId = activityId;
    }

    
    @Column(name="host_user_id")
    public Long getHostUserId() {
        return this.hostUserId;
    }
    
    public void setHostUserId(Long hostUserId) {
        this.hostUserId = hostUserId;
    }

    
    @Column(name="posted_user_id")
    public Long getPostedUserId() {
        return this.postedUserId;
    }
    
    public void setPostedUserId(Long postedUserId) {
        this.postedUserId = postedUserId;
    }

    
    @Column(name="activity_name", length=100)
    public String getActivityName() {
        return this.activityName;
    }
    
    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    
    @Column(name="activity_status", length=100)
    public String getActivityStatus() {
        return this.activityStatus;
    }
    
    public void setActivityStatus(String activityStatus) {
        this.activityStatus = activityStatus;
    }

    
    @Column(name="description", length=500)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    
    @Column(name="start_date_time", length=19)
    public LocalDateTime getStartDateTime() {
        return this.startDateTime;
    }
    
    public void setStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }

    
    @Column(name="end_date_time", length=19)
    public LocalDateTime getEndDateTime() {
        return this.endDateTime;
    }
    
    public void setEndDateTime(LocalDateTime endDateTime) {
        this.endDateTime = endDateTime;
    }

    
    @Column(name="play_space_id")
    public Long getPlaySpaceId() {
        return this.playSpaceId;
    }
    
    public void setPlaySpaceId(Long playSpaceId) {
        this.playSpaceId = playSpaceId;
    }

    
    @Column(name="max_slot")
    public Integer getMaxSlot() {
        return this.maxSlot;
    }
    
    public void setMaxSlot(Integer maxSlot) {
        this.maxSlot = maxSlot;
    }

    
    @Column(name="available_slot")
    public Integer getAvailableSlot() {
        return this.availableSlot;
    }
    
    public void setAvailableSlot(Integer availableSlot) {
        this.availableSlot = availableSlot;
    }

    
    @Column(name="created_at", length=19)
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    
    @Column(name="created_by", length=100)
    public String getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }




}


