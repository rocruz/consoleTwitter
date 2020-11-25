package com.lookiero.dto;

import java.util.HashMap;
import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class FollowDTO {

	private HashMap<String, List<String>> listFollow;

	public HashMap<String, List<String>> getListFollow() {
		return listFollow;
	}

	public void setListFollow(HashMap<String, List<String>> listFollow) {
		this.listFollow = listFollow;
	}

}
