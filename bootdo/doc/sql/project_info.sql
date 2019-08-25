/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80013
 Source Host           : localhost:3306
 Source Schema         : bootdo

 Target Server Type    : MySQL
 Target Server Version : 80013
 File Encoding         : 65001

 Date: 25/08/2019 23:24:50
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for project_info
-- ----------------------------
DROP TABLE IF EXISTS `project_info`;
CREATE TABLE `project_info`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `project_status` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '项目状态',
  `project_year` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `project_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `customer_unit` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `customer_contactor_ids` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `follower_unit` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `follower_ids` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `project_participate_info` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `solution_file_path` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `project_budget` decimal(10, 2) NULL DEFAULT NULL,
  `project_code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `project_notice_type` bit(1) NULL DEFAULT NULL,
  `project_notice_value` mediumtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `regi_date` datetime(0) NULL DEFAULT NULL,
  `regi_place` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `regi_contactor_ids` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `regi_req` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `pur_tender_ids` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `pur_tender_date` datetime(0) NULL DEFAULT NULL,
  `pur_tender_cost` decimal(10, 2) NULL DEFAULT NULL,
  `pur_tender_travel_expense` decimal(10, 2) NULL DEFAULT NULL,
  `tender_file_path` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `config_file_path` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `qualification_file_path` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `business_technology_assessment_file_path` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `survey_place` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `survey_date` datetime(0) NULL DEFAULT NULL,
  `survey_unit_contactor_ids` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `survey_unit_leader_ids` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `survey_has_sample` bit(1) NULL DEFAULT NULL,
  `survey_sample_detail` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `survey_test_sample` bit(1) NULL DEFAULT NULL,
  `survey_test_detail` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `survey_travel_expense` decimal(10, 2) NULL DEFAULT NULL,
  `survey_sample_transfor_expense` decimal(10, 2) NULL DEFAULT NULL,
  `tender_price_file_contactor_ids` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `tender_book_file_contactor_ids` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `prove_file_contactor_ids` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `print_tender_cost` decimal(10, 2) NULL DEFAULT NULL,
  `tender_car_cost` decimal(10, 2) NULL DEFAULT NULL,
  `submit_tender_file_path` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `prove_file_path` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `price_file_path` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `start_tender_place` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `start_tender_time` datetime(0) NULL DEFAULT NULL,
  `start_tender_has_sample` bit(1) NULL DEFAULT NULL,
  `start_tender_sample_detail` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `start_tender_test_sample` bit(1) NULL DEFAULT NULL,
  `start_tender_test_detail` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `start_tender_leader_ids` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `start_tender_travel_expense` decimal(10, 2) NULL DEFAULT NULL,
  `start_tender_sample_transfor_expense` decimal(10, 2) NULL DEFAULT NULL,
  `start_tender_total_expense` decimal(10, 2) NULL DEFAULT NULL,
  `tender_people_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `tender_people_phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `tender_people_train_cost` decimal(10, 2) NULL DEFAULT NULL,
  `tender_people_flight_cost` decimal(10, 2) NULL DEFAULT NULL,
  `tender_people_stay_cost` decimal(10, 2) NULL DEFAULT NULL,
  `tender_people_supply_cost` decimal(10, 2) NULL DEFAULT NULL,
  `tender_people_taxi_cost` decimal(10, 2) NULL DEFAULT NULL,
  `tender_people_other_cost` decimal(10, 2) NULL DEFAULT NULL,
  `tender_people_file_transfor_cost` decimal(10, 2) NULL DEFAULT NULL,
  `tender_people_total_cost` decimal(10, 2) NULL DEFAULT NULL,
  `tender_pay_price` decimal(10, 2) NULL DEFAULT NULL,
  `tender_win` bit(1) NULL DEFAULT NULL,
  `tender_win_price` decimal(10, 2) NULL DEFAULT NULL,
  `tender_service_rate` decimal(10, 2) NULL DEFAULT NULL,
  `tender_interest_rate` decimal(10, 2) NULL DEFAULT NULL,
  `tender_project_integrate_cost` decimal(10, 2) NULL DEFAULT NULL,
  `incoming_rate` decimal(10, 2) NULL DEFAULT NULL,
  `incoming_cost` decimal(10, 2) NULL DEFAULT NULL,
  `project_integrate_total_cost` decimal(10, 2) NULL DEFAULT NULL,
  `unit_interest` decimal(10, 2) NULL DEFAULT NULL,
  `cor_integrate_cost` decimal(10, 2) NULL DEFAULT NULL,
  `cor_other_cost` decimal(10, 2) NULL DEFAULT NULL,
  `cor_total_cost` decimal(10, 2) NULL DEFAULT NULL,
  `cor_can_use_cost` decimal(10, 2) NULL DEFAULT NULL,
  `contract_info_ids` varchar(512) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `warranty_period_standard` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `tender_warranty_period` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `warranty_price_standard` decimal(10, 2) NULL DEFAULT NULL,
  `tender_warranty_price` decimal(10, 2) NULL DEFAULT NULL,
  `can_use_without_warranty_price` decimal(10, 2) NULL DEFAULT NULL,
  `other` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
