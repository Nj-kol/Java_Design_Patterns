package com.njkol.designpatterrns.behavioural.iterator;

public interface SocialNetwork {
	
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}