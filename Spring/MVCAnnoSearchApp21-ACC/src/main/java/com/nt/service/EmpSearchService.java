package com.nt.service;

import java.util.List;

import com.nt.dto.SearchDTO;
import com.nt.dto.SearchResultDTO;

public interface EmpSearchService {
	
	public List<SearchResultDTO> process(SearchDTO dto);

}
