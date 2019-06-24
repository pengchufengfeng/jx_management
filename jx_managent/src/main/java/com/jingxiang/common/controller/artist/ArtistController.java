package com.jingxiang.common.controller.artist;


import com.github.pagehelper.PageInfo;
import com.jingxiang.common.entity.Artist;
import com.jingxiang.common.entity.ArtistNewPassword;
import com.jingxiang.common.entity.common.Paging;
import com.jingxiang.common.entity.common.ResponseBean;
import com.jingxiang.common.entity.request.ArtistPageReq;
import com.jingxiang.common.entity.request.ArtistRequest;
import com.jingxiang.common.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artist")
public class ArtistController {
    @Autowired
	private ArtistService artistService;

    @PostMapping("/findList")
	public List<Artist> findListArtist(@RequestBody ArtistRequest artistRequest){
		Artist artist = new Artist();//添加自定义查询
		artist.setArtistName(artistRequest.getArtistName());
		return artistService.findListArtist(artist);
	}//列表查询

	@PostMapping("/login")
	public String login(@RequestBody ArtistRequest artistRequest){
		Artist artist = new Artist();//添加自定义查询
        artist.setArtistName(artistRequest.getArtistName());
		artist.setPhone(artistRequest.getPhone());
		artist.setPassword(artistRequest.getPassword());
		return artistService.login(artist);
	}//匠人登录


    @PostMapping("/findListByJx")
   	public ResponseBean findListArtistByJx(@RequestBody ArtistRequest artistRequest,ResponseBean rsp){
   		Artist artist = new Artist();//添加自定义查询
   		artist.setArtistName(artistRequest.getArtistName());
   		return rsp.setSuccess(artistService.findListArtist(artist));
   	}//列表查询
    
    @PostMapping("/findAllList")
    public ResponseBean findAllListArtist(ResponseBean rsp){
    	return rsp.setSuccess(artistService.findAllListArtist());
    }
    
	@PostMapping("/findPage")
	PageInfo<Artist> findPageArtist(@RequestBody ArtistPageReq artistPageReq){
		Artist artist = new Artist();
		Paging page = new Paging();
		page.setPageNum(artistPageReq.getPageNum());
		page.setPageSize(artistPageReq.getPageSize());
		return artistService.findPageArtist(page,artist);
	}//分页查询
	@PostMapping("/findPageByJx")
	ResponseBean findPageArtistByJx(@RequestBody ArtistPageReq artistPageReq,ResponseBean rsp){
		Artist artist = new Artist();
		Paging page = new Paging();
		page.setPageNum(artistPageReq.getPageNum());
		page.setPageSize(artistPageReq.getPageSize());
		return rsp.setSuccess(artistService.findPageArtist(page,artist));
	}//分页查询
	
	@PostMapping("/getOne")
	public ResponseBean getOneArtist(@RequestParam("id") String id,ResponseBean rsp){
		return rsp.setSuccess(artistService.getOneArtist(id));
	}
	@PostMapping("/addOne")
	public ResponseBean addArtist(@RequestBody Artist artist,ResponseBean rsp){
		
		return rsp.setSuccess(artistService.addOneArtist(artist));
	}
	@PostMapping("/deleteOne")
	public ResponseBean deleteArtist(@RequestParam("id") String id,ResponseBean rsp){
		
		return rsp.setSuccess(artistService.deleteOneArtist(id));
	}
	@PostMapping("/updateOne")
	public ResponseBean updateArtist(@RequestBody Artist artist,ResponseBean rsp){
		return rsp.setSuccess(artistService.updateOneArtist(artist));
	}

	@PostMapping("/updatePassword")
	public String updatePassword(@RequestBody ArtistNewPassword artistNewPassword){
		return artistService.updatePassword(artistNewPassword);
	}

}

