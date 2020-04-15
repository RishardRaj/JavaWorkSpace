package com.nt.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.nt.command.FileUploadCommand;

@Controller
public class FileUploadController {
	
	@RequestMapping(value="/upload.htm",method=RequestMethod.GET)
	public String showForm(Map<String,Object> map){
		map.put("fileUploadCmd",new FileUploadCommand());
		return "file_upload";
		
	}
	@RequestMapping(value="/upload.htm",method=RequestMethod.POST)
	public String uploadFile(Map<String,Object> map,@ModelAttribute("fileUploadCmd") FileUploadCommand cmd)throws Exception{
		String destDir="E:/springuploads";
		File file=null;
		MultipartFile uploadFile=null;
		String uploadFileName=null;
		InputStream inputStream=null;
		OutputStream outputStream=null;
		//create Dest directory if not available
		file=new File(destDir);
		if(!file.exists())
			file.mkdir();
		//recive uploadedfile details
		uploadFile=cmd.getUploadFile();
		uploadFileName=uploadFile.getOriginalFilename();
		inputStream=uploadFile.getInputStream();
		//create OutputStream pointing to Dest file on Server machine
		outputStream=new FileOutputStream(destDir+"/"+uploadFileName);
		//complete fileUploading
		IOUtils.copy(inputStream,outputStream);
		//close streams
		inputStream.close();
		outputStream.close();
		//add uploaded filename to model attribute
		map.put("file_name",uploadFileName);
		
		return "result";
	}//method
}//class
