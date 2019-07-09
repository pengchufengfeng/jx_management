package com.jingxiang.common.controller.sale;

import com.github.pagehelper.PageInfo;
import com.jingxiang.common.entity.Commodity;
import com.jingxiang.common.entity.MonthData;
import com.jingxiang.common.entity.Sale;
import com.jingxiang.common.entity.common.Paging;
import com.jingxiang.common.entity.common.ResponseBean;
import com.jingxiang.common.entity.request.SalePageReq;
import com.jingxiang.common.entity.request.SaleRequest;
import com.jingxiang.common.service.CommodityService;
import com.jingxiang.common.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sale")
public class SaleController {
	@Autowired
	private SaleService saleService;
	@Autowired
	private CommodityService commodityService;

	@PostMapping("/findList")
	public List<Sale> findListSale(@RequestBody SaleRequest saleRequest) {
		Sale sale = new Sale();// 添加自定义查询
		sale.setCommodityName(saleRequest.getCommodityName());
		sale.setWayName(saleRequest.getWayName());
		if (saleRequest.getSortName() != null && saleRequest.getSortName() != "") {
			sale.setClassName(saleRequest.getSortName());
		}
		sale.setArtistId(saleRequest.getArtistId());
		return saleService.findListSale(sale);
	}// 列表查询

	@PostMapping("/findListByJx")
	public ResponseBean findListSaleByJx(@RequestBody SaleRequest saleRequest, ResponseBean rsp) {
		Sale sale = new Sale();// 添加自定义查询
		sale.setCommodityName(saleRequest.getCommodityName());
		sale.setArtistId(saleRequest.getArtistId());
		sale.setWayName(saleRequest.getWayName());
		sale.setSaleWay(saleRequest.getSaleWay());
		sale.setCommodityNum(saleRequest.getCommodityNum());
		sale.setEndDate(saleRequest.getEndDate());
		sale.setStartDate(saleRequest.getStartDate());

		return rsp.setSuccess(saleService.findListSale(sale));
	}// 列表查询

	@PostMapping("/findAllList")
	public ResponseBean findAllListSale(ResponseBean rsp) {
		return rsp.setSuccess(saleService.findAllListSale());
	}

	@PostMapping("/findPage")
	PageInfo<Sale> findPageSale(@RequestBody SalePageReq salePageReq) {
		Sale sale = new Sale();
		Paging page = new Paging();
		page.setPageNum(salePageReq.getPageNum());
		page.setPageSize(salePageReq.getPageSize());
		return saleService.findPageSale(page, sale);
	}// 分页查询

	@PostMapping("/findPageByJx")
	public ResponseBean findPageSaleByJx(@RequestBody SalePageReq salePageReq, ResponseBean rsp) {
		Sale sale = new Sale();
		Paging page = new Paging();
		page.setPageNum(salePageReq.getPageNum());
		page.setPageSize(salePageReq.getPageSize());
		return rsp.setSuccess(saleService.findPageSale(page, sale));
	}// 分页查询

	@PostMapping("/getOne")
	public Sale getOneSale(@RequestParam("id") String id) {
		return saleService.getOneSale(id);
	}

	@PostMapping("/getOneByJx")
	public ResponseBean getOneSaleByJx(@RequestParam("id") String id, ResponseBean rsp) {
		return rsp.setSuccess(saleService.getOneSale(id));
	}

	@PostMapping("/addOne")
	public ResponseBean addSale(@RequestBody Sale sale, ResponseBean rsp) {
		int saleNum = sale.getCommodityAmount();
		String comId = sale.getCommodityId();
		Commodity commodity = commodityService.getOneCommodity(comId);
		int comStock = commodity.getCommodityStock();
		if (saleNum <= comStock) {
			comStock = comStock - saleNum;
			if (comStock == 0) {
				commodity.setCommodityStock(comStock);
				commodity.setCommodityStatus("已售完");
				commodityService.updateOneCommodity(commodity);
				System.out.println("comStock" + comStock + "已售完");
			} else {
				commodity.setCommodityStock(comStock);
				commodity.setCommodityStatus("上架");
				commodityService.updateOneCommodity(commodity);
				System.out.println("comStock" + comStock + "上架");
			}
		} else {
			return rsp.setError("库存不足，请重新输入商品数量！");
		}
		String artistid = commodity.getArtistId();
		sale.setArtistId(artistid);
		return rsp.setSuccess(saleService.addOneSale(sale));
	}

	@PostMapping("/deleteOne")
	public ResponseBean deleteSale(@RequestParam("id") String id, ResponseBean rsp) {

		Sale oldSale = saleService.getOneSale(id);
		Commodity commodity = commodityService.getOneCommodity(oldSale.getCommodityId());
		// 目前库存
		int comStock = commodity.getCommodityStock();
		int saleNum = oldSale.getCommodityAmount();
		comStock += saleNum;
		if (comStock == 0) {
			commodity.setCommodityStock(comStock);
			commodity.setCommodityStatus("已售完");
			commodityService.updateOneCommodity(commodity);
			System.out.println("comStock" + comStock + "已售完");
		} else {
			commodity.setCommodityStock(comStock);
			commodity.setCommodityStatus("上架");
			commodityService.updateOneCommodity(commodity);
			System.out.println("comStock" + comStock + "上架");
		}
		return rsp.setSuccess(saleService.deleteOneSale(id));
	}

	@PostMapping("/updateOne")
	public ResponseBean updateSale(@RequestBody Sale sale, ResponseBean rsp) {

		int saleNum = sale.getCommodityAmount();
		String comId = sale.getCommodityId();
		Commodity commodity = commodityService.getOneCommodity(comId);
		Sale oldSale = saleService.getOneSale(sale.getId());
		// 目前库存
		int comStock = commodity.getCommodityStock();
		// 旧销售数量
		int oldSaleNum = oldSale.getCommodityAmount();
		// 旧的库存
		int oldStock = comStock + oldSaleNum;

		if (saleNum <= oldStock) {
			comStock = oldStock - saleNum;
			if (comStock == 0) {
				commodity.setCommodityStock(comStock);
				commodity.setCommodityStatus("已售完");
				commodityService.updateOneCommodity(commodity);
				System.out.println("comStock" + comStock + "已售完");
			} else {
				commodity.setCommodityStock(comStock);
				commodity.setCommodityStatus("上架");
				commodityService.updateOneCommodity(commodity);
				System.out.println("comStock" + comStock + "上架");
			}
		} else {
			 return rsp.setError("库存不足，请重新输入商品数量！");
		}
		String artistid = commodity.getArtistId();
		sale.setArtistId(artistid);
		return rsp.setSuccess(saleService.updateOneSale(sale));
	}

	@PostMapping("/getComSaleNum")
	public ResponseBean getComSaleNum(ResponseBean rsp, @RequestParam("id") String id) {

		return rsp.setSuccess(saleService.getComSaleNum(id));

	}

	// @PostMapping("/getByCommodityName")
	//// public int updateSale(@RequestParam("CommodityName") String
	// CommodityName ){
	//// return saleService.updateOneSale(sale);
	//// }

	@PostMapping("/allSalePrice")
	Integer allSalePrice(@RequestParam("artistId") String artistId) {
		return saleService.allSalePrice(artistId);
	}

	@PostMapping("/allFinalPrice")
	Integer allFinalPrice(@RequestParam("artistId") String artistId) {
		return saleService.allFinalPrice(artistId);
	}

	@PostMapping("/allCommodityAmount")
	Integer allCommodityAmount(@RequestParam("artistId") String artistId) {
		return saleService.allCommodityAmount(artistId);
	}

	@PostMapping("/monthSalePrice")
	MonthData monthSalePrice(@RequestParam("artistId") String artistId) {
		return saleService.monthSalePrice(artistId);
	}

	@PostMapping("/monthFinalPrice")
	MonthData monthFinalPrice(@RequestParam("artistId") String artistId) {
		return saleService.monthFinalPrice(artistId);
	}

	@PostMapping("/monthCommodityAmount")
	MonthData monthCommodityAmount(@RequestParam("artistId") String artistId) {
		return saleService.monthCommodityAmount(artistId);
	}

	@PostMapping("/platSaleAndFinallyPrice")
	List<MonthData> platSaleAndFinallyPrice(@RequestParam("artistId") String artistId) {
		return saleService.platSaleAndFinallyPrice(artistId);
	}

	@PostMapping("/classMonthCommodityAmount")
	List<MonthData> classMonthCommodityAmount(@RequestParam("artistId") String artistId) {
		return saleService.classMonthCommodityAmount(artistId);
	}

}
