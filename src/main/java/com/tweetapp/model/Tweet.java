package com.tweetapp.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "tweet")
public class Tweet {

	@Id
	private String id;
	private Date createdDateTime;
	private String username;
	private String message;
	private int noOfLikes;
	public Tweet(Date createdDateTime, String username, String message) {
		super();
		this.createdDateTime = createdDateTime;
		this.username = username;
		this.message = message;
	}
	public Tweet(Date createdDateTime, String username, String message, int noOfLikes) {
		super();
		this.createdDateTime = createdDateTime;
		this.username = username;
		this.message = message;
		this.noOfLikes = noOfLikes;
	}
	public Tweet() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getCreatedDateTime() {
		return createdDateTime;
	}
	public void setCreatedDateTime(Date createdDateTime) {
		this.createdDateTime = createdDateTime;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getNoOfLikes() {
		return noOfLikes;
	}
	public void setNoOfLikes(int noOfLikes) {
		this.noOfLikes = noOfLikes;
	}

	
	
	
	
}
