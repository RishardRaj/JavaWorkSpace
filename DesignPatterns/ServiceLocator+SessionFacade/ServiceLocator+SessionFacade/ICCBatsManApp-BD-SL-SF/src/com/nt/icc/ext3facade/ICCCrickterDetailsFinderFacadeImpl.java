package com.nt.icc.ext3facade;

import com.nt.dto.BatsmanIdDetailsDTO;
import com.nt.dto.BatsmanInputsDTO;
import com.nt.dto.BatsmanProfileDTO;
import com.nt.icc.ext1.ICCCrickerIdFinderComp;
import com.nt.icc.ext1.ICCCrickterIdFinderCompImpl;
import com.nt.icc.ext2.ICCCrickterProfileFinderComp;
import com.nt.icc.ext2.ICCCrickterProfileFinderImpl;

public class ICCCrickterDetailsFinderFacadeImpl implements ICCCrickterDetailsFinderFacade {

	@Override
	public BatsmanProfileDTO getCrickterDetails(BatsmanInputsDTO ipDTO) {
		ICCCrickerIdFinderComp  idComp=null;
		ICCCrickterProfileFinderComp profileComp=null;
		BatsmanIdDetailsDTO idDTO=null;
		BatsmanProfileDTO profileDTO=null;
		//use Exteranl Service1 to Batsman Id Details
		idComp=new ICCCrickterIdFinderCompImpl();
		idDTO=idComp.findBatsmanId(ipDTO);
		//use Extenal Servie2 to get Batsman complete profile info
		profileComp=new ICCCrickterProfileFinderImpl();
		profileDTO=profileComp.findBatsmanProfile(idDTO);

		return profileDTO;
	}

}
