package com.jingxiang.common.controller.commodity;

import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.jingxiang.common.entity.Commodity;
import com.jingxiang.common.entity.common.Paging;
import com.jingxiang.common.entity.common.ResponseBean;
import com.jingxiang.common.entity.request.CommodityPageReq;
import com.jingxiang.common.entity.request.CommodityRequet;
import com.jingxiang.common.service.CommodityService;
import com.jingxiang.common.util.ImageUtils;
import com.jingxiang.common.util.PinyinUtils;

@RestController
@RequestMapping("/commodity")
public class CommodityController {
	@Autowired
	private CommodityService commodityService;
	// 图片路径
	@Value("${img.photourl}")
	private String saveDirectoryPath;

	@PostMapping("/findList")
	public ResponseBean findListCommodity(@RequestBody CommodityRequet commodityRequet, ResponseBean rsp) {
		Commodity commodity = new Commodity();// 添加自定义查询
		commodity.setArtistName(commodityRequet.getArtistName());
		commodity.setCommodityName(commodityRequet.getCommodityName());
		commodity.setClassName(commodityRequet.getClassName());
		commodity.setCommodityStatus(commodityRequet.getCommodityStatus());
		commodity.setArtistId(commodityRequet.getArtistId());
		return rsp.setSuccess(commodityService.findListCommodity(commodity));
	}// 列表查询

	@PostMapping("/findAllList")
	public ResponseBean findAllListCommodity(ResponseBean rsp) {
		return rsp.setSuccess(commodityService.findAllListCommodity());
	}

	@PostMapping("/findPage")
	public ResponseBean findPageCommodity(@RequestBody CommodityPageReq commodityPageReq, ResponseBean rsp) {
		Commodity commodity = new Commodity();
		Paging page = new Paging();
		page.setPageNum(commodityPageReq.getPageNum());
		page.setPageSize(commodityPageReq.getPageSize());
		return rsp.setSuccess(commodityService.findPageCommodity(page, commodity));
	}// 分页查询

	@PostMapping("/getOne")
	public ResponseBean getOneCommodity(@RequestParam("id") String id, ResponseBean rsp) {

		return rsp.setSuccess(commodityService.getOneCommodity(id));
	}

	@PostMapping("/addOne")
	public ResponseBean addCommodity(@RequestBody Commodity commodity, ResponseBean rsp) {
        String comName = commodity.getCommodityName();
		String comNum = transComNUm(comName);
		commodity.setCommodityNum(comNum);
		return rsp.setSuccess(commodityService.addOneCommodity(commodity));
	}

	@PostMapping("/deleteOne")
	public ResponseBean deleteCommodity(@RequestParam("id") String id, ResponseBean rsp) {

		return rsp.setSuccess(commodityService.deleteOneCommodity(id));
	}

	@PostMapping("/updateOne")
	public ResponseBean updateCommodity(@RequestBody Commodity commodity, ResponseBean rsp, MultipartFile file) {
		/*
		 * System.out.println(commodity.getCommodityShelf()+"上架量");
		 * System.out.println(commodity.getCommodityStock()+"库量");
		 */
		String comName = commodity.getCommodityName();
		System.out.println("name"+comName);
		String comNum = transComNUm(comName);
		commodity.setCommodityNum(comNum);
		//System.out.println("num"+comNum);
		System.out.println("num2"+commodity.getCommodityNum());
		return rsp.setSuccess(commodityService.updateOneCommodity(commodity));

	}

	public String saveImage(MultipartFile pictureFile) {
		// 得到上传图片的地址
		String imgPath = null;
		try {
			// ImageUtils为之前添加的工具类
			imgPath = ImageUtils.upload(saveDirectoryPath, pictureFile);
			if (imgPath != null) {
				// 将上传图片的地址封装到实体类
				System.out.println("-----------------图片上传成功！");
				return imgPath;
			} else {
				System.out.println("-----------------图片上传失败！");
				return "http://localhost:8080/image/commodityPhoto/" + imgPath;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "http://localhost:8080/image/commodityPhoto/" + imgPath;
		}
	}

	@PostMapping("/uploadImage")
	public ResponseBean uploadImage(MultipartFile file, ResponseBean rsp) {
		return rsp.setSuccess(saveImage(file));
	}

	// @PostMapping("/getClassNum")
	public String getClassNum(@RequestParam("className") String className) {
		// return rsp.setSuccess(commodityService.getClassNum(className));
		return commodityService.getClassNum(className);
	}

	//@PostMapping("/getTransComNUm")
	public String transComNUm(@RequestParam("comName")  String comName){
		String[] names=comName.split("-");
		String fisrt = PinyinUtils.converterToFirstSpell(names[0]);
		String second = PinyinUtils.converterToFirstSpell(names[1]).toLowerCase().toString();
		String newstr = "";
        

		String newComNum = fisrt + newstr ;
		for(int i=0;i<second.length();i++){
			newComNum+=(int)(second.charAt(i)-96);
			
		}
		return newComNum;
	}
		
	}