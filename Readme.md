# 小米商场
## 功能
- 普通用户的注册和登录。管理员是手动创建
- 新增商品、删除商品（AJAX批量删除）、更新商品（回显）、按分类分页展示商品（按价格）
- 商品图片的异步上传和异步刷新
- 订单管理（查看）
- 用户管理（查看）

## 技术栈

Spring+Mybatis+SpringMVC+MySQL8+JQuery+BootStrap+JavaScript

## 搭建SSM项目的步骤
1. 新建Maven工程
2. 修改目录,修改pom.xml文件
3. 添加SSM框架的所有依赖
4. 拷贝jdbc.porperties到resources目录下
5. 新建applicationContext_dao.xml文件,进行数据访问层的配置
6. 新建applicationContext_service.xml文件,进行业务逻辑层的配置
7. 新建springmvc.xml文件,配置springmvc的框架
8. 新建SqlMapConfig.xml文件,进行分页插件的配置
9. 使用逆向工程生成pojo和mapper的文件
10. 开发业务逻辑层,实现登录判断
11. 开发控制器AdminAction,完成登录处理
12. 改造页面,发送登录请求,验证登录
