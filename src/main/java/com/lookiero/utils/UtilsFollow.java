package com.lookiero.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.lookiero.dto.FollowDTO;

public class UtilsFollow {

	public static FollowDTO followDTO = new FollowDTO();

	public static void createFollow() {

		HashMap<String, List<String>> tweetsPerson = new HashMap<>();
		UtilsFollow.followDTO.setListFollow(tweetsPerson);

	}

	public static void addPerson(String name) {
		UtilsFollow.followDTO.getListFollow().put(name, new ArrayList<>());
	}

	public static void addPersonFollow(String nameFollower, String nameFollowing) {
		List<String> tweetsList = UtilsFollow.followDTO.getListFollow().get(nameFollower);

		if (null != tweetsList && null != UtilsPerson.readTweetPerson(nameFollowing)) {
			UtilsFollow.followDTO.getListFollow().get(nameFollower).add(nameFollowing);
		} else {
			System.out.println("El usuario " + nameFollowing + " no existe ");
		}
	}

	public static List<String> readPersonFollow(String name) {
		return UtilsFollow.followDTO.getListFollow().get(name);
	}

}
