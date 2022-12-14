package com.hnt.orderService.Entity;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity

public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@NotBlank(message="Name should not be null")
	private String  name;
	
	@Min(value=1, message="age should not less than 1")
	private  int age;
	
	
	public String getName() {
		
		return name;
	}
    public void setName(String name ) {
    	this.name=name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
    	this.age=age;
    }
    
    public Integer getId() {
    	return id;
    }
    public void setId(Integer id) {
    	this.id=id;
    }
}
