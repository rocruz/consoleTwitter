package com.lookiero.app;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lookiero.constants.ConstantsConsoleTwitter;
import com.lookiero.delegate.ConsoleTwitterDelegate;
import com.lookiero.utils.UtilsFollow;
import com.lookiero.utils.UtilsPerson;

@SpringBootApplication
public class ConsoleTwitterApp {

	@SuppressWarnings("resource")
	public static void main(String args[]) {

		ConsoleTwitterDelegate consoleTwitterDelegate = new ConsoleTwitterDelegate();

		UtilsPerson.createPerson();
		UtilsFollow.createFollow();

		String cadena = null;
		System.out.println("####### TWITTER LOOKIERO #######");
		System.out.println("POSTING   : $> Name -> This is a tweet ");
		System.out.println("READING   : $> Name  ");
		System.out.println("FOLLOWING : $> Name1 follows Name2");
		System.out.println("TIMELINE  : $> Name wall");
		System.out.println("#################################");

		do {
			Scanner sc = new Scanner(System.in);

			cadena = sc.nextLine();
			consoleTwitterDelegate.identificarOperacion(cadena);

		} while (!cadena.equalsIgnoreCase(ConstantsConsoleTwitter.Option.EXIT));
	}
}