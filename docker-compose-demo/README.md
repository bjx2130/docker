# docker 部署springcloud微服务[使用私有仓库]
	
### 1.启动基础服务
	docker-compose -f docker-base.yml up

### 2.分别构建项目镜像
	

	以spring-cloud-eureka为例
	A.在pom.xml中添加dockerfile-maven-plugin插件
	B.编写Dockerfile文件
	C.执行以下命令
		dd spring-cloud-eureka
		mvn clean compile dockerfile:build
		mvn dockerfile:push



### 3.编写部署编排文件 docker-springcloud.yml
	启动docker-compose -f docker-springcloud.yml up
