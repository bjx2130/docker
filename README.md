# docker
    dockerfile：
      https://www.jianshu.com/p/10ed530766af
    
    Docker三剑客之Docker Swarm
	    https://www.jianshu.com/p/91fd1bdde7ac
	    https://www.jianshu.com/p/101a577f6561
    
    Docker三剑客之Docker Machine
        https://www.jianshu.com/p/de7a31afbaa9
	
      
# docker私服搭建
       https://www.jianshu.com/p/98c9ae484435

# 常用命令
    $ docker build -t [镜像名称]:[镜像标签]    #构建镜像
    实例：docker build -t ubuntu18:v2 .

    $ docker create -it -p 8848:8848 --name [容器名称]  [镜像名称]:[镜像标签] /bin/bash  #创建容器
    实例：docker create -it -p 8848:8848 --name u4  ubuntu18:v1 /bin/bash

    $ docker ps // 查看所有正在运行容器
    $ docker stop containerId // containerId 是容器的ID

    $ docker ps -a // 查看所有容器
    $ docker ps -a -q // 查看所有容器ID

    $ docker stop $(docker ps -a -q) //  stop停止所有容器
    $ docker  rm $(docker ps -a -q) //   remove删除所有容器

    $ docker images|grep ubuntu18| awk '{print $3} '
