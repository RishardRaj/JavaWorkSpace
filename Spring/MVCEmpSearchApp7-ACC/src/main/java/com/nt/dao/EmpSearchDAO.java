package com.nt.dao;

import java.util.List;

import com.nt.bo.SearchBO;
import com.nt.bo.SearchResultBO;

public interface EmpSearchDAO {
	public List<SearchResultBO> search(SearchBO bo);

}
