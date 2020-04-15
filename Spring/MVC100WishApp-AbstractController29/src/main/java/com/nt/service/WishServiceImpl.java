package com.nt.service;

import org.springframework.stereotype.Service;

@Service
public class WishServiceImpl implements WishService {

	@Override
	public String generateWishMessage() {
		return "Good Morning";
	}

}
