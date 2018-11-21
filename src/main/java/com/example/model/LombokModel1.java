package com.example.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
@EqualsAndHashCode
public class LombokModel1 {

	private @NonNull String name;
	private @NonNull String age;
	private @NonNull String address;

	public static void main(String[] args) {
		LombokModel1 lombokModel = new LombokModel1("Harshad", "27", "Mumbai");

		System.out.println(lombokModel);
	}

}