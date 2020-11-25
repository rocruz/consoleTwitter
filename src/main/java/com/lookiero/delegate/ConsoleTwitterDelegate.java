package com.lookiero.delegate;

import com.lookiero.constants.ConstantsConsoleTwitter.Id;
import com.lookiero.utils.UtilsConsoleTwitter;

public class ConsoleTwitterDelegate {

	private FollowDelegate followDelegate = new FollowDelegate();
	private PostDelegate postDelegate = new PostDelegate();
	private ReadDelegate readDelegate = new ReadDelegate();
	private TimelineDelegate timelineDelegate = new TimelineDelegate();

	/**
	 * Metodo encargado de identificar el tipo de operacion.
	 * 
	 * @param cadena: Cadena escrita en consola.
	 */
	public void identificarOperacion(String cadena) {
		Id id = UtilsConsoleTwitter.chooseOption(cadena);

		if (Id.EXIT == id) {
		} else if (Id.FOLLOW == id) {
			
			this.followDelegate.followPerson(cadena);
			
		} else if (Id.POST == id) {

			this.postDelegate.postTweet(cadena);

		} else if (Id.READ == id) {
			this.readDelegate.readTweet(cadena);

		} else if (Id.TIMELINE == id) {
			
			this.timelineDelegate.readTweetFollow(cadena);
			
		} else {
		}
	}

}
