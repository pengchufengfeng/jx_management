package com.jingxiang.common.controller.file;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.jingxiang.common.entity.common.ResponseBean;
import com.jingxiang.common.util.ImageUtils;

@RestController
@RequestMapping("/file")
public class FileController {
	// 图片路径
	@Value("${img.comPhotourl}")
	private String saveComDirectoryPath;
	@Value("${img.artPhotourl}")
    private String saveArtDirectoryPath;
	@Value("${artUrl}")
	private String artUrl;
	@Value("${comUrl}")
	private String comUrl;
	
	public FileController() {
		// TODO Auto-generated constructor stub
	}
	
	@PostMapping("/uploadComImage")
	public ResponseBean uploadComImage(MultipartFile file, ResponseBean rsp) {

		return rsp.setSuccess(saveComImage(file));
	}
	@PostMapping("/uploadArtImage")
	public ResponseBean uploadArtImage(MultipartFile file, ResponseBean rsp) {

		return rsp.setSuccess(saveArtImage(file));
	}
	
	public String saveComImage(MultipartFile pictureFile) {
		// 得到上传图片的地址
		String imgPath = null;
		try {
			// ImageUtils为之前添加的工具类
			imgPath = ImageUtils.upload(saveComDirectoryPath, pictureFile);
			if (imgPath != null) {
				// 将上传图片的地址封装到实体类
				System.out.println("-----------------图片上传成功！");
				return comUrl+ imgPath;
			} else {
				System.out.println("-----------------图片上传失败！");
				return comUrl+ imgPath;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return comUrl+ imgPath;
		}
	}
	
	public String saveArtImage(MultipartFile pictureFile) {
		// 得到上传图片的地址
		String imgPath = null;
		try {
			// ImageUtils为之前添加的工具类
			imgPath = ImageUtils.upload(saveArtDirectoryPath, pictureFile);
			if (imgPath != null) {
				// 将上传图片的地址封装到实体类
				System.out.println("-----------------图片上传成功！");
				return artUrl + imgPath;
			} else {
				System.out.println("-----------------图片上传失败！");
				return artUrl + imgPath;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return artUrl + imgPath;
		}
	}

	public String getSaveArtDirectoryPath() {
		return saveArtDirectoryPath;
	}

	public void setSaveArtDirectoryPath(String saveArtDirectoryPath) {
		this.saveArtDirectoryPath = saveArtDirectoryPath;
	}

	public String getArtUrl() {
		return artUrl;
	}

	public void setArtUrl(String artUrl) {
		this.artUrl = artUrl;
	}

	public String getComUrl() {
		return comUrl;
	}

	public void setComUrl(String comUrl) {
		this.comUrl = comUrl;
	}
		

}
