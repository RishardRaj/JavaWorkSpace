package com.nt.deligate;

import com.nt.vo.BatsmanInputsVO;
import com.nt.vo.BatsmanProfileVO;

public interface CrickterDetailsDeligate {
	
	public BatsmanProfileVO  findCricketerDetails(BatsmanInputsVO  ipVO);

}
