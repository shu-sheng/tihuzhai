/*
Navicat MySQL Data Transfer

Source Server         : 彬彬云
Source Server Version : 50721
Source Host           : 47.106.102.151:3306
Source Database       : tihuzhai

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2019-06-01 12:42:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for ac_menu
-- ----------------------------
DROP TABLE IF EXISTS `ac_menu`;
CREATE TABLE `ac_menu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '菜单ID',
  `parent_id` bigint(20) DEFAULT NULL COMMENT '父菜单ID',
  `menu_name` varchar(30) DEFAULT NULL COMMENT '菜单名称',
  `menu_code` varchar(30) DEFAULT NULL COMMENT '菜单编码',
  `menu_type` varchar(30) DEFAULT NULL COMMENT '菜单类型',
  `menu_order` int(10) DEFAULT NULL COMMENT '菜单顺序',
  `permission_url` varchar(30) DEFAULT NULL COMMENT '权限URL',
  `status` varchar(20) DEFAULT NULL COMMENT '状态',
  `row_add_time` datetime DEFAULT NULL COMMENT '添加时间',
  `row_update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`),
  KEY `FK_Reference_9` (`parent_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ac_menu
-- ----------------------------

-- ----------------------------
-- Table structure for ac_role
-- ----------------------------
DROP TABLE IF EXISTS `ac_role`;
CREATE TABLE `ac_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户角色ID',
  `role_name` varchar(30) DEFAULT NULL COMMENT '角色名称',
  `role_type` varchar(30) DEFAULT NULL COMMENT '角色类型',
  `role_status` varchar(20) DEFAULT NULL COMMENT '角色状态',
  `memo` varchar(256) DEFAULT NULL COMMENT '备注',
  `row_add_time` datetime DEFAULT NULL COMMENT '创建时间',
  `row_update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ac_role
-- ----------------------------

-- ----------------------------
-- Table structure for ac_role_menu
-- ----------------------------
DROP TABLE IF EXISTS `ac_role_menu`;
CREATE TABLE `ac_role_menu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '角色与菜单关联ID',
  `role_id` bigint(20) DEFAULT NULL COMMENT '角色ID',
  `menu_id` bigint(20) DEFAULT NULL COMMENT '菜单ID',
  `status` varchar(255) DEFAULT NULL COMMENT '逻辑删除',
  `row_add_time` datetime DEFAULT NULL COMMENT '添加时间',
  PRIMARY KEY (`id`),
  KEY `FK_Reference_7` (`role_id`),
  KEY `FK_Reference_8` (`menu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ac_role_menu
-- ----------------------------

-- ----------------------------
-- Table structure for ac_user
-- ----------------------------
DROP TABLE IF EXISTS `ac_user`;
CREATE TABLE `ac_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `user_name` varchar(30) DEFAULT NULL COMMENT '用户名/登录帐号',
  `user_real_name` varchar(30) DEFAULT NULL COMMENT '用户真实名称',
  `password` varchar(50) DEFAULT NULL COMMENT '登录密码',
  `email` varchar(128) DEFAULT NULL COMMENT '邮箱',
  `mobile` varchar(16) DEFAULT NULL COMMENT '手机号',
  `password_error_times` int(3) DEFAULT NULL COMMENT '密码错误次数',
  `status` varchar(20) DEFAULT NULL COMMENT '用户状态',
  `memo` varchar(256) DEFAULT NULL COMMENT '备注',
  `row_add_time` datetime DEFAULT NULL COMMENT '创建时间',
  `row_update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ac_user
-- ----------------------------
INSERT INTO `ac_user` VALUES ('1', 'admin', '超级管理员', '111111', '174185499@qq.com', '13686812889', '0', 'normal', null, '2019-04-30 16:46:53', '2019-04-30 16:46:54');
INSERT INTO `ac_user` VALUES ('2', 'shusheng', '管理员', '111111', '174185499@qq.com', '13686812889', '0', 'normal', '超级后台管理员（操作员）', '2019-05-13 23:18:56', '2019-05-13 23:18:56');

-- ----------------------------
-- Table structure for ac_user_role
-- ----------------------------
DROP TABLE IF EXISTS `ac_user_role`;
CREATE TABLE `ac_user_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户与角色关联ID',
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户ID',
  `role_id` bigint(20) DEFAULT NULL COMMENT '角色ID',
  `status` varchar(20) DEFAULT NULL COMMENT '逻辑删除',
  `row_add_time` datetime DEFAULT NULL COMMENT '添加时间',
  PRIMARY KEY (`id`),
  KEY `FK_Reference_3` (`user_id`),
  KEY `FK_Reference_4` (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ac_user_role
-- ----------------------------
