package com.lxisoft.quizapp.model;

import java.util.Arrays;
import java.util.List;
import com.lxisoft.quizapp.repository.annotation.*;

public class Option {

	@PrimaryKey
	@Type(value="int")
	private int id;

	@Type(value="varchar")
	private String option1;

	@Type(value="varchar")	
	private String option2;

	@Type(value="varchar")
	private String option3;

	@Type(value="varchar")
	private String option4;

	public void setOptions(List<String> options) {

		this.option1 = options.get(0);
		this.option2 = options.get(1);
		this.option3 = options.get(2);
		this.option4 = options.get(3);
	}

	public List<String> getOptions() {

		List<String> temp = Arrays.asList(new String[] { option1, option2, option3, option4 });
		return temp;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

}