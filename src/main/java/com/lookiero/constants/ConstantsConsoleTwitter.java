package com.lookiero.constants;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class ConstantsConsoleTwitter {

	public static class Option {
		public static String EXIT = "exit";

		public static String PATERN_POST = "([a-zA-Z])( -> )([a-zA-Z])";

		public static String PATERN_READ = "([a-zA-Z])";

		public static String PATERN_FOLLOW = "[a-zA-Z] follows [a-zA-Z]";

		public static String PATERN_TIMELINE = "([a-zA-Z]) wall";

	}

	public static class Simbol {
		public static String SIMBOL_POST = " -> ";
		public static String SIMBOL_FOLLOW = " follows ";
		public static String SIMBOL_WALL= " wall";

	}

	public enum Id {
		POST, FOLLOW, READ, TIMELINE, EXIT;
	}

	public static final List<Id> optionsId = new ArrayList<>();
	static {
		optionsId.add(Id.EXIT);
		optionsId.add(Id.FOLLOW);
		optionsId.add(Id.POST);
		optionsId.add(Id.TIMELINE);
		optionsId.add(Id.READ);

	}
	public static final HashMap<Id, String> optionsMapID = new HashMap<>();
	static {
		optionsMapID.put(Id.FOLLOW, Option.PATERN_FOLLOW);
		optionsMapID.put(Id.POST, Option.PATERN_POST);
		optionsMapID.put(Id.READ, Option.PATERN_READ);
		optionsMapID.put(Id.TIMELINE, Option.PATERN_TIMELINE);
		optionsMapID.put(Id.EXIT, Option.EXIT);

	}
}
