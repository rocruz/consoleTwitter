package com.lookiero.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.lookiero.constants.ConstantsConsoleTwitter;
import com.lookiero.constants.ConstantsConsoleTwitter.Id;
import com.lookiero.dto.PersonDTO;
import com.lookiero.dto.TweetDTO;

public class UtilsConsoleTwitter {

	public static HashMap<String, List<TweetDTO>> tweetsPersona = new HashMap<>();
	public static HashMap<String, PersonDTO> follows = new HashMap<>();
	public static List<TweetDTO> listaFollows = new ArrayList<>();
	public static List<TweetDTO> listaTweets = new ArrayList<>();

	public static Id chooseOption(String cadena) {

		for (int i = 0; i < ConstantsConsoleTwitter.optionsId.size(); i++) {

			Id id = ConstantsConsoleTwitter.optionsId.get(i);
			String option = ConstantsConsoleTwitter.optionsMapID.get(id);

			Matcher matcher = ejecucionExpresionRegular(option, cadena);

			if (matcher.find()) {
				return id;
			}
		}
		return null;
	}

	private static Matcher ejecucionExpresionRegular(String expresionRegular, String cadena) {
		Pattern pattern = Pattern.compile(expresionRegular);
		return pattern.matcher(cadena);
	}

	public static String[] divideCadena(String cadena, String simbol) {
		String regex = Pattern.quote(simbol);
		String[] arr = cadena.split(regex);
		return arr;

	}

}
