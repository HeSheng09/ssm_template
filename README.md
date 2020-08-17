# ssm_thymeleaf
**spring**, **spring boot**,**mybatis** and **thymeleaf**  
template for **IntelliJ IDEA**
## 使用说明
#### clone
1. 新建目录xxx，在当前路径下打开cmd。
2. 初始化本地仓库： `git init`。
3. 添加远程仓库：`git remote add origin https://github.com/HeSheng09/ssm_thymeleaf.git`。
4. pull仓库到本地：`git pull origin master`。
#### 测试数据：
1. 创建MySQL数据库：ssm_thymeleaf（同后续**jdbc.properties**配置中数据库相同即可）
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

#### 配置：
1. jdbc.properties:
    ```properties
    jdbc.url=jdbc:mysql://localhost:3306/ssm_thymeleaf?uniCode=true&characterEncoding=utf8&serverTimezone=Asia/Shanghai&useSSL=false&allowPublicKeyRetrieval=true&autoReconnect=true
    jdbc.username=root
    jdbc.password=xxxxxx
    ```
    更改数据库地址（**url**），用户名（**username**）和密码（**password**）。

2. pom.xml:
    ```xml
    <name>xxx</name>
    <groupId>com.project</groupId>
    <artifactId>xxx</artifactId>
    <version>1.0-SNAPSHOT</version>
    ```
    更改**name**和**artifactId**为新项目名称xxx。

3. 将**ssm_thymeleaf.iml**重命名为**xxx.iml**(xxx为新项目名称)。

#### 运行
1. 使用IDEA打开项目文件夹。
2. 打开项目结构-->Project，选择项目SDK和项目语言级别。
3. 运行-->编辑配置，添加配置，选择tomcat server-->local，取消勾选after launch，点下方修复选择xxx:war exploded。
4. 双击运行。