package com.xworkz.choice.dto;

import java.util.Optional;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class WonderDTO {
	private String name;
	private Optional<String> hesaru;
	private String place;
	private WonderType period;

	public enum WonderType {
		AD, BC
	}

	public WonderDTO(String name, String place, WonderType period) {
		super();
		this.name = name;
		this.place = place;
		this.period = period;
	}

	public WonderDTO() {

	}

}
