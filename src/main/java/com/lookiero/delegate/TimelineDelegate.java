package com.lookiero.delegate;

import com.lookiero.constants.ConstantsConsoleTwitter;
import com.lookiero.utils.UtilsConsoleTwitter;
import com.lookiero.utils.UtilsFollow;
import com.lookiero.utils.UtilsPerson;

public class TimelineDelegate {

	
	/**
	 * Metodo encargado de sacar los tweets de la gente que sigue.
	 * @param cadena
	 */
	public void readTweetFollow(String cadena) {
		String[] aux = UtilsConsoleTwitter.divideCadena(cadena, ConstantsConsoleTwitter.Simbol.SIMBOL_WALL);

		String name = aux[0];

		UtilsFollow.readPersonFollow(name)
			.stream()
			.forEach(b -> UtilsPerson.readTweetPerson(b)
				    .stream()
					.forEach(c -> System.out.println(
								  c.getUser() + " - " + 
								  c.getTweet() + " - " + 
								  c.getTimeAgo())));

	}

}
