package com.jingxiang.common.service.impl;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jingxiang.common.dao.CommodityMapper;
import com.jingxiang.common.dao.PlatDetailMapper;
import com.jingxiang.common.entity.Sale;
import com.jingxiang.common.service.SaleLoadService;

@Service
public class SaleUploadServiceImpl  implements SaleLoadService{

	@Autowired
	CommodityMapper commodityMapper;
	@Autowired
	PlatDetailMapper platDetailMapper;
	@Override
	public List<Sale> castToSale(File file) {
		// TODO Auto-generated method stub
		 List<Sale> sales = new ArrayList<>();
	        Workbook workbook = null;
	        try {
	            workbook = new XSSFWorkbook(file);
	        } catch (IOException e) {
	            e.printStackTrace();
	        } catch (InvalidFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        Sheet sheet = (Sheet) workbook.getSheetAt(0);
	        int num = sheet.getLastRowNum() - sheet.getFirstRowNum();
	        
	        //Read steps
	        for (int i = 0; i < num; i++) {
	            Row row = sheet.getRow(i+1);
	            Sale sale = new Sale();
	            //sale.setPlatform(row.getCell(0).getStringCellValue());
	            //sale.setAction(row.getCell(1).getStringCellValue());
	            if(row != null) {
	            //商品
	            String commodityName = row.getCell(0).getStringCellValue();
	            String commodityId = commodityMapper.getIdByComName(commodityName);
	            //System.out.print("commodityId"+commodityId);
	            sale.setCommodityId(commodityId);
	            //匠人
	            String artistId = commodityMapper.getArtistIdByComName(commodityName);
	            sale.setArtistId(artistId);
	            //销售数量
	            int comAmount = (int) row.getCell(1).getNumericCellValue();
	            //System.out.print("comAmount"+comAmount);
	            sale.setCommodityAmount(comAmount);
	            //销售单价
	            sale.setPrePrice(row.getCell(2).getNumericCellValue());
	            //System.out.print("销售单价"+row.getCell(2).getNumericCellValue());
	            //销售额
	            sale.setSalePrice(row.getCell(3).getNumericCellValue());
	            //System.out.print("销售额"+row.getCell(3).getNumericCellValue());
	            //实际销售额
	            sale.setSaleFactPrice(row.getCell(4).getNumericCellValue());
	            //退款额
	            sale.setSaleBackPrice(row.getCell(5).getNumericCellValue());
	            //销售平台
	            String platName = row.getCell(6).getStringCellValue();
	            String activityName = row.getCell(7).getStringCellValue();
	            String platId = platDetailMapper.getIdByNameandStyle(platName, activityName);
	            sale.setSaleWay(platId);
	            //System.out.print("platId额"+platId);
	            //销售类型
	            sale.setSaleStyle(activityName);
	            //System.out.print("activityName额"+activityName);
	            //销售状态
	            sale.setSaleStatus(row.getCell(8).getStringCellValue());
	            //System.out.print("销售状态额"+row.getCell(6).getStringCellValue());
                //销售时间
	            //System.out.print("销售时间"+row.getCell(7).getDateCellValue());
	            Date saleDate = row.getCell(9).getDateCellValue();
	            //System.out.print("销售状态额"+row.getCell(9).getDateCellValue());
	            
	            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	            ParsePosition pos = new ParsePosition(8);
		        String saleDateString = formatter.format(saleDate);
		        //System.out.print("销售状态额22"+saleDateString);
		        //sale.setSaleDate(saleDate);
		        Date saleDateFormat;
				try {
					saleDateFormat = formatter.parse(saleDateString);
					//System.out.print("销售状态额22"+saleDateFormat);
					sale.setSaleDate(saleDateFormat);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        
	            //创建时间
	            Date currentTime = new Date();
	            String nowdateString = formatter.format(currentTime);
	            Date createDate = formatter.parse(nowdateString, pos);
	            sale.setCreateDate(createDate);
	            
	            //删除状态
	            sale.setDelFlag(0);
	            sales.add(sale);
	            }
	        }
	        try {
	            workbook.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return sales;
	    }
	

}
