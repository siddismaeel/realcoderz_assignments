package com.real.api;

public interface Rewardable {

	public int calculateRewardPoints(double amount);

	boolean swipeCard(double amount);
}
