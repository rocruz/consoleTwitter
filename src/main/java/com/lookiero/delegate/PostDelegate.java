package com.lookiero.delegate;

import java.util.ArrayList;
import java.util.List;

import com.lookiero.constants.ConstantsConsoleTwitter;
import com.lookiero.dto.TweetDTO;
import com.lookiero.utils.UtilsConsoleTwitter;
import com.lookiero.utils.UtilsFollow;
import com.lookiero.utils.UtilsPerson;
import com.lookiero.utils.UtilsTweet;

public class PostDelegate {

	/**
	 * Metodo encargado de postear un tweet.
	 * 
	 * @param cadena: Cadena escrita en consola.
	 */
	public void postTweet(String cadena) {
		String[] a = UtilsConsoleTwitter.divideCadena(cadena, ConstantsConsoleTwitter.Simbol.SIMBOL_POST);

		String name = a[0];
		String tweetString = a[1];

		List<TweetDTO> tweetsList = UtilsPerson.personaDTO.getTweetsPerson().get(name);

		if (null == tweetsList) {
			tweetsList = new ArrayList<>();
		}
		tweetsList.add(UtilsTweet.createTweet(name, tweetString));
		UtilsPerson.personaDTO.getTweetsPerson().put(name, tweetsList);
		UtilsFollow.addPerson(name);

	}

}
