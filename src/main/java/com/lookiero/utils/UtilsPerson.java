package com.lookiero.utils;

import java.util.HashMap;
import java.util.List;

import com.lookiero.dto.PersonDTO;
import com.lookiero.dto.TweetDTO;

public class UtilsPerson {

	public static PersonDTO personaDTO = new PersonDTO();

	public static PersonDTO createPerson() {

		HashMap<String, List<TweetDTO>> tweetsPerson = new HashMap<>();
		UtilsPerson.personaDTO.setTweetsPersona(tweetsPerson);
		return personaDTO;
	}

	public static PersonDTO addPerson(String name, String tweet) {

		HashMap<String, List<TweetDTO>> tweetsPerson = new HashMap<>();
		UtilsPerson.personaDTO.setTweetsPersona(tweetsPerson);
		return personaDTO;
	}

	public static List<TweetDTO> readTweetPerson(String cadena) {

		return UtilsPerson.personaDTO.getTweetsPerson().get(cadena);
	}
}
