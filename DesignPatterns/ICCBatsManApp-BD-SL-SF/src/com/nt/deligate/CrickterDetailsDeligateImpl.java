package com.nt.deligate;

import com.nt.dto.BatsmanInputsDTO;
import com.nt.dto.BatsmanProfileDTO;
import com.nt.icc.ext3facade.ICCCrickterDetailsFinderFacade;
import com.nt.serviceLocator.CrickterDetailsServiceLocator;
import com.nt.vo.BatsmanInputsVO;
import com.nt.vo.BatsmanProfileVO;

public class CrickterDetailsDeligateImpl implements CrickterDetailsDeligate {

	@Override
	public BatsmanProfileVO findCricketerDetails(BatsmanInputsVO ipVO) {
		BatsmanInputsDTO ipDTO=null;
	    CrickterDetailsServiceLocator  locator=null;
	    ICCCrickterDetailsFinderFacade  facade=null;
	    BatsmanProfileDTO profileDTO=null;
	    BatsmanProfileVO profileVO=null;
	    
	    //convert InputsVO to InputsDTO class obj
		ipDTO=new BatsmanInputsDTO();
		ipDTO.setNickName(ipVO.getNickName());
		ipDTO.setCountry(ipVO.getCountry());
		//get ServiceLocator object
		locator=CrickterDetailsServiceLocator.getInstance();
		//get SessionFacade object
		facade=locator.getService("serviceJndi");
		//get Batsman Profile
		profileDTO=facade.getCrickterDetails(ipDTO);
		// Convert ProfileDTO to ProfileVO
		profileVO= new BatsmanProfileVO();
		profileVO.setBatsmanId(String.valueOf(profileDTO.getBatsmanId()));
		profileVO.setFullName(profileDTO.getFullName());
		profileVO.setCountry(profileDTO.getCountry());
		profileVO.setHighestScore(profileDTO.getHighestScore());
		profileVO.setCenturiesCount(String.valueOf(profileDTO.getCenturiesCount()));
		profileVO.setHalfCenturiesCount(String.valueOf(profileDTO.getHalfCenturiesCount()));
		profileVO.setMatchesCount(String.valueOf(profileDTO.getMatchesCount()));
		profileVO.setStrikeRate(String.valueOf(profileDTO.getStrikeRate()));
		profileVO.setTotalRuns(String.valueOf(profileDTO.getTotalRuns()));
		return profileVO;
	}

}
