# ssm_template
ssm frame template for idea
### 使用说明
##### 数据：
1. 创建MySQL数据库：ssm_thymeleaf
2. 导入数据：
```sql
/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 80017
 Source Host           : localhost:3306
 Source Schema         : ssm_thymeleaf

 Target Server Type    : MySQL
 Target Server Version : 80017
 File Encoding         : 65001

 Date: 16/08/2020 22:33:17
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(3) NOT NULL,
  `name` varchar(31) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, '小明');

SET FOREIGN_KEY_CHECKS = 1;

```

##### 配置：
1. jdbc.properties:
```properties
jdbc.url=jdbc:mysql://localhost:3306/ssm_thymeleaf?uniCode=true&characterEncoding=utf8&serverTimezone=Asia/Shanghai&useSSL=false&allowPublicKeyRetrieval=true&autoReconnect=true
jdbc.username=root
jdbc.password=YXH123ZZhe66
```
更改数据库地址（url），用户名（username）和密码（password）。
