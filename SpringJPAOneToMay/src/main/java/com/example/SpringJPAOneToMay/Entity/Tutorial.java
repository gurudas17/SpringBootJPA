package com.example.SpringJPAOneToMay.Entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Table(name = "tutorials")
@Data
public class Tutorial {
//	  @Id
//	  @GeneratedValue(strategy = GenerationType.IDENTITY)
//	  private long id;
//	  @Column(name = "title")
//	  private String title;
//	  @Column(name = "description")
//	  private String description;
//	  @Column(name = "published")
//	  private boolean published;
//	  @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
//	  @JoinColumn(name = "tutorial_id")
//	  private Set<Comment> comments = new HashSet<>();
//	  public Tutorial() {
//	  }
//	  public Tutorial(String title, String description, boolean published) {
//	    this.title = title;
//	    this.description = description;
//	    this.published = published;
//	  }
	  // getters and setters
	


	 @Id
	  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tutorial_generator")
	  private long id;
	  @Column(name = "title")
	  private String title;
	  @Column(name = "description")
	  private String description;
	  @Column(name = "published")
	  private boolean published;
	  public Tutorial() {
	  }
	  public Tutorial(String title, String description, boolean published) {
	    this.title = title;
	    this.description = description;
	    this.published = published;
	  }

}