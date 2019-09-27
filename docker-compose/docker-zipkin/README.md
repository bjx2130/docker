搭建 kafka+zipkin+elassticsearch 环境

多个docker-compose.yml文件需要使用同【一个网络,自定义的网络才可以】才能互相访问

1、进入当前目录./ ,依次执行如下命令启动服务

	docker-compose -f docker-compose.yml up
	docker-compose -f docker-zipkin.yml up
	docker-compose -f docker-springcloud_demo.yml up

2、docker ps 查看服务是否全部启动

3、访问地址
	eureka: http://localhost:8761/
	es: http://localhost:9200
	zipkin: http://localhost:9411/zipkin/


4、测试发送链路追踪数据，在zipkin中查看
	http://localhost:9000/test
