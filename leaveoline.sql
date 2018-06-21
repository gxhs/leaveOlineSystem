/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50524
Source Host           : localhost:3306
Source Database       : leaveoline

Target Server Type    : MYSQL
Target Server Version : 50524
File Encoding         : 65001

Date: 2018-06-19 10:41:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `assistant`
-- ----------------------------
DROP TABLE IF EXISTS `assistant`;
CREATE TABLE `assistant` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `ano` int(10) NOT NULL,
  `name` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `major_id` int(10) NOT NULL COMMENT '专业',
  PRIMARY KEY (`id`),
  KEY `Amajor_id` (`major_id`),
  CONSTRAINT `Amajor_id` FOREIGN KEY (`major_id`) REFERENCES `major` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of assistant
-- ----------------------------
INSERT INTO `assistant` VALUES ('1', '2015961040', '吕振', '001', '1');
INSERT INTO `assistant` VALUES ('2', '2015960940', '韩新明', '001', '3');
INSERT INTO `assistant` VALUES ('3', '2015961041', '樊盼', '001', '2');

-- ----------------------------
-- Table structure for `faculty`
-- ----------------------------
DROP TABLE IF EXISTS `faculty`;
CREATE TABLE `faculty` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL COMMENT '院系',
  `password` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of faculty
-- ----------------------------

-- ----------------------------
-- Table structure for `leave`
-- ----------------------------
DROP TABLE IF EXISTS `leave`;
CREATE TABLE `leave` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `starttime` datetime NOT NULL COMMENT '开始時間',
  `endtime` datetime NOT NULL,
  `time` varchar(20) DEFAULT NULL,
  `approver` varchar(20) DEFAULT NULL COMMENT '批准人',
  `type` varchar(20) NOT NULL COMMENT '类型',
  `reason` varchar(255) NOT NULL COMMENT '原因',
  `state` varchar(20) DEFAULT NULL COMMENT '请假状态',
  `student_id` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `student_id` (`student_id`),
  CONSTRAINT `student_id` FOREIGN KEY (`student_id`) REFERENCES `student` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of leave
-- ----------------------------

-- ----------------------------
-- Table structure for `major`
-- ----------------------------
DROP TABLE IF EXISTS `major`;
CREATE TABLE `major` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `faculty` varchar(20) NOT NULL COMMENT '院系',
  `major` varchar(20) NOT NULL COMMENT '专业',
  `assistant_id` int(10) NOT NULL COMMENT '辅导员',
  PRIMARY KEY (`id`),
  KEY `assistant_id` (`assistant_id`),
  CONSTRAINT `assistant_id` FOREIGN KEY (`assistant_id`) REFERENCES `assistant` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of major
-- ----------------------------
INSERT INTO `major` VALUES ('1', '计算机学院', '计算机科学与技术', '1');
INSERT INTO `major` VALUES ('2', '计算机学院', '软件工程', '2');
INSERT INTO `major` VALUES ('3', '计算机学院', '物联网工程', '3');

-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `sno` bigint(20) NOT NULL,
  `sname` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `major_id` int(10) NOT NULL COMMENT '专业',
  PRIMARY KEY (`id`),
  KEY `Smajor_id` (`major_id`),
  CONSTRAINT `Smajor_id` FOREIGN KEY (`major_id`) REFERENCES `major` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '201596104038', '井雨梦', '001', '1');
INSERT INTO `student` VALUES ('2', '201596104039', '晁雨', '001', '1');
INSERT INTO `student` VALUES ('3', '201596104040', '张凯', '001', '1');
INSERT INTO `student` VALUES ('4', '201596094001', '刘天鹏', '001', '3');
INSERT INTO `student` VALUES ('5', '201596094002', '肖华', '001', '3');
INSERT INTO `student` VALUES ('6', '201596094003', '凯鑫', '001', '3');
