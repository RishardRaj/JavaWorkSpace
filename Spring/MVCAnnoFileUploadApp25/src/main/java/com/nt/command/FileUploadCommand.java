package com.nt.command;

import org.springframework.web.multipart.MultipartFile;

public class FileUploadCommand {
	private MultipartFile  uploadFile;

	public MultipartFile getUploadFile() {
		return uploadFile;
	}

	public void setUploadFile(MultipartFile uploadFile) {
		this.uploadFile = uploadFile;
	}

}
