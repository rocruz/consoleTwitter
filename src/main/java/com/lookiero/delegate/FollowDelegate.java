package com.lookiero.delegate;

import com.lookiero.constants.ConstantsConsoleTwitter;
import com.lookiero.utils.UtilsConsoleTwitter;
import com.lookiero.utils.UtilsFollow;

public class FollowDelegate {

	/**
	 * Metodo encargado de realizar la accion de seguir a alguien.
	 * @param cadena: cadena introducida por consola.
	 */
	public void followPerson(String cadena) {

		String[] a = UtilsConsoleTwitter.divideCadena(cadena, ConstantsConsoleTwitter.Simbol.SIMBOL_FOLLOW);

		String nameFollower = a[0];
		String nameFollowing = a[1];

		UtilsFollow.addPersonFollow(nameFollower, nameFollowing);
		
	}

}
