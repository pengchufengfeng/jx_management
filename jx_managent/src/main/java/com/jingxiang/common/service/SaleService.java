package com.jingxiang.common.service;

import com.github.pagehelper.PageInfo;
import com.jingxiang.common.entity.MonthData;
import com.jingxiang.common.entity.Sale;
import com.jingxiang.common.entity.common.Paging;

import java.util.List;

public interface SaleService {


	List<Sale> findListSale(Sale sale);//列表查询

	PageInfo<Sale> findPageSale(Paging page, Sale sale);//分页查询
	//获取所有销售
	List<Sale> findAllListSale();
	//获取销售详情
	Sale  getOneSale(String id);
	//删除销售
	 int deleteOneSale(String id);
	//更新销售
	 int updateOneSale(Sale sale);
	//新增销售
	 int addOneSale(Sale sale);
	 //获取销售量
	 Integer getComSaleNum(String commodityId);
	 

	 //
	List<Sale> getByCommodityName(String CommodityName);

	Integer allSalePrice(String artistId);
	Integer allFinalPrice(String artistId);
	Integer allCommodityAmount(String artistId);
	MonthData monthSalePrice(String artistId);
	MonthData monthFinalPrice(String artistId);
	MonthData monthCommodityAmount(String artistId);
	List<MonthData> platSaleAndFinallyPrice(String artistId);
	List<MonthData> classMonthCommodityAmount(String artistId);
}
