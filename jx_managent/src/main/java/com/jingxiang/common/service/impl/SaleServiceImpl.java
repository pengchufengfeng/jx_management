package com.jingxiang.common.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jingxiang.common.dao.SaleMapper;
import com.jingxiang.common.entity.MonthData;
import com.jingxiang.common.entity.Sale;
import com.jingxiang.common.entity.common.Paging;
import com.jingxiang.common.service.CrudService;
import com.jingxiang.common.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional


public class SaleServiceImpl extends CrudService<SaleMapper,Sale> implements SaleService {

	@Autowired
    private SaleMapper saleMapper;
    @Override
    public List<Sale> findListSale(Sale sale) {
        return findList(sale);
    }

    @Override
    public PageInfo<Sale> findPageSale(Paging page, Sale sale) {
        PageHelper.startPage(page.getPageNum(), page.getPageSize(), page.getOrderBy());
        List<Sale> list = findList(sale);
        return new PageInfo<>(list);
    }

	@Override
	public Sale getOneSale(String id) {
		// TODO Auto-generated method stub
		return get(id);

	}

	@Override
	public int deleteOneSale(String id) {
		// TODO Auto-generated method stub
		deleteById(id);
		return 0;
	}

	@Override
	public int updateOneSale(Sale sale) {
		// TODO Auto-generated method stub
		save(sale);
		return 0;
	}

	@Override
	public String addOneSale(Sale sale) {
		// TODO Auto-generated method stub
		save(sale);
		return sale.getId();
	}

	@Override
	public List<Sale> getByCommodityName(String CommodityName) {


		return null;
	}

	@Override
	public Integer allSalePrice(String artistId) {
		return saleMapper.allSalePrice(artistId)==null?0:saleMapper.allSalePrice(artistId);
	}

	@Override
	public Integer allFinalPrice(String artistId) {
		return saleMapper.allFinalPrice(artistId)==null?0:saleMapper.allFinalPrice(artistId);
	}

	@Override
	public Integer allCommodityAmount(String artistId) {
		return saleMapper.allCommodityAmount(artistId)==null?0:saleMapper.allCommodityAmount(artistId);
	}

	@Override
	public MonthData monthSalePrice(String artistId) {
		return saleMapper.monthSalePrice(artistId);
	}

	@Override
	public MonthData monthFinalPrice(String artistId) {
		return saleMapper.monthFinalPrice(artistId);
	}

	@Override
	public MonthData monthCommodityAmount(String artistId) {
		return saleMapper.monthCommodityAmount(artistId);
	}

	@Override
	public List<MonthData> platSaleAndFinallyPrice(String artistId) {
		return saleMapper.platSaleAndFinallyPrice(artistId);
	}

	@Override
	public List<MonthData> classMonthCommodityAmount(String artistId) {
		return saleMapper.classMonthCommodityAmount(artistId);
	}

	@Override
	public List<Sale> findAllListSale() {
		// TODO Auto-generated method stub
		return findAllList();
	}

	@Override
	public Integer getComSaleNum(String commodityId) {
		// TODO Auto-generated method stub
		return saleMapper.getCommodityAmount(commodityId);
	}
    
}
