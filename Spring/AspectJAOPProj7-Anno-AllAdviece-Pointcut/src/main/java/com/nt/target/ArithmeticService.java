package com.nt.target;

import org.springframework.stereotype.Service;

@Service("as")
public class ArithmeticService {
	
	public int add(int x,int y){
		return x+y;
	}
	public int sub(int x,int y){
		return x-y; 
	}
	public int mul(int x,int y){
		return x*y;
	}
	public int div(int x,int y){
		return (int)x/y;
	}
}
