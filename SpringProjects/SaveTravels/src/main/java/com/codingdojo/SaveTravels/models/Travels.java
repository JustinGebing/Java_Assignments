package com.codingdojo.SaveTravels.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="travels")
public class Travels {
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	 	
	    @NotNull
	    @Size(min = 5, max = 200, message= "Name has to be between 5-200 characters.")
	    private String expense;
	    @NotNull
	    @Size(min = 5, max = 200, message= "Name has to be between 5-200 characters.")
	    private String description;
	    @NotNull
	    @Size(min = 3, max = 40,  message= "Name has to be between 3-40 characters.")
	    private String vendor;
	    @NotNull
	    @Min(value = 0)
	    private double amount;
	    // This will not allow the createdAt column to be updated after creation
	    @Column(updatable=false)
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date createdAt;
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date updatedAt;
	    
	    public void travels() {
	    }
	    public void travels(String expense, String vendor, double amount, String description) {
	        this.expense = expense;
	        this.vendor = vendor;
	        this.amount = amount;
	        this.description = description;
	    }
	    
	    // other getters and setters removed for brevity
	    @PrePersist
	    protected void onCreate(){
	        this.createdAt = new Date();
	    }
	    @PreUpdate
	    protected void onUpdate(){
	        this.updatedAt = new Date();
	    }
}
