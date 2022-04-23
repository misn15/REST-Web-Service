package customer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Customer {
	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO) //create primary key using Auto strategy which allows DB to choose best strategy
	  private Integer id;
	  
	  private String name;
	  
	  private String email;
	  
	  public void setId(Integer id) {
		  this.id = id;
	  }
	  
	  public void setName(String name) {
		  this.name = name;
	  }
	  
	  public void setEmail(String email) {
		  this.email = email;
	  }
	  
	  public Integer getId() {
		  return this.id;
	  }
	  
	  public String getName() {
		  return this.name;
	  }
	  
	  public String getEmail() {
		  return this.email;
	  }
}



