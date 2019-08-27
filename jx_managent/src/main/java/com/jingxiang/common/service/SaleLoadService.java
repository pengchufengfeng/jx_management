package com.jingxiang.common.service;

import java.io.File;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jingxiang.common.entity.Sale;

@Service
public interface SaleLoadService {
	  List<Sale> castToSale(File file);
}
