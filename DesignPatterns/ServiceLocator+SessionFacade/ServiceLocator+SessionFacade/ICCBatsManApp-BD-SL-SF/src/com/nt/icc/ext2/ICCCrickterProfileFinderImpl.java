package com.nt.icc.ext2;

import com.nt.dto.BatsmanIdDetailsDTO;
import com.nt.dto.BatsmanProfileDTO;

public class ICCCrickterProfileFinderImpl implements ICCCrickterProfileFinderComp {

	@Override
	public BatsmanProfileDTO findBatsmanProfile(BatsmanIdDetailsDTO iDdto) {
		BatsmanProfileDTO profileDTO=null;
		if(iDdto.getBatsmanId()==1001){
			profileDTO=new BatsmanProfileDTO();
			profileDTO.setBatsmanId(iDdto.getBatsmanId());
			profileDTO.setFullName(iDdto.getFullName());
			profileDTO.setCountry(iDdto.getCountry());
			profileDTO.setMatchesCount(463);
			profileDTO.setCenturiesCount(100);
			profileDTO.setHalfCenturiesCount(96);
			profileDTO.setTotalRuns(18900);
			profileDTO.setStrikeRate(86.34f);
			profileDTO.setHighestScore("200*");
		}
		else if(iDdto.getBatsmanId()==1045){
			profileDTO=new BatsmanProfileDTO();
			profileDTO.setBatsmanId(iDdto.getBatsmanId());
			profileDTO.setFullName(iDdto.getFullName());
			profileDTO.setCountry(iDdto.getCountry());
			profileDTO.setMatchesCount(179);
			profileDTO.setCenturiesCount(26);
			profileDTO.setHalfCenturiesCount(38);
			profileDTO.setTotalRuns(7000);
			profileDTO.setStrikeRate(88.34f);
			profileDTO.setHighestScore("183");
		}
		else{
			throw new IllegalArgumentException("Invalid batsmanId");
		}
		return profileDTO; 
	}//method
}//class
