package com.jingxiang.common.dao;

import com.jingxiang.common.dao.core.CrudDao;
import com.jingxiang.common.entity.MonthData;
import com.jingxiang.common.entity.Sale;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SaleMapper extends CrudDao<Sale> {
    Integer allSalePrice(String artistId);
    Integer allFinalPrice(String artistId);
    Integer allCommodityAmount(String artistId);
    MonthData monthSalePrice(String artistId);
    MonthData monthFinalPrice(String artistId);
    MonthData monthCommodityAmount(String artistId);
    List<MonthData> platSaleAndFinallyPrice(String artistId);
    List<MonthData> classMonthCommodityAmount(String artistId);
    Integer getCommodityAmount(String commodityId);
}
