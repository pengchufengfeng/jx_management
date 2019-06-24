package com.jingxiang.common.util;

import java.io.File;  
import java.io.FileInputStream;  
import java.io.FileOutputStream;  
  
import sun.misc.BASE64Decoder;  
import sun.misc.BASE64Encoder;  

	public class FileUitl {  
	  
	 /** 
	  * 将文件转成base64 字符串 
	  * @param path文件路径 
	  * @return  *  
	  * @throws Exception 
	  */  
	  
	public static String encodeBase64File(String  fileurl) throws Exception {  
	  File file = new File(fileurl);
	  if (!file.exists()){
		  return "0" ;
	  }
	  FileInputStream inputFile = new FileInputStream(file);  
	  byte[] buffer = new byte[(int) file.length()];  
	  inputFile.read(buffer);  
	  inputFile.close();  
	  return new BASE64Encoder().encode(buffer);  
	  
	 }  
	
	/** 
	  * 将base64字符解码保存文件 
	  * @param base64Code 
	  * @param targetPath 
	  * @throws Exception 
	  */  
	  
	 public static void decoderBase64File(String base64Code, String targetPath)  
	   throws Exception {  
	  byte[] buffer = new BASE64Decoder().decodeBuffer(base64Code);  
	  FileOutputStream out = new FileOutputStream(targetPath);  
	  out.write(buffer);  
	  out.close();  
	  
	 }  
	  
	 /** 
	  * 将base64字符保存文本文件 
	  * @param base64Code 
	  * @param targetPath 
	  * @throws Exception 
	  */  
	  
	 public static void toFile(String base64Code, String targetPath)  
	   throws Exception {  
	  
	  byte[] buffer = base64Code.getBytes();  
	  FileOutputStream out = new FileOutputStream(targetPath);  
	  out.write(buffer);  
	  out.close();  
	 }  
	 
	 
	 /**
	     * 删除单个文件
	     *
	     * @param fileName
	     *            要删除的文件的文件名
	     * @return 单个文件删除成功返回true，否则返回false
	     */
	    public static boolean deleteFile(String fileName) {
	        File file = new File(fileName);
	        // 如果文件路径所对应的文件存在，并且是一个文件，则直接删除
	        if (file.exists() && file.isFile()) {
	            if (file.delete()) {
	                System.out.println("删除单个文件" + fileName + "成功！");
	                return true;
	            } else {
	                System.out.println("删除单个文件" + fileName + "失败！");
	                return false;
	            }
	        } else {
	            System.out.println("删除单个文件失败：" + fileName + "不存在！");
	            return false;
	        }
	    }
}
