/*
Navicat MySQL Data Transfer

Source Server         : jxpt
Source Server Version : 50719
Source Host           : 39.98.254.36:3306
Source Database       : jx_management

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2019-06-14 19:05:08
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_artist
-- ----------------------------
DROP TABLE IF EXISTS `sys_artist`;
CREATE TABLE `sys_artist` (
  `id` varchar(32) NOT NULL,
  `artist_name` varchar(255) DEFAULT NULL COMMENT '姓名',
  `title` varchar(255) DEFAULT NULL,
  `area` varchar(255) DEFAULT NULL,
  `info` varchar(255) DEFAULT NULL COMMENT '简介',
  `col_content` varchar(255) DEFAULT NULL,
  `col_date` datetime DEFAULT NULL COMMENT '合作时间',
  `rel_cetri` varchar(255) DEFAULT NULL COMMENT '相关证书',
  `auth_photo` varchar(255) DEFAULT NULL COMMENT '授权照片',
  `idz` varchar(255) DEFAULT NULL COMMENT '身份证正面',
  `idf` varchar(255) DEFAULT NULL COMMENT '身份证反面',
  `commodity_class` varchar(255) DEFAULT NULL COMMENT '商品类别',
  `creator` varchar(255) DEFAULT NULL,
  `modifier` varchar(255) DEFAULT NULL,
  `del_flag` int(1) DEFAULT '0',
  `create_date` datetime DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  `open_id` varchar(32) DEFAULT NULL,
  `session_key` varchar(32) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_artist
-- ----------------------------
INSERT INTO `sys_artist` VALUES ('0d7a76a414c44284824fde396967a7e8', 'a', 'a', 'a', 'a', 'a', '2019-05-08 00:00:00', 'http://localhost:8080/image/commodityPhoto/null', 'http://localhost:8080/image/commodityPhoto/null', 'http://localhost:8080/image/commodityPhoto/null', 'http://localhost:8080/image/commodityPhoto/null', null, null, null, '0', '2019-05-19 09:05:45', '2019-05-19 09:05:45', null, null, '1111', '11');
INSERT INTO `sys_artist` VALUES ('1', 'wuzhimin', null, null, 'string', null, null, 'string', 'string', 'string', 'string', 'string', null, 'string', '0', null, '2019-04-15 18:03:10', 'string', 'string', '17', '16');
INSERT INTO `sys_artist` VALUES ('2', '孙燕姿', '孙燕姿', '孙燕姿', '孙燕姿', null, null, null, null, null, null, null, null, null, '0', '2019-04-19 01:14:59', '2019-04-19 01:14:59', null, null, '123456', '18700001232');
INSERT INTO `sys_artist` VALUES ('4a2decba95ad4aca9e65deaaa4f0c450', '456546', '5465461', '654654', '654654', '1234543543543', '2019-04-23 00:00:00', '标签03 (1).png', '分组 (1).png', '标签03 (1).png', '彭楚风.jpg', null, null, null, '0', '2019-04-21 17:18:15', '2019-04-23 20:14:22', null, null, '3432432', '1883748324');
INSERT INTO `sys_artist` VALUES ('582de67f4fe34224b492aa18bcb089a5', 'string1', null, null, 'string', null, null, 'string', 'string', 'string', 'string', 'string', 'string', '582de67f4fe34224b492aa18bcb089a5', '0', '2019-04-11 20:27:30', '2019-04-11 20:27:30', 'string', 'string', '16', '15');
INSERT INTO `sys_artist` VALUES ('76c8dfef49e74a62aa37241df063b8bd', 'string2', null, null, 'string', null, null, 'string', 'string', 'string', 'string', 'string', 'string', '76c8dfef49e74a62aa37241df063b8bd', '0', '2019-04-11 20:27:25', '2019-04-11 20:27:25', 'string', 'string', '15', '14');
INSERT INTO `sys_artist` VALUES ('a208caff3ab34ee7a9eddeca67ac5c99', 'string3', null, null, 'string', null, null, 'string', 'string', 'string', 'string', 'string', 'string', 'a208caff3ab34ee7a9eddeca67ac5c99', '0', '2019-04-11 20:27:32', '2019-04-11 20:27:32', 'string', 'string', '14', '13');
INSERT INTO `sys_artist` VALUES ('c274fd70d5f948e59f2f039325373f3e', 'string4', null, null, 'string', null, null, 'string', 'string', 'string', 'string', 'string', 'string', 'c274fd70d5f948e59f2f039325373f3e', '0', '2019-04-11 20:27:31', '2019-04-11 20:27:31', 'string', 'string', '11', '10');
INSERT INTO `sys_artist` VALUES ('c781ab4e68364048987369e9631df715', '天天', '天天', '天天', '天天', null, null, null, null, null, null, null, null, null, '0', '2019-04-19 01:12:03', '2019-04-19 01:12:03', null, null, null, null);
INSERT INTO `sys_artist` VALUES ('ca854be9701d4e12b38d2a09101b4d2c', '小朋友', null, null, '', null, null, null, null, '', '', null, null, 'ca854be9701d4e12b38d2a09101b4d2c', '0', '2019-05-19 09:15:56', '2019-05-19 09:15:56', null, null, null, null);
INSERT INTO `sys_artist` VALUES ('d5954d1b99a74c69ac8d732cb37eeb91', 'string5', null, null, 'string', null, '2019-05-07 00:00:00', 'string', 'string', 'string', 'string', 'string', 'string', 'd5954d1b99a74c69ac8d732cb37eeb91', '0', '2019-04-15 17:49:33', '2019-05-17 01:41:47', 'string', 'string', '12', '11');
INSERT INTO `sys_artist` VALUES ('d6a79d40ff3a46b7b1938cc3fff7dd99', '网上搜', '网上搜', '网上搜', '网上搜', null, '2019-04-12 00:00:00', null, null, '新世界4月活动banner.png', 'KV.png', null, null, null, '0', '2019-04-19 01:16:17', '2019-04-21 15:28:49', null, null, '432423', '17737432432');
INSERT INTO `sys_artist` VALUES ('e2e3a26c08e74f03b4d43c2fc17ad360', 'string6', null, null, 'string', null, null, 'string', 'string', 'string', 'string', 'string', 'string', 'e2e3a26c08e74f03b4d43c2fc17ad360', '0', '2019-04-11 20:27:30', '2019-04-11 20:27:30', 'string', 'string', '13', '12');
INSERT INTO `sys_artist` VALUES ('f3990b462219448dbbf43078c4bffbf2', '冲冲冲', '大教授', '工业美术', '工业美术真真好', null, null, null, null, '', '', null, null, null, '0', '2019-05-17 00:44:45', '2019-05-17 00:44:45', null, null, '123456', '188845435435');

-- ----------------------------
-- Table structure for sys_class
-- ----------------------------
DROP TABLE IF EXISTS `sys_class`;
CREATE TABLE `sys_class` (
  `id` varchar(255) NOT NULL,
  `class_name` varchar(255) DEFAULT NULL,
  `class_num` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_class
-- ----------------------------
INSERT INTO `sys_class` VALUES ('1', '茶杯', '123');
INSERT INTO `sys_class` VALUES ('2', '茶盘', '456');

-- ----------------------------
-- Table structure for sys_commodity
-- ----------------------------
DROP TABLE IF EXISTS `sys_commodity`;
CREATE TABLE `sys_commodity` (
  `id` varchar(32) NOT NULL,
  `commodity_num` varchar(255) DEFAULT NULL COMMENT '商品编号',
  `commodity_name` varchar(255) DEFAULT NULL COMMENT '商品名称',
  `class_name` varchar(255) DEFAULT NULL COMMENT '分类',
  `commodity_scale` varchar(255) DEFAULT NULL COMMENT '尺寸',
  `artist` varchar(255) DEFAULT NULL COMMENT '匠人',
  `way` varchar(255) DEFAULT NULL COMMENT '工艺',
  `palace` varchar(255) DEFAULT NULL COMMENT '产地',
  `dust` varchar(255) DEFAULT NULL COMMENT '泥土',
  `temput` varchar(255) DEFAULT NULL COMMENT '烧纸温度',
  `note` varchar(255) DEFAULT NULL COMMENT '简介',
  `creator` varchar(255) DEFAULT NULL,
  `del_flag` int(1) DEFAULT '0',
  `modifier` varchar(255) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  `commodity_stock` bigint(20) DEFAULT NULL COMMENT '商品库存',
  `commodity_shelf` bigint(20) DEFAULT NULL,
  `commodity_status` varchar(20) DEFAULT NULL COMMENT '商品状态',
  `photo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_commodity
-- ----------------------------
INSERT INTO `sys_commodity` VALUES ('02a3a91bd63946efb5ae087afa129e07', '01', '商品一', '茶杯', '2', '1', '2', '2', '2', '2', '2', null, '0', '02a3a91bd63946efb5ae087afa129e07', '2019-04-21 12:07:41', '2019-04-21 12:07:41', '3', '0', '上架', '');
INSERT INTO `sys_commodity` VALUES ('02a988e96bcf4e58813ca23f07c78792', '02', '商品二', '茶杯', '1', '1', '1', '1', '1', '1', '1', null, '0', '02a988e96bcf4e58813ca23f07c78792', '2019-04-23 19:56:20', '2019-04-23 19:56:20', '11', '0', '上架', 'http://localhost:8080/image/commodityPhoto/6160d6c9383245939062638bc8f7dab6.jpg');
INSERT INTO `sys_commodity` VALUES ('080dfed7f0a24bc1b5248f09132ff47a', '03', '商品三', '茶杯', '3', '1', '3', '3', '3', '3', '333', null, '0', '080dfed7f0a24bc1b5248f09132ff47a', '2019-04-23 20:03:20', '2019-04-23 20:03:20', '3', '0', '销售中', '彭楚风.jpg');
INSERT INTO `sys_commodity` VALUES ('1', '04', '商品20', '茶盘', null, '1', null, null, null, null, null, null, '0', '1', '2019-04-06 21:26:00', '2019-04-07 21:25:55', '3', '3', '销售中', 'https://ytq.oss-cn-beijing.aliyuncs.com/file/9d15effcbcae3cd1c358b98b97786cecc687c5b4.png');
INSERT INTO `sys_commodity` VALUES ('13dbc193447d44fc982ef29d06ff9361', '05', '商品5', '茶盘', null, '2', null, null, null, null, null, null, '0', '13dbc193447d44fc982ef29d06ff9361', '2019-04-20 13:13:32', '2019-04-20 13:13:32', '0', '0', '上架', '/www/jingxiang/commodityPhoto/temp/彭楚风生活照.jpg');
INSERT INTO `sys_commodity` VALUES ('1c7a4e1df8394f33b2a05fed1e31b17c', '06', '商品19', '茶杯', '1', '1', '1', '12', '2', '21', '11', null, '0', null, '2019-04-23 20:05:53', '2019-04-23 20:05:53', '111', '0', '上架', '彭楚风.jpg');
INSERT INTO `sys_commodity` VALUES ('2', '07', '商品6', '茶盘', null, '1', null, null, null, null, null, null, '0', '2', null, null, null, null, '1', 'https://ytq.oss-cn-beijing.aliyuncs.com/file/9d15effcbcae3cd1c358b98b97786cecc687c5b4.png');
INSERT INTO `sys_commodity` VALUES ('214c04d97ccf4e6eb351a3663a8426d1', '08', '商品18', '茶杯', '33', '2', '3', '3', '3', '3', '3', null, '0', '214c04d97ccf4e6eb351a3663a8426d1', '2019-05-19 09:16:43', '2019-05-20 21:53:24', '1', '1', '上架', 'http://localhost:8080/image/commodityPhoto/null');
INSERT INTO `sys_commodity` VALUES ('3', '09', '商品7', '茶壶', '23435', '1', '543534', '5435345', '543534', '543534', '5435345', null, '0', '3', null, '2019-05-15 23:45:12', '12312321', null, '1', 'https://ytq.oss-cn-beijing.aliyuncs.com/file/9d15effcbcae3cd1c358b98b97786cecc687c5b4.png');
INSERT INTO `sys_commodity` VALUES ('4', '10', '商品8', '茶盘', null, '2', null, null, null, null, null, null, '0', '4', '2019-04-14 23:58:58', '2019-04-14 23:58:58', null, null, '上架', '/www/jingxiang/commodityPhoto/temp/彭楚风.jpg');
INSERT INTO `sys_commodity` VALUES ('49bfa8ec55ff4dbe9e4f7ac544566a8f', '11', '商品9', '茶盘', null, '2', null, null, null, null, null, null, '0', '49bfa8ec55ff4dbe9e4f7ac544566a8f', '2019-04-20 00:12:55', '2019-04-20 00:12:55', '0', '0', '上架', '/www/jingxiang/commodityPhoto/temp/彭楚风生活照.jpg');
INSERT INTO `sys_commodity` VALUES ('5900f42697384ffb9f3f38ccc100c4c2', '12', '商品10', '茶盘', null, '2', null, null, null, null, null, null, '0', '5900f42697384ffb9f3f38ccc100c4c2', '2019-04-23 19:48:38', '2019-04-23 19:48:38', '0', '0', '上架', null);
INSERT INTO `sys_commodity` VALUES ('62d2b743bf1f47a69144c556b3b67f14', '13', '商品11', '茶杯', '2', '0d7a76a414c44284824fde396967a7e8', '2', '2', '2', '2', '2', null, '0', null, '2019-05-20 21:53:51', '2019-05-20 21:53:51', '2', '2', '上架', 'http://localhost:8080/image/commodityPhoto/null');
INSERT INTO `sys_commodity` VALUES ('65f586f482414679a6450da9591e3de1', '14', '商品12', '茶杯', null, '2', '1', '1', '1', '1', null, null, '0', '65f586f482414679a6450da9591e3de1', '2019-04-23 20:01:36', '2019-04-23 20:01:36', '11', '0', '上架', 'http://localhost:8080/image/commodityPhoto/6160d6c9383245939062638bc8f7dab6.jpg');
INSERT INTO `sys_commodity` VALUES ('66f9b265f40f43829ee67c70acbe4239', '15', '商品·13', '茶杯', '1', '2', '1', '12', '2', '21', '12', null, '0', '66f9b265f40f43829ee67c70acbe4239', '2019-04-23 20:04:59', '2019-04-23 20:04:59', '111', '0', '上架', '彭楚风.jpg');
INSERT INTO `sys_commodity` VALUES ('6730053b12c64b56b7486b87b17f5217', '16', '商品14', '茶盘', null, '2', null, null, null, null, null, null, '0', '6730053b12c64b56b7486b87b17f5217', '2019-04-19 01:28:50', '2019-04-19 01:28:50', null, null, '上架', '/www/jingxiang/commodityPhoto/temp/标签03 拷贝 3.png');
INSERT INTO `sys_commodity` VALUES ('7f7704625d59437987f80df9a18c18c5', '17', '商品15', '茶杯', '1', 'c274fd70d5f948e59f2f039325373f3e', 'w', '', '', '4', '444', null, '0', '7f7704625d59437987f80df9a18c18c5', '2019-05-20 23:04:01', '2019-05-23 19:35:32', '60', '60', '上架', '');
INSERT INTO `sys_commodity` VALUES ('81b18f74c45741ccbf08437776fd013c', '18', '商品16', '茶盘', null, '2', null, null, null, null, null, null, '0', '81b18f74c45741ccbf08437776fd013c', '2019-04-20 00:16:37', '2019-04-20 00:16:37', '0', '60', '上架', '/www/jingxiang/commodityPhoto/temp/彭楚风生活照.jpg');
INSERT INTO `sys_commodity` VALUES ('b133dcfc5f1a466380921a55bf493d86', '19', '商品17', '茶盘', null, '2', null, null, null, null, null, null, '0', 'b133dcfc5f1a466380921a55bf493d86', '2019-04-20 13:14:19', '2019-04-20 13:14:19', '0', '0', '上架', '/www/jingxiang/commodityPhoto/temp/彭楚风生活照.jpg');

-- ----------------------------
-- Table structure for sys_operation
-- ----------------------------
DROP TABLE IF EXISTS `sys_operation`;
CREATE TABLE `sys_operation` (
  `id` varchar(32) NOT NULL COMMENT '平台编号',
  `platid` varchar(32) DEFAULT NULL,
  `activity_name` varchar(255) DEFAULT NULL,
  `commodity_name` varchar(255) DEFAULT NULL,
  `current_activity` varchar(255) DEFAULT NULL,
  `creator` varchar(255) DEFAULT NULL,
  `modifier` varchar(255) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `del_flag` int(1) DEFAULT '0',
  `artistid` varchar(255) DEFAULT NULL,
  `pre_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_operation
-- ----------------------------
INSERT INTO `sys_operation` VALUES ('0d5266d3c6814fb18aada13da8916d55', '2', '活动test2', '商品一', '静象入库', null, null, '2019-05-20 23:13:07', '2019-05-20 23:13:07', '0', '5095b497a4b543c9b1a500043616610d', '2019-05-20 00:00:00');
INSERT INTO `sys_operation` VALUES ('1', '1', 'test', '商品二', '静象入库', null, '1', '2019-04-10 18:13:44', null, '0', '1', '2019-04-10 21:48:20');
INSERT INTO `sys_operation` VALUES ('12', '4', 'string', '商品三', '静象入库', null, '111', '2019-05-17 01:17:13', '2019-04-19 01:00:08', '0', 'c781ab4e68364048987369e9631df715', '2019-05-22 00:00:00');
INSERT INTO `sys_operation` VALUES ('12186e9aa9804f4190491c21a3ca36e9', '6', '5435435', '商品四', '静象入库', null, null, '2019-05-17 01:18:14', '2019-04-19 00:56:57', '0', 'f3990b462219448dbbf43078c4bffbf2', '2019-05-30 00:00:00');
INSERT INTO `sys_operation` VALUES ('126954eccc624f3baf7cae85ba900949', null, '222211', '商品五', '静象入库', null, '126954eccc624f3baf7cae85ba900949', '2019-04-21 17:20:53', '2019-04-21 17:20:53', '1', null, null);
INSERT INTO `sys_operation` VALUES ('2', '1', 'string', '商品六', 'string', null, '111', '2019-04-19 23:27:00', null, '0', 'string', '2019-04-10 18:36:42');
INSERT INTO `sys_operation` VALUES ('239d2e4283504e418a697bd2586c26d9', '1', 'test', null, 'rrr', null, null, '2019-04-12 22:13:40', '2019-04-10 18:36:42', '0', 'e2e3a26c08e74f03b4d43c2fc17ad360', '2019-04-10 18:36:42');
INSERT INTO `sys_operation` VALUES ('2bc47b3e000b4be4b0722e5f0c444587', 'string', 'tt45', null, 'string', 'string', '2bc47b3e000b4be4b0722e5f0c444587', '2019-04-19 23:19:21', '2019-04-19 23:19:21', '1', 'string', '2019-04-19 00:00:00');
INSERT INTO `sys_operation` VALUES ('3', 'string', 'string', null, 'string', null, 'string', '2019-04-19 23:48:04', null, '0', 'string', '2019-04-12 00:00:00');
INSERT INTO `sys_operation` VALUES ('31b0af3fe5c04117818c29c8d189eb90', null, 'tesst1', null, '静象入库', null, '31b0af3fe5c04117818c29c8d189eb90', '2019-04-23 20:11:43', '2019-04-23 20:11:43', '1', null, null);
INSERT INTO `sys_operation` VALUES ('4', '4', '活动4', null, '产品拍照', null, null, null, null, '0', '76c8dfef49e74a62aa37241df063b8bd', '2019-04-10 00:00:00');
INSERT INTO `sys_operation` VALUES ('42b55a18b621423a99c3c0686d4008dd', '6', '5435435', null, '后台上传', null, null, '2019-05-17 01:18:32', '2019-04-16 00:13:22', '0', '5095b497a4b543c9b1a500043616610d', '2019-05-30 00:00:00');
INSERT INTO `sys_operation` VALUES ('4bfce23699984408a12211cfb6b0e1a9', null, 'tesst1', null, '静象入库', null, '4bfce23699984408a12211cfb6b0e1a9', '2019-04-23 20:12:00', '2019-04-23 20:12:00', '1', null, null);
INSERT INTO `sys_operation` VALUES ('539d8d4eb04143b9ae04a6e73120f6d3', null, 'test', null, '后台上传', null, null, '2019-04-16 00:07:52', '2019-04-16 00:07:52', '0', 'e2e3a26c08e74f03b4d43c2fc17ad360', null);
INSERT INTO `sys_operation` VALUES ('68bf1bcba64640b7b74f533ce0c84e36', '1', 'test', null, 'rrr', null, null, '2019-04-12 22:14:15', '2019-04-12 22:14:15', '0', '582de67f4fe34224b492aa18bcb089a5', '2019-04-10 00:00:00');
INSERT INTO `sys_operation` VALUES ('7124f1aa808449aa86c468dccd85c3af', 'string', 'string111', 'string', 'string', 'string', 'string', '2019-05-28 22:37:54', '2019-05-28 22:37:54', '0', 'string', null);
INSERT INTO `sys_operation` VALUES ('72a08a9b949345acaa6b3365142066ba', null, '天黑黑', null, '平台审核', null, '72a08a9b949345acaa6b3365142066ba', '2019-04-19 01:06:19', '2019-04-19 01:06:19', '1', null, null);
INSERT INTO `sys_operation` VALUES ('8554f21fb55047b38d789b2b273278fa', null, 'test', null, '静象入库', null, null, '2019-04-15 23:59:36', '2019-04-15 23:59:36', '0', null, null);
INSERT INTO `sys_operation` VALUES ('9009114c19e1420ab285bfa6c3486c5e', 'c5be3b008f3d45b7bbe47c8afdd24eb7', 'test', null, '静象入库', null, null, '2019-05-17 01:07:34', '2019-04-19 00:58:19', '0', '5095b497a4b543c9b1a500043616610d', '2019-05-29 00:00:00');
INSERT INTO `sys_operation` VALUES ('97560164ae1941558a65d36e9058ef81', '1', 'test', null, 'rrr', null, null, '2019-04-12 22:14:15', '2019-04-12 22:14:15', '0', '582de67f4fe34224b492aa18bcb089a5', '2019-04-10 00:00:00');
INSERT INTO `sys_operation` VALUES ('a42c6c504d0d498691f34428efb337a1', 'string', '222211', null, 'string', 'string', 'a42c6c504d0d498691f34428efb337a1', '2019-04-19 23:24:26', '2019-04-19 23:24:26', '1', 'string', '2019-04-19 00:00:00');
INSERT INTO `sys_operation` VALUES ('b371121d250144bdbb6e3920321b7f5f', null, 'test', null, '活动结束', null, null, '2019-04-15 23:59:53', '2019-04-15 23:59:53', '0', 'e2e3a26c08e74f03b4d43c2fc17ad360', null);
INSERT INTO `sys_operation` VALUES ('b888d21cef674ef7afa46b0ad01c97dc', null, '45654645654654', null, '平台审核', null, null, '2019-04-16 00:12:46', '2019-04-16 00:12:46', '0', 'e2e3a26c08e74f03b4d43c2fc17ad360', null);
INSERT INTO `sys_operation` VALUES ('c62491ead855477b83bf70ccb33b55b1', 'c5be3b008f3d45b7bbe47c8afdd24eb7', '5435435', null, '静象入库', null, null, '2019-05-17 01:16:18', '2019-04-19 00:57:39', '0', 'd6a79d40ff3a46b7b1938cc3fff7dd99', '2019-05-23 00:00:00');
INSERT INTO `sys_operation` VALUES ('c635bdeff4a24d7d97d4de00dd876f19', '1', 'test', null, 'rrr', null, 'c635bdeff4a24d7d97d4de00dd876f19', '2019-04-12 22:14:14', '2019-04-12 22:14:14', '1', '582de67f4fe34224b492aa18bcb089a5', '2019-04-10 00:00:00');
INSERT INTO `sys_operation` VALUES ('cacce6ca01a74f4e9d6efa7ea04b6d99', 'string', 'tt40005', null, 'string', 'string', 'cacce6ca01a74f4e9d6efa7ea04b6d99', '2019-04-19 23:20:52', '2019-04-19 23:20:52', '1', 'string', '2019-04-19 00:00:00');
INSERT INTO `sys_operation` VALUES ('d7623fb8504e4498bae46032295ca2f2', '2', 'test1', null, '平台审核', null, null, '2019-05-20 23:12:42', '2019-04-23 20:12:45', '0', 'd6a79d40ff3a46b7b1938cc3fff7dd99', '2019-05-30 00:00:00');
INSERT INTO `sys_operation` VALUES ('dd4d430933164dbfa6374f041bd44e2b', '1', 'test', null, 'rrr', null, null, '2019-04-12 22:14:13', '2019-04-12 22:14:13', '0', '582de67f4fe34224b492aa18bcb089a5', '2019-04-10 00:00:00');
INSERT INTO `sys_operation` VALUES ('e72630b2346140dd94eb28588d621949', '1', 'test', null, 'rrr', null, null, '2019-04-12 22:14:12', '2019-04-12 22:14:12', '0', '582de67f4fe34224b492aa18bcb089a5', '2019-04-10 00:00:00');
INSERT INTO `sys_operation` VALUES ('e862b42294dd45d3883f8ea2820b108c', 'string', 'string', null, 'string', 'string', 'e862b42294dd45d3883f8ea2820b108c', '2019-04-19 23:10:08', '2019-04-19 23:10:08', '1', 'string', null);

-- ----------------------------
-- Table structure for sys_permission
-- ----------------------------
DROP TABLE IF EXISTS `sys_permission`;
CREATE TABLE `sys_permission` (
  `permission_name` varchar(255) DEFAULT NULL,
  `id` varchar(255) NOT NULL,
  `status` varchar(255) DEFAULT NULL,
  `parent_id` varchar(255) DEFAULT NULL,
  `permission_code` varchar(255) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `modifier` varchar(255) DEFAULT NULL,
  `creator` varchar(255) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  `del_flag` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_permission
-- ----------------------------
INSERT INTO `sys_permission` VALUES ('功能一', '1', '0', '0', '01', null, null, null, null, null);
INSERT INTO `sys_permission` VALUES ('功能二', '2', '0', '0', '02', null, null, null, null, null);

-- ----------------------------
-- Table structure for sys_plat
-- ----------------------------
DROP TABLE IF EXISTS `sys_plat`;
CREATE TABLE `sys_plat` (
  `id` varchar(32) NOT NULL,
  `way_name` varchar(255) DEFAULT NULL COMMENT '平台名称',
  `proportion` varchar(255) DEFAULT NULL COMMENT '平台比例',
  `creator` varchar(255) DEFAULT NULL,
  `del_flag` int(1) DEFAULT '0',
  `modifier` varchar(255) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_plat
-- ----------------------------
INSERT INTO `sys_plat` VALUES ('1', '东家', '1', null, '1', '1', null, null);
INSERT INTO `sys_plat` VALUES ('180ecc6b9e364bc99fbe15ef6abf9be2', 'tt22', null, null, '1', '180ecc6b9e364bc99fbe15ef6abf9be2', '2019-04-23 20:12:20', '2019-04-23 20:12:24');
INSERT INTO `sys_plat` VALUES ('2', '寺库', null, null, '0', null, null, '2019-04-21 11:46:22');
INSERT INTO `sys_plat` VALUES ('3', '茶语', null, null, '0', null, null, null);
INSERT INTO `sys_plat` VALUES ('4', '有赞', null, null, '0', null, null, null);
INSERT INTO `sys_plat` VALUES ('4de3b1408f9a47b8b4037abb7a302ddb', '平台123', null, null, '1', '4de3b1408f9a47b8b4037abb7a302ddb', '2019-04-19 01:09:53', '2019-04-19 01:09:53');
INSERT INTO `sys_plat` VALUES ('4ff8b9d8005e4fc0add9f63b3ecae72a', '东家', null, null, '0', null, '2019-05-20 23:11:46', '2019-05-20 23:11:46');
INSERT INTO `sys_plat` VALUES ('5', '寺库艺术', null, null, '0', null, null, null);
INSERT INTO `sys_plat` VALUES ('533a96d47ddd4014818831e8d3c797cf', '东家123', null, null, '1', '533a96d47ddd4014818831e8d3c797cf', '2019-04-21 11:46:29', '2019-05-17 00:21:19');
INSERT INTO `sys_plat` VALUES ('5567649239dc4df3b87888ee7f3e0b13', '泡泡大傻子', null, null, '1', '5567649239dc4df3b87888ee7f3e0b13', '2019-04-15 23:29:40', '2019-04-15 23:29:40');
INSERT INTO `sys_plat` VALUES ('6', '百匠大集', null, null, '0', null, null, '2019-04-15 23:29:24');
INSERT INTO `sys_plat` VALUES ('696fcc48010f4c6a996cb0db77591708', '上传系统', null, null, '1', '696fcc48010f4c6a996cb0db77591708', '2019-04-21 17:21:26', '2019-04-21 17:21:26');
INSERT INTO `sys_plat` VALUES ('7', 'string3', null, null, '1', '7', null, '2019-04-15 15:18:02');
INSERT INTO `sys_plat` VALUES ('c5be3b008f3d45b7bbe47c8afdd24eb7', '薰衣草', null, null, '1', 'c5be3b008f3d45b7bbe47c8afdd24eb7', '2019-05-17 00:21:28', '2019-05-17 00:21:28');

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `creator` varchar(255) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `role_name` varchar(255) DEFAULT NULL,
  `id` varchar(255) NOT NULL,
  `role_code` varchar(255) DEFAULT NULL,
  `del_flag` varchar(255) DEFAULT NULL,
  `modifier` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES (null, null, null, '管理员', '1', 'admin', null, null);
INSERT INTO `sys_role` VALUES (null, null, null, '普通用户', '2', 'user', null, null);

-- ----------------------------
-- Table structure for sys_role_permission
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_permission`;
CREATE TABLE `sys_role_permission` (
  `id` varchar(255) NOT NULL,
  `role_id` varchar(255) DEFAULT NULL,
  `modifier` varchar(255) DEFAULT NULL,
  `creator` varchar(255) DEFAULT NULL,
  `permission_id` varchar(255) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `del_flag` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role_permission
-- ----------------------------
INSERT INTO `sys_role_permission` VALUES ('1', '1', null, null, '1', null, null, null);
INSERT INTO `sys_role_permission` VALUES ('2', '1', null, null, '2', null, null, null);

-- ----------------------------
-- Table structure for sys_sale
-- ----------------------------
DROP TABLE IF EXISTS `sys_sale`;
CREATE TABLE `sys_sale` (
  `id` varchar(32) NOT NULL,
  `commodity_id` varchar(255) DEFAULT NULL,
  `creator` varchar(255) DEFAULT NULL,
  `modifier` varchar(255) DEFAULT NULL,
  `update_date` varchar(255) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `del_flag` int(1) DEFAULT '0' COMMENT '商品销售量',
  `sale_way` varchar(32) DEFAULT NULL COMMENT '销售平台',
  `sale_price` decimal(10,0) DEFAULT NULL COMMENT '商品销售价',
  `final_price` decimal(10,0) DEFAULT NULL COMMENT '商品结算价',
  `pre_price` decimal(10,0) DEFAULT NULL,
  `sale_date` datetime DEFAULT NULL,
  `sale_style` varchar(255) DEFAULT NULL COMMENT '结算类型',
  `artist_id` varchar(32) DEFAULT NULL COMMENT '匠人id',
  `commodity_amount` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of sys_sale
-- ----------------------------
INSERT INTO `sys_sale` VALUES ('1', '7f7704625d59437987f80df9a18c18c5', 'string', 'string', '2019-04-10 14:51:01.21', '2019-04-10 14:51:01', '0', '1', '44', '35', '33', '2019-04-13 00:00:00', '正常价', '1', '500');
INSERT INTO `sys_sale` VALUES ('1322222', '7f7704625d59437987f80df9a18c18c5', 'string', '1322222', '2019-04-10 14:51:01.21', '2019-04-10 14:51:01', '0', '1', '2', '33', '33', '2019-04-13 14:42:47', '正常价', '1', '2');
INSERT INTO `sys_sale` VALUES ('13232222', '7f7704625d59437987f80df9a18c18c5', 'string', '13232222', '2019-04-10 14:51:01.21', '2019-04-10 14:51:01', '0', '1', '2', '33', '33', '2019-04-13 14:42:47', '正常价', '1', '2');
INSERT INTO `sys_sale` VALUES ('19ff259e7d634103a4ea2c2754541453', '02a3a91bd63946efb5ae087afa129e07', null, null, '2019-04-19 01:53:13.71', '2019-01-01 01:47:40', '0', null, '4324', '432432', '432432', '2019-04-23 00:00:00', '正常价', '1', '2');
INSERT INTO `sys_sale` VALUES ('1fad33fs', '02a3a91bd63946efb5ae087afa129e07', 'string', '1fad33fs', '2019-04-10 14:51:01.21', '2019-04-10 14:51:01', '0', '1', '2', '33', '33', '2019-04-13 14:42:47', '正常价', '1', '2');
INSERT INTO `sys_sale` VALUES ('1fad3fs', '1', 'string', '1fad3fs', '2019-04-10 14:51:01.21', '2019-04-10 14:51:01', '0', '1', '2', '33', '33', '2019-04-13 14:42:47', '正常价', '1', '2');
INSERT INTO `sys_sale` VALUES ('1fadfs', '1', 'string', '1fadfs', '2019-04-10 14:51:01.21', '2019-04-10 14:51:01', '0', '1', '2', '33', '33', '2019-04-13 14:42:47', '正常价', '1', '2');
INSERT INTO `sys_sale` VALUES ('2', '1', 'string', '2', '2019-04-10 14:51:01.21', '2019-04-10 14:51:01', '0', '1', '2', '33', '33', '2019-04-13 14:42:47', '正常价', '1', '3');
INSERT INTO `sys_sale` VALUES ('22', '1', 'string', '22', '2019-04-10 14:51:01.21', '2019-04-10 14:51:01', '0', '1', '2', '33', '33', '2019-04-13 14:42:47', '正常价', '1', '3');
INSERT INTO `sys_sale` VALUES ('223', '1', 'string', '223', '2019-04-10 14:51:01.21', '2019-04-10 14:51:01', '0', '1', '2', '33', '33', '2019-04-13 14:42:47', '正常价', '1', '3');
INSERT INTO `sys_sale` VALUES ('2234', '1', 'string', '2234', '2019-04-10 14:51:01.21', '2019-04-10 14:51:01', '0', '1', '2', '33', '33', '2019-04-13 14:42:47', '正常价', '1', '3');
INSERT INTO `sys_sale` VALUES ('224', '1', 'string', '224', '2019-04-10 14:51:01.21', '2019-04-10 14:51:01', '0', '1', '2', '33', '33', '2019-04-13 14:42:47', '正常价', '1', '3');
INSERT INTO `sys_sale` VALUES ('2424', '1', 'string', '2424', '2019-04-10 14:51:01.21', '2019-04-10 14:51:01', '0', '1', '2', '33', '33', '2019-04-13 14:42:47', '正常价', '1', '3');
INSERT INTO `sys_sale` VALUES ('24324', '1', 'string', '24324', '2019-04-10 14:51:01.21', '2019-04-10 14:51:01', '0', '1', '2', '33', '33', '2019-04-13 14:42:47', '3', '1', '4');
INSERT INTO `sys_sale` VALUES ('2434', '1', 'string', '2434', '2019-04-10 14:51:01.21', '2019-04-10 14:51:01', '0', '1', '2', '33', '33', '2019-04-13 14:42:47', '3', '1', '4');
INSERT INTO `sys_sale` VALUES ('24344', '1', 'string', '24344', '2019-04-10 14:51:01.21', '2019-04-10 14:51:01', '0', '1', '2', '33', '33', '2019-04-13 14:42:47', '3', '1', '4');
INSERT INTO `sys_sale` VALUES ('243444', '1', 'string', '243444', '2019-04-10 14:51:01.21', '2019-04-10 14:51:01', '0', '1', '2', '33', '33', '2019-04-13 14:42:47', '3', '1', '4');
INSERT INTO `sys_sale` VALUES ('24dd333444', '1', 'string', '24dd333444', '2019-04-10 14:51:01.21', '2019-04-10 14:51:01', '0', '1', '2', '33', '33', '2019-04-13 14:42:47', '3', '1', '2');
INSERT INTO `sys_sale` VALUES ('24dd33444', '1', 'string', '24dd33444', '2019-04-10 14:51:01.21', '2019-04-10 14:51:01', '1', '1', '2', '33', '33', '2019-04-13 14:42:47', '3', '1', '2');
INSERT INTO `sys_sale` VALUES ('24dd3444', '1', 'string', '24dd3444', '2019-04-10 14:51:01.21', '2019-04-10 14:51:01', '0', '1', '2', '33', '33', '2019-04-13 14:42:47', '3', '1', '2');
INSERT INTO `sys_sale` VALUES ('53f888b695144aeea17bb8601cab32fa', '1', null, '53f888b695144aeea17bb8601cab32fa', '2019-05-17 01:30:02.053', '2019-04-19 01:45:21', '1', null, '2', '33', '33', '2019-05-29 00:00:00', '正常价', '1', '1220');
INSERT INTO `sys_sale` VALUES ('7253a869ad96e4ab69433cab7c9dc4fe', '3', null, '7253a869ad96e4ab69433cab7c9dc4fe', '2019-04-16 00:44:11.781', '2019-04-16 00:44:12', '1', null, null, null, null, '2019-04-17 14:43:51', null, '1', '2');
INSERT INTO `sys_sale` VALUES ('725869ad96e4ab694b33cab7c9dc4fe', '3', null, '725869ad96e4ab694b33cab7c9dc4fe', '2019-04-16 00:44:11.781', '2019-04-16 00:44:12', '1', null, null, null, null, '2019-04-17 14:43:51', null, '1', '2');
INSERT INTO `sys_sale` VALUES ('725a3869d96e4ab694b33cab7c9dc4fe', '3', null, '725a3869d96e4ab694b33cab7c9dc4fe', '2019-04-16 00:44:11.781', '2019-04-16 00:44:12', '1', null, null, null, null, '2019-04-17 14:43:51', null, '1', '2');
INSERT INTO `sys_sale` VALUES ('725a869ad96e4ab69433cab7c9dc4fe', '3', null, '725a869ad96e4ab69433cab7c9dc4fe', '2019-04-16 00:44:11.781', '2019-04-16 00:44:12', '1', null, null, null, null, '2019-04-17 14:43:51', null, '1', '2');
INSERT INTO `sys_sale` VALUES ('725a869ad96e4ab694b33cab7c9dc4fe', '3', null, '725a869ad96e4ab694b33cab7c9dc4fe', '2019-05-17 00:19:57.495', '2019-04-16 00:44:12', '1', null, null, null, null, '2019-04-17 00:00:00', null, '1', '2');
INSERT INTO `sys_sale` VALUES ('725a869d96e4ab694b33cab7c9dc4fe', '3', null, '725a869d96e4ab694b33cab7c9dc4fe', '2019-04-16 00:44:11.781', '2019-04-16 00:44:12', '1', null, null, null, null, '2019-04-17 14:43:51', null, '1', '2');
INSERT INTO `sys_sale` VALUES ('733869d96e4ab694b33cab7c9dc4fe', '3', null, '733869d96e4ab694b33cab7c9dc4fe', '2019-04-16 00:44:11.781', '2019-04-16 00:44:12', '1', null, null, null, null, '2019-04-17 14:43:51', null, '1', '2');
INSERT INTO `sys_sale` VALUES ('75869ad96e4ab694b33cab7c9dc4fe', '3', null, '75869ad96e4ab694b33cab7c9dc4fe', '2019-04-16 00:44:11.781', '2019-04-16 00:44:12', '1', null, null, null, null, '2019-04-17 14:43:51', null, '1', '2');
INSERT INTO `sys_sale` VALUES ('7589ad96e4ab694b33cab7c9dc4fe', '3', null, '7589ad96e4ab694b33cab7c9dc4fe', '2019-04-16 00:44:11.781', '2019-04-16 00:44:12', '1', null, null, null, null, '2019-04-17 14:43:51', null, '1', '2');
INSERT INTO `sys_sale` VALUES ('758ad96e4ab694b33cab7c9dc4fe', '3', null, '758ad96e4ab694b33cab7c9dc4fe', '2019-04-16 00:44:11.781', '2019-04-16 00:44:12', '1', null, null, null, null, '2019-04-17 14:43:51', null, '1', '2');
INSERT INTO `sys_sale` VALUES ('758d946e34ab694b33cab7c9dc4fe', '3', null, '758d946e34ab694b33cab7c9dc4fe', '2019-04-16 00:44:11.781', '2019-04-16 00:44:12', '1', null, null, null, null, '2019-04-17 14:43:51', null, '1', '2');
INSERT INTO `sys_sale` VALUES ('758d946e4ab694b33cab7c9dc4fe', '3', null, '758d946e4ab694b33cab7c9dc4fe', '2019-04-16 00:44:11.781', '2019-04-16 00:44:12', '1', null, null, null, null, '2019-04-17 14:43:51', null, '1', '2');
INSERT INTO `sys_sale` VALUES ('758d96e4ab694b33cab7c9dc4fe', '3', null, '758d96e4ab694b33cab7c9dc4fe', '2019-05-20 23:07:37.601', '2019-04-16 00:44:12', '1', null, '432432', '4324324', '432432', '2019-04-24 00:00:00', '正常价', '1', '22');
INSERT INTO `sys_sale` VALUES ('78d3ee3d94634ab694b33cab7c9dc4fe', '3', null, '78d3ee3d94634ab694b33cab7c9dc4fe', '2019-04-16 00:44:11.781', '2019-04-16 00:44:12', '1', null, null, null, null, '2019-04-17 14:43:51', null, '1', '2');
INSERT INTO `sys_sale` VALUES ('78d3eed94634ab694b33cab7c9dc4fe', '3', null, '78d3eed94634ab694b33cab7c9dc4fe', '2019-04-16 00:44:11.781', '2019-04-16 00:44:12', '1', null, null, null, null, '2019-04-17 14:43:51', null, '1', '2');
INSERT INTO `sys_sale` VALUES ('78d94634ab694b33cab7c9dc4fe', '3', null, '78d94634ab694b33cab7c9dc4fe', '2019-04-21 17:15:10.73', '2019-04-16 00:44:12', '1', null, null, null, null, '2019-04-17 00:00:00', '活动价', '1', '2');
INSERT INTO `sys_sale` VALUES ('78d946e34ab694b33cab7c9dc4fe', '3', null, '78d946e34ab694b33cab7c9dc4fe', '2019-04-16 00:44:11.781', '2019-04-16 00:44:12', '1', null, null, null, null, '2019-04-17 14:43:51', null, '1', '2');
INSERT INTO `sys_sale` VALUES ('78deed94634ab694b33cab7c9dc4fe', '3', null, '78deed94634ab694b33cab7c9dc4fe', '2019-04-16 00:44:11.781', '2019-04-16 00:44:12', '1', null, null, null, null, '2019-04-17 14:43:51', null, '1', '2');
INSERT INTO `sys_sale` VALUES ('86302aa4c528f9dc57a5345ea4c', '2', 'string', 'string', '2019-05-23 17:53:22.014', '2019-04-10 14:51:02', '0', '1', '21', '33', '33', '2019-05-29 00:00:00', '正常价', '1', '22');
INSERT INTO `sys_sale` VALUES ('863042a3a4c528f9dc57a5345ea4c', '2', 'string', '863042a3a4c528f9dc57a5345ea4c', '2019-04-10 14:51:02.025', '2019-04-10 14:51:02', '1', '1', '2', '33', '33', '2019-04-02 15:05:49', '3', 'e2e3a26c08e74f03b4d43c2fc17ad360', '2');
INSERT INTO `sys_sale` VALUES ('863042aa4c528f9dc57a5345ea4c', '2', 'string', '863042aa4c528f9dc57a5345ea4c', '2019-04-10 14:51:02.025', '2019-04-10 14:51:02', '1', '1', '2', '33', '33', '2019-04-02 15:05:49', '3', 'e2e3a26c08e74f03b4d43c2fc17ad360', '2');
INSERT INTO `sys_sale` VALUES ('8633300e52aa4c528f9dc57a5345ea4c', '2', 'string', 'string', '2019-04-10 14:51:02.025', '2019-04-10 14:51:02', '0', '1', '2', '33', '33', '2019-04-02 15:05:49', '3', 'e2e3a26c08e74f03b4d43c2fc17ad360', '2');
INSERT INTO `sys_sale` VALUES ('8633500e512aa4c528fdc57a5345ea4c', '2', 'string', 'string', '2019-04-10 14:51:02.025', '2019-04-10 14:51:02', '0', '1', '2', '33', '33', '2019-04-02 15:05:49', '3', 'e2e3a26c08e74f03b4d43c2fc17ad360', '2');
INSERT INTO `sys_sale` VALUES ('8633d42a3a4c28f9dc57a5345ea4c', '2', 'string', 'string', '2019-05-22 23:10:45.446', '2019-04-10 14:51:02', '0', '1', '2', '33', '33', '2019-05-31 00:00:00', '正常价', 'e2e3a26c08e74f03b4d43c2fc17ad360', '2');
INSERT INTO `sys_sale` VALUES ('8633d432a3a4c28f9dc57a5345ea4c', '2', 'string', 'string', '2019-04-10 14:51:02.025', '2019-04-10 14:51:02', '0', '1', '2', '33', '33', '2019-04-02 15:05:49', '3', 'e2e3a26c08e74f03b4d43c2fc17ad360', '2');
INSERT INTO `sys_sale` VALUES ('86342a3a4c28f9dc57a5345ea4c', '2', 'string', '86342a3a4c28f9dc57a5345ea4c', '2019-04-10 14:51:02.025', '2019-04-10 14:51:02', '1', '1', '2', '33', '33', '2019-04-02 15:05:49', '3', 'e2e3a26c08e74f03b4d43c2fc17ad360', '2');
INSERT INTO `sys_sale` VALUES ('86342a3a4c528f9dc57a5345ea4c', '2', 'string', '86342a3a4c528f9dc57a5345ea4c', '2019-04-10 14:51:02.025', '2019-04-10 14:51:02', '1', '1', '2', '33', '33', '2019-04-02 15:05:49', '3', 'e2e3a26c08e74f03b4d43c2fc17ad360', '2');
INSERT INTO `sys_sale` VALUES ('863500e12aa4c528f9dc57a5345ea4c', '2', 'string', 'string', '2019-04-10 14:51:02.025', '2019-04-10 14:51:02', '0', '1', '2', '33', '33', '2019-04-02 15:05:49', '3', 'e2e3a26c08e74f03b4d43c2fc17ad360', '2');
INSERT INTO `sys_sale` VALUES ('863500e512aa4c528f9dc57a5345ea4c', '2', 'string', 'string', '2019-05-21 16:46:53.56', '2019-04-10 14:51:02', '0', '1', '2', '33', '33', '2019-05-24 00:00:00', '3', 'e2e3a26c08e74f03b4d43c2fc17ad360', '3');
INSERT INTO `sys_sale` VALUES ('863500e512aa4c528fdc57a5345ea4c', '2', 'string', 'string', '2019-04-10 14:51:02.025', '2019-04-10 14:51:02', '0', '1', '2', '33', '33', '2019-04-02 15:05:49', '3', 'e2e3a26c08e74f03b4d43c2fc17ad360', '2');
INSERT INTO `sys_sale` VALUES ('863500e52aa4c528f9dc57a5345ea4c', '2', 'string', 'string', '2019-04-10 14:51:02.025', '2019-04-10 14:51:02', '0', '1', '2', '33', '33', '2019-04-02 15:05:49', '3', 'e2e3a26c08e74f03b4d43c2fc17ad360', '2');
INSERT INTO `sys_sale` VALUES ('8635012aa4c528f9dc57a5345ea4c', '2', 'string', 'string', '2019-04-10 14:51:02.025', '2019-04-10 14:51:02', '0', '1', '2', '33', '33', '2019-04-02 15:05:49', '3', 'e2e3a26c08e74f03b4d43c2fc17ad360', '2');
INSERT INTO `sys_sale` VALUES ('863502aa4c528f9dc57a5345ea4c', '2', 'string', '863502aa4c528f9dc57a5345ea4c', '2019-04-10 14:51:02.025', '2019-04-10 14:51:02', '1', '1', '2', '33', '33', '2019-04-02 15:05:49', '3', 'e2e3a26c08e74f03b4d43c2fc17ad360', '2');
INSERT INTO `sys_sale` VALUES ('86350e12aa4c528f9dc57a5345ea4c', '2', 'string', 'string', '2019-04-10 14:51:02.025', '2019-04-10 14:51:02', '0', '1', '2', '33', '33', '2019-04-02 15:05:49', '3', 'e2e3a26c08e74f03b4d43c2fc17ad360', '2');
INSERT INTO `sys_sale` VALUES ('8635300e52aa4c528f9dc57a5345ea4c', '2', 'string', 'string', '2019-04-10 14:51:02.025', '2019-04-10 14:51:02', '0', '1', '2', '33', '33', '2019-04-02 15:05:49', '3', 'e2e3a26c08e74f03b4d43c2fc17ad360', '2');
INSERT INTO `sys_sale` VALUES ('863d42a3a4c28f9dc57a5345ea4c', '2', 'string', '863d42a3a4c28f9dc57a5345ea4c', '2019-04-10 14:51:02.025', '2019-04-10 14:51:02', '1', '1', '2', '33', '33', '2019-04-02 15:05:49', '3', 'e2e3a26c08e74f03b4d43c2fc17ad360', '2');
INSERT INTO `sys_sale` VALUES ('94981d13035e4271bfd087b947b4f60b', '2', null, '94981d13035e4271bfd087b947b4f60b', '2019-05-17 01:24:31.052', '2019-04-19 01:37:02', '1', null, null, null, null, '2019-05-29 00:00:00', '', '1', '0');
INSERT INTO `sys_sale` VALUES ('9623e17f4876b2c94a52ef860bc3', '3', 'string', 'string', '2019-04-10 14:50:57.974', '2019-04-10 14:50:58', '0', '2', '2', '33', '33', '2019-04-04 15:05:53', '3', 'e2e3a26c08e74f03b4d43c2fc17ad360', '2');
INSERT INTO `sys_sale` VALUES ('9623e33ea017f4876b2c9a52ef860bc3', '3', 'string', 'string', '2019-04-10 14:50:57.974', '2019-04-10 14:50:58', '0', '2', '2', '33', '33', '2019-04-04 15:05:53', '3', 'e2e3a26c08e74f03b4d43c2fc17ad360', '2');
INSERT INTO `sys_sale` VALUES ('9623ea17f4876b2c94a52ef860bc3', '3', 'string', 'string', '2019-04-10 14:50:57.974', '2019-04-10 14:50:58', '0', '2', '2', '33', '33', '2019-04-04 15:05:53', '3', 'e2e3a26c08e74f03b4d43c2fc17ad360', '2');
INSERT INTO `sys_sale` VALUES ('962e333e017f4876b2c94a52ef860bc3', '3', 'string', 'string', '2019-04-10 14:50:57.974', '2019-04-10 14:50:58', '0', '2', '2', '33', '33', '2019-04-04 15:05:53', '3', 'e2e3a26c08e74f03b4d43c2fc17ad360', '22');
INSERT INTO `sys_sale` VALUES ('962e33e017f4876b2c94a52ef860bc3', '3', 'string', 'string', '2019-04-10 14:50:57.974', '2019-04-10 14:50:58', '0', '2', '2', '33', '33', '2019-04-04 15:05:53', '3', 'e2e3a26c08e74f03b4d43c2fc17ad360', '2');
INSERT INTO `sys_sale` VALUES ('962e33ea017f4876b2c94a52ef860bc3', '3', 'string', 'string', '2019-04-10 14:50:57.974', '2019-04-10 14:50:58', '0', '2', '2', '33', '33', '2019-04-04 15:05:53', '3', 'e2e3a26c08e74f03b4d43c2fc17ad360', '2');
INSERT INTO `sys_sale` VALUES ('962e33ea017f4876b2c9a52ef860bc3', '3', 'string', 'string', '2019-04-10 14:50:57.974', '2019-04-10 14:50:58', '0', '2', '2', '33', '33', '2019-04-04 15:05:53', '3', 'e2e3a26c08e74f03b4d43c2fc17ad360', '22');
INSERT INTO `sys_sale` VALUES ('962e33ea17f4876b2c94a52ef860bc3', '3', 'string', 'string', '2019-04-10 14:50:57.974', '2019-04-10 14:50:58', '0', '2', '2', '33', '33', '2019-04-04 15:05:53', '3', 'e2e3a26c08e74f03b4d43c2fc17ad360', '2');
INSERT INTO `sys_sale` VALUES ('962e3ea17f4876b2c94a52ef860bc3', '3', 'string', 'string', '2019-04-10 14:50:57.974', '2019-04-10 14:50:58', '0', '2', '2', '33', '33', '2019-04-04 15:05:53', '3', 'e2e3a26c08e74f03b4d43c2fc17ad360', '2');
INSERT INTO `sys_sale` VALUES ('9634137f476b2c94a52ef860bc3', '3', 'string', '9634137f476b2c94a52ef860bc3', '2019-04-10 14:50:57.974', '2019-04-10 14:50:58', '1', '2', '2', '33', '33', '2019-04-04 15:05:53', '3', 'e2e3a26c08e74f03b4d43c2fc17ad360', '2');
INSERT INTO `sys_sale` VALUES ('9634137f4876b2c94a52ef860bc3', '3', 'string', 'string', '2019-04-10 14:50:57.974', '2019-04-10 14:50:58', '0', '2', '2', '33', '33', '2019-04-04 15:05:53', '3', 'e2e3a26c08e74f03b4d43c2fc17ad360', '2');
INSERT INTO `sys_sale` VALUES ('963e17f4876b2c94a52ef860bc3', '3', 'string', 'string', '2019-04-10 14:50:57.974', '2019-04-10 14:50:58', '0', '2', '2', '33', '33', '2019-04-04 15:05:53', '3', 'e2e3a26c08e74f03b4d43c2fc17ad360', '2');
INSERT INTO `sys_sale` VALUES ('963e4137f4876b2c94a52ef860bc3', '3', 'string', 'string', '2019-04-10 14:50:57.974', '2019-04-10 14:50:58', '0', '2', '2', '33', '33', '2019-04-04 15:05:53', '3', 'e2e3a26c08e74f03b4d43c2fc17ad360', '2');
INSERT INTO `sys_sale` VALUES ('963e417f4876b2c94a52ef860bc3', '3', 'string', 'string', '2019-04-10 14:50:57.974', '2019-04-10 14:50:58', '0', '2', '2', '33', '33', '2019-04-04 15:05:53', '3', 'e2e3a26c08e74f03b4d43c2fc17ad360', '2');
INSERT INTO `sys_sale` VALUES ('96d334137f476b2c94a52ef860bc3', '3', 'string', 'string', '2019-04-10 14:50:57.974', '2019-04-10 14:50:58', '0', '2', '2', '33', '33', '2019-04-04 15:05:53', '3', 'e2e3a26c08e74f03b4d43c2fc17ad360', '2');
INSERT INTO `sys_sale` VALUES ('96d3343137f476b2c94a52ef860bc3', '3', 'string', 'string', '2019-04-10 14:50:57.974', '2019-04-10 14:50:58', '0', '2', '2', '33', '33', '2019-04-04 15:05:53', '3', 'e2e3a26c08e74f03b4d43c2fc17ad360', '2');
INSERT INTO `sys_sale` VALUES ('96d34137f476b2c94a52ef860bc3', '3', 'string', 'string', '2019-04-10 14:50:57.974', '2019-04-10 14:50:58', '0', '2', '2', '33', '33', '2019-04-04 15:05:53', '3', 'e2e3a26c08e74f03b4d43c2fc17ad360', '2');
INSERT INTO `sys_sale` VALUES ('s', '2', 'string', 'string', null, null, '0', '3', '2', '33', '33', '2019-04-28 15:06:00', '3', '2', '2');
INSERT INTO `sys_sale` VALUES ('s4', '2', 'string', 'string', null, null, '0', '3', '2', '33', '33', '2019-04-28 15:06:00', '3', '2', '2');
INSERT INTO `sys_sale` VALUES ('s43', '2', 'string', 'string', null, null, '0', '3', '2', '33', '33', '2019-04-28 15:06:00', '3', '2', '2');
INSERT INTO `sys_sale` VALUES ('s454546543', '2', 'string', 'string', null, null, '0', '3', '2', '33', '33', '2019-04-28 15:06:00', '3', '2', '2');
INSERT INTO `sys_sale` VALUES ('s4545466543', '2', 'string', 'string', null, null, '0', '3', '2', '33', '33', '2019-04-28 15:06:00', '3', '2', '2');
INSERT INTO `sys_sale` VALUES ('s4d533446543', '2', 'string', 'string', null, null, '0', '3', '2', '33', '33', '2019-04-28 15:06:00', '3', '2', '2');
INSERT INTO `sys_sale` VALUES ('s4d53446543', '2', 'string', 'string', null, null, '0', '3', '2', '33', '33', '2019-04-28 15:06:00', '3', '2', '2');
INSERT INTO `sys_sale` VALUES ('s4d5446543', '2', 'string', 'string', '2019-05-20 23:07:22.371', null, '0', '3', '2', '33', '33', '2019-04-28 00:00:00', '3', '2', '2');
INSERT INTO `sys_sale` VALUES ('sr', '2', 'string', 'string', null, null, '0', '3', '2', '33', '33', '2019-04-28 15:06:00', '3', '2', '2');
INSERT INTO `sys_sale` VALUES ('srg', '2', 'string', 'string', null, null, '0', '3', '2', '33', '33', '2019-04-28 15:06:00', '3', '2', '2');
INSERT INTO `sys_sale` VALUES ('srig', '2', 'string', 'string', null, null, '0', '3', '2', '33', '33', '2019-04-28 15:06:00', '3', '2', '2');
INSERT INTO `sys_sale` VALUES ('stri3n323g', '2', 'string', 'string', null, null, '0', '3', '2', '33', '33', '2019-04-28 15:06:00', '3', '2', '2');
INSERT INTO `sys_sale` VALUES ('stri3ngsssssssssssssssss', '2', 'string', 'string', null, null, '0', '3', '2', '33', '33', '2019-04-28 15:06:00', '3', '2', '2');
INSERT INTO `sys_sale` VALUES ('strig', '2', 'string', 'string', null, null, '0', '3', '2', '33', '33', '2019-04-28 15:06:00', '3', '2', '2');
INSERT INTO `sys_sale` VALUES ('strin323g', '2', 'string', 'string', null, null, '0', '3', '2', '33', '33', '2019-04-28 15:06:00', '3', '2', '2');
INSERT INTO `sys_sale` VALUES ('string', '2', 'string', 'string', null, null, '0', '3', '2', '33', '33', '2019-04-28 15:06:00', '3', '2', '2');
INSERT INTO `sys_sale` VALUES ('stringsssssssssssssssss', '2', 'string', 'string', null, null, '0', '3', '2', '33', '33', '2019-04-28 15:06:00', '3', '2', '2');

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` varchar(32) NOT NULL,
  `open_id` varchar(32) DEFAULT NULL,
  `session_key` varchar(32) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  `creator` varchar(32) DEFAULT NULL COMMENT '创建者',
  `modifier` varchar(32) DEFAULT NULL COMMENT '修改者',
  `del_flag` int(1) DEFAULT '0',
  `nick_name` varchar(32) DEFAULT NULL COMMENT '用户微信名字',
  `avatar_url` varchar(500) DEFAULT NULL COMMENT '用户头像',
  `password` varchar(255) DEFAULT NULL,
  `name` varchar(32) DEFAULT NULL COMMENT '收货姓名',
  `phone` varchar(16) DEFAULT NULL COMMENT '收货电话',
  `address` varchar(64) DEFAULT NULL,
  `score` int(10) unsigned DEFAULT NULL COMMENT '总积分',
  `today_score` int(10) unsigned DEFAULT NULL COMMENT '今日积分',
  `root` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', null, null, null, '2019-04-15 12:21:30', '1', 'string', '0', null, null, '123456', 'user1', null, null, null, null, '1');
INSERT INTO `sys_user` VALUES ('2', null, null, null, null, '1', '1', '0', null, null, '123456', 'user2', null, null, null, null, '1');
INSERT INTO `sys_user` VALUES ('3', null, null, null, null, null, '3', '0', null, null, '123456', 'user3', null, null, null, null, '0');
INSERT INTO `sys_user` VALUES ('4', null, null, null, null, null, null, '0', null, null, '123456', '歌歌', null, null, null, null, '1');
INSERT INTO `sys_user` VALUES ('5', null, null, null, null, null, null, '0', null, null, '123456', '慧慧', null, null, null, null, '1');
INSERT INTO `sys_user` VALUES ('6', null, null, null, null, '1', null, '0', null, null, '123456', '娜娜', null, null, null, null, '1');
INSERT INTO `sys_user` VALUES ('7', null, null, null, null, null, null, '0', null, null, '123456', 'user4', null, null, null, null, '0');
INSERT INTO `sys_user` VALUES ('8', null, null, null, null, null, '8', '1', null, null, '123456', 'user5', null, null, null, null, '0');
INSERT INTO `sys_user` VALUES ('01e03f0f4c8f48e18f9ca908f9281480', null, null, '2019-04-15 12:22:33', '2019-04-15 12:22:33', 'string', 'string', '0', null, null, '123456', 'string', null, null, null, null, '1');
INSERT INTO `sys_user` VALUES ('9', null, null, null, null, null, '9', '1', null, null, '123456', 'user6', null, null, null, null, '0');
INSERT INTO `sys_user` VALUES ('10', null, null, '2019-04-15 15:10:56', null, null, null, '0', null, null, '123456', 'user7', null, null, null, null, '0');
INSERT INTO `sys_user` VALUES ('7f71f499d97c4f81962cf683286aa540', null, null, '2019-04-16 00:29:56', '2019-04-16 00:29:56', null, null, '0', null, null, '123456', 'user7', null, null, null, null, null);
INSERT INTO `sys_user` VALUES ('5df90bbd0ea041e4bb5497d41b03e29e', null, null, '2019-04-16 00:31:28', '2019-04-19 00:54:55', null, null, '0', null, null, '123456789', '丑八怪', null, null, null, null, '1');
INSERT INTO `sys_user` VALUES ('9abe572af815468e8c40bf65f62d0a65', null, null, '2019-04-16 00:32:09', '2019-04-19 00:54:15', null, '9abe572af815468e8c40bf65f62d0a65', '1', null, null, '877', '八爪鱼', null, null, null, null, '1');
INSERT INTO `sys_user` VALUES ('b0e7c0612f88493aa6656c66eba3614d', null, null, '2019-04-19 00:45:20', '2019-04-19 00:54:10', null, 'b0e7c0612f88493aa6656c66eba3614d', '1', null, null, '877', '八爪鱼', null, null, null, null, '1');
INSERT INTO `sys_user` VALUES ('689f89bd30f241e281ccaaa3fab09343', null, null, '2019-04-19 00:54:34', '2019-04-21 17:19:45', null, null, '0', null, null, '123456', '彭楚风小可爱qqqq', null, null, null, null, '0');
INSERT INTO `sys_user` VALUES ('30da69460f8041c3b6ea367e4dcc82a6', null, null, '2019-04-21 17:20:00', '2019-04-21 17:20:00', null, null, '0', null, null, '123456', '通天塔通天塔', null, null, null, null, '1');
INSERT INTO `sys_user` VALUES ('367d9635ffc740e384c52470088680cf', null, null, '2019-04-23 20:13:04', '2019-04-23 20:13:14', null, '367d9635ffc740e384c52470088680cf', '1', null, null, 'wwww', 'wwwwww', null, null, null, null, '0');

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `id` varchar(255) NOT NULL,
  `user_id` int(11) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  `creator` varchar(255) DEFAULT NULL,
  `modifier` varchar(255) DEFAULT NULL,
  `del_flag` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------
INSERT INTO `sys_user_role` VALUES ('1', '1', '1', null, null, null, null, null);
INSERT INTO `sys_user_role` VALUES ('2', '2', '2', null, null, null, null, null);
INSERT INTO `sys_user_role` VALUES ('3', '1', '2', null, null, null, null, null);
