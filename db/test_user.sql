/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50539
Source Host           : localhost:3306
Source Database       : spike

Target Server Type    : MYSQL
Target Server Version : 50539
File Encoding         : 65001

Date: 2021-02-24 17:35:09
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for test_user
-- ----------------------------
DROP TABLE IF EXISTS `test_user`;
CREATE TABLE `test_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of test_user
-- ----------------------------
INSERT INTO `test_user` VALUES ('1', '杨宽yy', '25');
INSERT INTO `test_user` VALUES ('2', '杨宽yy', '25');
