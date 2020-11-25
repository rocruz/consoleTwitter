package com.lookiero.utils;

import java.time.LocalDate;

import com.lookiero.dto.TweetDTO;

public class UtilsTweet {
	
	public static TweetDTO createTweet(String name, String tweet) {
		TweetDTO tweetDTO = new TweetDTO();

		tweetDTO.setUser(name);
		tweetDTO.setTweet(tweet);
		tweetDTO.setTimeAgo(LocalDate.now());

		return tweetDTO;
	}

}
