package com.lookiero.delegate;

import java.util.List;

import com.lookiero.dto.TweetDTO;
import com.lookiero.utils.UtilsPerson;

public class ReadDelegate {

	/**
	 * Metodo encargado de sacar los tweets de una persona.
	 * 
	 * @param cadena: Cadena escrita en consola.
	 */
	public void readTweet(String cadena) {

		List<TweetDTO> listTweet = UtilsPerson.readTweetPerson(cadena);

		if (null != listTweet) {
			listTweet.stream().filter(a -> null != a && a.getUser().equalsIgnoreCase(cadena))
					.forEach(a -> System.out.println(a.getTweet() + " (" + a.getTimeAgo() + ")"));
		} else {
			System.out.println("El usuario " + cadena + " no existe");
		}

	}

}
