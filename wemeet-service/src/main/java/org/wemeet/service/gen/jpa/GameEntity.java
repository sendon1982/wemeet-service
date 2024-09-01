package org.wemeet.service.gen.jpa;
// Generated 1 Sept 2024, 3:05:25 pm by Hibernate Tools 6.5.2.Final


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

/**
 * GameEntity generated by hbm2java
 */
@Entity
@Table(name="game_entity"
    ,catalog="wemeetdb"
)
public class GameEntity  implements java.io.Serializable {


     private long id;
     private String name;
     private String description;
     private String gameProfileUrl;
     private Integer rating;
     private Integer minPerson;
     private Integer maxPerson;
     private Integer durationMin;
     private Integer difficulty;
     private String gstoneGameUrl;
     private LocalDateTime createdAt;

    public GameEntity() {
    }

	
    public GameEntity(long id) {
        this.id = id;
    }
    public GameEntity(long id, String name, String description, String gameProfileUrl, Integer rating, Integer minPerson, Integer maxPerson, Integer durationMin, Integer difficulty, String gstoneGameUrl, LocalDateTime createdAt) {
       this.id = id;
       this.name = name;
       this.description = description;
       this.gameProfileUrl = gameProfileUrl;
       this.rating = rating;
       this.minPerson = minPerson;
       this.maxPerson = maxPerson;
       this.durationMin = durationMin;
       this.difficulty = difficulty;
       this.gstoneGameUrl = gstoneGameUrl;
       this.createdAt = createdAt;
    }
   
     @Id 

    
    @Column(name="id", unique=true, nullable=false)
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }

    
    @Column(name="name", length=100)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="description", length=1000)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    
    @Column(name="game_profile_url", length=500)
    public String getGameProfileUrl() {
        return this.gameProfileUrl;
    }
    
    public void setGameProfileUrl(String gameProfileUrl) {
        this.gameProfileUrl = gameProfileUrl;
    }

    
    @Column(name="rating")
    public Integer getRating() {
        return this.rating;
    }
    
    public void setRating(Integer rating) {
        this.rating = rating;
    }

    
    @Column(name="min_person")
    public Integer getMinPerson() {
        return this.minPerson;
    }
    
    public void setMinPerson(Integer minPerson) {
        this.minPerson = minPerson;
    }

    
    @Column(name="max_person")
    public Integer getMaxPerson() {
        return this.maxPerson;
    }
    
    public void setMaxPerson(Integer maxPerson) {
        this.maxPerson = maxPerson;
    }

    
    @Column(name="duration_min")
    public Integer getDurationMin() {
        return this.durationMin;
    }
    
    public void setDurationMin(Integer durationMin) {
        this.durationMin = durationMin;
    }

    
    @Column(name="difficulty")
    public Integer getDifficulty() {
        return this.difficulty;
    }
    
    public void setDifficulty(Integer difficulty) {
        this.difficulty = difficulty;
    }

    
    @Column(name="gstone_game_url", length=500)
    public String getGstoneGameUrl() {
        return this.gstoneGameUrl;
    }
    
    public void setGstoneGameUrl(String gstoneGameUrl) {
        this.gstoneGameUrl = gstoneGameUrl;
    }

    
    @Column(name="created_at", length=19)
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }




}


