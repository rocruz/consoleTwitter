package com.lookiero.dto;

import java.time.LocalDate;

public class TweetDTO {
	
	private String user;
	
	private String tweet;

	private LocalDate timeAgo;

	
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getTweet() {
		return tweet;
	}

	public void setTweet(String tweet) {
		this.tweet = tweet;
	}

	public LocalDate getTimeAgo() {
		return timeAgo;
	}

	public void setTimeAgo(LocalDate timeAgo) {
		this.timeAgo = timeAgo;
	}
	
	
	
}
