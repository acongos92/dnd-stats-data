package com.dnd.log.sessionlog;

import com.dnd.log.constants.NumericConstants;
import com.dnd.log.constants.StringConstants;

public class SessionLog {
	private String quest_name;
	private int tier;
	private String summary;
	private String date_time;
	private boolean double_reward;
	private double hours;
	private String location_name;
	private String dm_name;
	
	public SessionLog() {
		quest_name = StringConstants.DEFAULT_STRING_VALUE;
		tier = NumericConstants.DEFAULT_INT_VALUE;
		summary = StringConstants.DEFAULT_STRING_VALUE;
		date_time = StringConstants.DEFAULT_STRING_VALUE;
		double_reward = NumericConstants.DEFAULT_BOOL_VALUE;
		hours = NumericConstants.DEFAULT_DOUBLE_VALUE;
		location_name = StringConstants.DEFAULT_STRING_VALUE;
		dm_name = StringConstants.DEFAULT_STRING_VALUE;
	}
	
	public SessionLog(String quest_name, int tier, String summary, String date_time, boolean double_reward, double hours, String location_name, String dm_name) {
		this.quest_name = quest_name;
		this.tier = tier;
		this.summary = summary;
		this.date_time = date_time;
		this.double_reward = double_reward;
		this.hours = hours;
		this.location_name = location_name;
		this.dm_name = dm_name;
	}

	public String getQuest_name() {
		return quest_name;
	}

	public void setQuest_name(String quest_name) {
		this.quest_name = quest_name;
	}

	public int getTier() {
		return tier;
	}

	public void setTier(int tier) {
		this.tier = tier;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getDate_time() {
		return date_time;
	}

	public void setDate_time(String date_time) {
		this.date_time = date_time;
	}

	public boolean isDouble_reward() {
		return double_reward;
	}

	public void setDouble_reward(boolean double_reward) {
		this.double_reward = double_reward;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public String getLocation_name() {
		return location_name;
	}

	public void setLocation_name(String location_name) {
		this.location_name = location_name;
	}

	public String getDm_name() {
		return dm_name;
	}

	public void setDm_name(String dm_name) {
		this.dm_name = dm_name;
	}
}
