# 高级Web技术Lab2

by 13300200017 刘石坚

全部源代码：https://github.com/TruthABC/adweblab2/

##1、选题

REST架构的学习和实践

##2、项目概要

全部项目体现为前台和后台两部分（可分离）。整体上使用了maven及spring的spring boot完成整个项目。

###2.1项目后台

项目后台实现了restful的两个服务，分别是place服务和map服务。

place服务：

uri格式：place/{placeName}

功能：返回基于“placeName”字符串的地点搜索列表，返回的数据为固定的json格式，逻辑实现依赖百度地图WebAPI。

map服务：

uri格式：map/{lati}/{longi}/{zoom}

功能：返回基于经纬度(longi,lati)位置且大小级别为“zoom”的一张静态地图的路径及名称（将这张地图以图片的形式存储到后台目录下，只返回给前台该图像的后台路径），逻辑实现依赖百度地图WebAPI。

###2.2项目前台

项目前台引用了后台的两个服务，实现为搜索地点并显示地点地图的web应用，另外，对于一个已显示的地点，可以通过操作微调地图范围及位置。

项目前台本为基于Ionic、AngularJS的Hybrid移动应用，源代码：https://github.com/TruthABC/adweblab2_views/

为提交及检查的方便，已将前台项目使用spring boot部署到与后台同源的地址下，单独作为web应用可以直接使用，源代码：https://github.com/TruthABC/adweblab2/tree/master/src/main/resources/static

##3、环境约束

使用maven开发项目，jar包依赖参考pom.xml。（参考项目开发环境：JDK1.8.0_73，eclipse mars）

spring boot部署到localhost时使用自带服务器，故对容器没有要求。

##4、部署及使用说明

使用eclipse导入项目，运行Application.java，即启动项目的服务，可将项目部署到localhost:8080，中断运行即停止服务。

place服务调用示例：

在导航栏输入:“http://localhost:8080/place/复旦大学”

map服务调用示例：

在导航栏输入：“http://localhost:8080/map/31.302398/121.510414/15”

前端的运行：

在导航栏输入：“http://localhost:8080/index.html”
