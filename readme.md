# 通过Java实体类pojo(entity、javabean)生成mysql数据库表
## 方法：
使用了琛斌开源的工具[ACTable开源框架](https://www.yuque.com/sunchenbin/actable/ag3y1y)，可以在文档中查看详细。
## 注意：
1. 官方文档中没有写怎么连接数据库，因此自己添加了连接本地数据库；
2. 这种方法需要堆所有要生成数据库表的Java类挨个注释*@Table*，并且还要对每个字段进行注释*@Column*，好麻烦~~~
## 步骤：
1. 新建springboot工程；
2. pom引入依赖包；
3. 将要生成的表的实体类放到目录下；
4. 配置application及mapper配置；
5. 运行

