# alige
敏捷作业最终版

# 介绍
巩固Java的知识点和框架的使用。 主要是偏后端学习+前端js简单使用。
## 使用
由于项目是基于springboot框架，也就是maven风格，所以导入项目直接打开pom.xml即可。并通过入口类SpringbootApplication启动(内置tomcat)。
## 技术简述
### 前后端技术
|功能|使用|
| ------------- |:-------------:|
|核心框架|springboot+springmvc|
|数据库|mysql |
|持久层框架| mybatis|
|JS|vue+jquery+axios|

`在后台开发的时候在ssm教程上尝试使用springboot，到前台开发时更新了springboot教程。所以前台部分新增Thymeleaf,shiro,redis等。`

### mybatis插件
|工具|功能|介绍|
| ------------- |-------------|-------------|
|PageHelper|分页|PageHelper是一款犀利的Mybatis分页插件，使用了这个插件之后，分页开发起来更加简单容易。|
|Mybatis Generator|重构|用逆向工程的方式，首先保证数据库里有表，然后通过Mybatis Generator生成pojo, mapper和xml。 可以节约大家的时间，提高开发效率，降低出错几率。|

# 主要功能
* 1.前端展示 在前端页面上显示数据库中的数据，如首页，产品页，购物车，分类页面等等。
* 2.前端交互 与服务端进行同步或者异步数据交互。 比如购买，购物车，生成订单，登录，注册，确认收货等等功能。
* 3.后台功能 对支撑整站需要用到的数据，进行管理维护。比如发货，分类管理，分类属性管理， 产品管理，产品图片管理，用户管理，订单管理等等。
# 整体流程
![image](https://github.com/zhysanyue/homework/blob/master/image/tmall.png)

