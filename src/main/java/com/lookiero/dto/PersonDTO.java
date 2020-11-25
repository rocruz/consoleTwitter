package com.lookiero.dto;

import java.util.HashMap;
import java.util.List;

public class PersonDTO {

	private HashMap<String, List<TweetDTO>> tweetsPerson;

	
	public HashMap<String, List<TweetDTO>> getTweetsPerson() {
		return tweetsPerson;
	}
	public void setTweetsPersona(HashMap<String, List<TweetDTO>> tweetsPerson) {
		this.tweetsPerson = tweetsPerson;
	}


			
	

}
