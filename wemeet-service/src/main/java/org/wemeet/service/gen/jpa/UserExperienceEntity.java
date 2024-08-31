package org.wemeet.service.gen.jpa;
// Generated Aug 31, 2024, 7:45:08 PM by Hibernate Tools 6.5.2.Final


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

/**
 * UserExperienceEntity generated by hbm2java
 */
@Entity
@Table(name="user_experience_entity"
    ,catalog="wemeetdb"
)
public class UserExperienceEntity  implements java.io.Serializable {


     private long userExperienceId;
     private Long userId;
     private String experience;
     private String level;
     private Integer years;
     private LocalDateTime createdAt;
     private String createdBy;

    public UserExperienceEntity() {
    }

	
    public UserExperienceEntity(long userExperienceId) {
        this.userExperienceId = userExperienceId;
    }
    public UserExperienceEntity(long userExperienceId, Long userId, String experience, String level, Integer years, LocalDateTime createdAt, String createdBy) {
       this.userExperienceId = userExperienceId;
       this.userId = userId;
       this.experience = experience;
       this.level = level;
       this.years = years;
       this.createdAt = createdAt;
       this.createdBy = createdBy;
    }
   
     @Id 

    
    @Column(name="user_experience_id", unique=true, nullable=false)
    public long getUserExperienceId() {
        return this.userExperienceId;
    }
    
    public void setUserExperienceId(long userExperienceId) {
        this.userExperienceId = userExperienceId;
    }

    
    @Column(name="user_id")
    public Long getUserId() {
        return this.userId;
    }
    
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    
    @Column(name="experience", length=100)
    public String getExperience() {
        return this.experience;
    }
    
    public void setExperience(String experience) {
        this.experience = experience;
    }

    
    @Column(name="level", length=100)
    public String getLevel() {
        return this.level;
    }
    
    public void setLevel(String level) {
        this.level = level;
    }

    
    @Column(name="years")
    public Integer getYears() {
        return this.years;
    }
    
    public void setYears(Integer years) {
        this.years = years;
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


