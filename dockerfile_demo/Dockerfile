FROM 	ubuntu:latest
MAINTAINER "bjx"
#拷贝资源到镜像
ADD ./resource/ /opt/

#需要将资源放到./resource目录下
ENV JAVA_HOME=/opt/jdk1.8.0_221
ENV NACOS_BIN=/opt/nacos/bin
ENV ZK_HOME=/opt/apache-zookeeper-3.5.5-bin
ENV PATH=$PATH:$JAVA_HOME/bin


#授权
RUN chmod -R 777 $JAVA_HOME/bin
RUN chmod -R 777 $NACOS_BIN
RUN chmod -R 777 $ZK_HOME/bin


#切换目录
WORKDIR /opt

#映射磁盘卷
#VOLUME ~/dkImage/resource /opt


#只能有一个 ENTRYPOINT 命令
#如果不使用 bash 命令，启动容器后可能会出现 Exited (0) 
ENTRYPOINT bash


#构建镜像：docker build -t [ubuntu18]:[v2] .
#创建容器：docker create -it -p 8848:8848 --name [容器名ubuntu18]  [镜像名称:镜像标签] /bin/bash
#启动容器：docker start [容器名称ubuntu18]
#进入容器：docker exec -it 容器名称ubuntu18 bash

 
