SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  `password` varchar(32) DEFAULT NULL COMMENT '密码',
  `sex` int(11) DEFAULT NULL COMMENT '性别',
  `username` varchar(32) DEFAULT NULL COMMENT '用户名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('2', '13', 'US', '2', 'user2');
INSERT INTO `user` VALUES ('3', '12', 'RU', '1', 'user3');
INSERT INTO `user` VALUES ('4', '14', 'GB', '2', 'user4');
INSERT INTO `user` VALUES ('5', '18', 'bbbb', '1', 'zzzz');