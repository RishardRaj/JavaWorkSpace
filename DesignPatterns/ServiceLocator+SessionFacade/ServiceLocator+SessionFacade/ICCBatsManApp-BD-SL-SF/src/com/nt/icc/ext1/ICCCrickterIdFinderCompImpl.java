package com.nt.icc.ext1;

import com.nt.dto.BatsmanIdDetailsDTO;
import com.nt.dto.BatsmanInputsDTO;

public class ICCCrickterIdFinderCompImpl implements ICCCrickerIdFinderComp {

	@Override
	public BatsmanIdDetailsDTO findBatsmanId(BatsmanInputsDTO dto) {
		BatsmanIdDetailsDTO idDTO=null;
		if(dto.getNickName().equals("sachin")){
			idDTO=new BatsmanIdDetailsDTO();
			idDTO.setBatsmanId(1001);
			idDTO.setNickName("sachin");
			idDTO.setCountry("india");
			idDTO.setFullName("Sachin Ramesh Tendulkar");
		}
		else if(dto.getNickName().equals("kohli")){
			idDTO=new BatsmanIdDetailsDTO();
			idDTO.setBatsmanId(1045);
			idDTO.setNickName("kohli");
			idDTO.setCountry("india");
			idDTO.setFullName("Virat Kohli");
		}
		else{
			throw new IllegalArgumentException("No batsmen with this nick name");
		}
		return idDTO;
	}

}
