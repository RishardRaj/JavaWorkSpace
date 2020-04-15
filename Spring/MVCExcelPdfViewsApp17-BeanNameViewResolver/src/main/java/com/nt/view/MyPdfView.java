package com.nt.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;

public class MyPdfView extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> map, Document doc, PdfWriter writer, HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		List<String>studList=null;
		Paragraph p=null;
		Table t=null;
		//get Model Attribute value
		studList=(List<String>)map.get("stList");
		//construct pdf doucment
		p = new Paragraph("Student details");
		p.setAlignment("center");
		doc.add(p);
				
		t = new Table(1);
		t.addCell(studList.get(0)+" ");
		t.addCell(studList.get(1)+" ");
		t.addCell(studList.get(2)+" ");
		t.addCell(studList.get(3)+" ");
		t.addCell(studList.get(4)+" ");
		doc.add(t);
	}//buildPdfDocument
}//class
