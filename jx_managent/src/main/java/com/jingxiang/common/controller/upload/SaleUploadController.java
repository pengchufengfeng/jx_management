package com.jingxiang.common.controller.upload;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.jingxiang.common.entity.Sale;
import com.jingxiang.common.entity.common.ResponseBean;
import com.jingxiang.common.service.SaleLoadService;
import com.jingxiang.common.service.SaleService;

@RestController
@CrossOrigin
@RequestMapping("/saleUpload")
public class SaleUploadController {
	private static String UPLOADED_FOLDER = "src/main/resources/static/temp/";

    @Autowired
    private SaleLoadService saleLoadService;
    @Autowired
    private SaleService saleService;

    @PostMapping("/saleExcelUpload")
    public ResponseBean singleFileUpload(MultipartFile file,ResponseBean rsp) {
        try {
            // Get the file and save it somewhere
            byte[] bytes = file.getBytes();
            Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
            Files.write(path, bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Print file data to html
        List<Sale> result = saleLoadService.castToSale(new File(UPLOADED_FOLDER + file.getOriginalFilename()));
        //添加数据库
        for(Sale sale : result) {
        	saleService.addOneSale(sale);
        }
        return  rsp.setSuccess("上传成功");
    }
	
	
}
