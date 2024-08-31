package org.wemeet.service.gen.jpa;
// Generated Aug 31, 2024, 7:45:08 PM by Hibernate Tools 6.5.2.Final


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * ActivityHistoryEntity generated by hbm2java
 */
@Entity
@Table(name="activity_history_entity"
    ,catalog="wemeetdb"
)
public class ActivityHistoryEntity  implements java.io.Serializable {


     private long id;
     private Long userId;
     private Long activityId;

    public ActivityHistoryEntity() {
    }

	
    public ActivityHistoryEntity(long id) {
        this.id = id;
    }
    public ActivityHistoryEntity(long id, Long userId, Long activityId) {
       this.id = id;
       this.userId = userId;
       this.activityId = activityId;
    }
   
     @Id 

    
    @Column(name="id", unique=true, nullable=false)
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }

    
    @Column(name="user_id")
    public Long getUserId() {
        return this.userId;
    }
    
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    
    @Column(name="activity_id")
    public Long getActivityId() {
        return this.activityId;
    }
    
    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }




}


