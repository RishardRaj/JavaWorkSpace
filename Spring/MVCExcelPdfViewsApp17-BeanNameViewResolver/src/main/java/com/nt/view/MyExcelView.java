package com.nt.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;

public class MyExcelView extends AbstractExcelView {

	@Override
	protected void buildExcelDocument(Map<String, Object> map, HSSFWorkbook book, HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		List<String> studList=null;
		HSSFSheet sheet=null;
		// get Model Attribute
		studList=(List)map.get("stList");
		//construct excel sheet
		 sheet=book.createSheet("Sheet1");
			
		getCell(sheet,0,0).setCellValue(new HSSFRichTextString("Names"));
		getCell(sheet,1,0).setCellValue(new HSSFRichTextString(studList.get(0)+" "));
		getCell(sheet,2,0).setCellValue(new HSSFRichTextString(studList.get(1)+" "));
		getCell(sheet,3,0).setCellValue(new HSSFRichTextString(studList.get(2)+" "));
	}//buildExcelDocument(-,-,-,-)
}//class
