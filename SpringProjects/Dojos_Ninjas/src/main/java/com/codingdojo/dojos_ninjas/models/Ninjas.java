package com.codingdojo.dojos_ninjas.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne; 
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table(name="ninjas")
public class Ninjas {
	    
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String first_name;
	    private String last_name;
	    private Integer age;
	    @Column(updatable=false)
	    private Date createdAt;
	    private Date updatedAt;
	    @ManyToOne(fetch=FetchType.LAZY)
	    @JoinColumn(name="dojos_id")
	    private Dojos dojos;
	    
	    
	    @PrePersist
		protected void onCreate() {
			this.createdAt = new Date();
		}

		protected void onUpdate() {
			this.updatedAt = new Date();
		}
		
	    public Ninjas() {
	        
	    }
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getFirst_name() {
			return first_name;
		}
		public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}
		public String getLast_name() {
			return last_name;
		}
		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
		public Date getCreatedAt() {
			return createdAt;
		}
		public void setCreatedAt(Date createdAt) {
			this.createdAt = createdAt;
		}
		public Date getUpdatedAt() {
			return updatedAt;
		}
		public void setUpdatedAt(Date updatedAt) {
			this.updatedAt = updatedAt;
		}
		public Dojos getDojo() {
			return dojos;
		}
		public void setDojo(Dojos dojos) {
			this.dojos = dojos;
		}
	    
	}
