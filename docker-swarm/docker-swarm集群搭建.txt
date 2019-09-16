
一、创建三个虚拟机
	docker-machine create -d hyperv --hyperv-virtual-switch DockerNAT manager
	docker-machine create -d hyperv --hyperv-virtual-switch DockerNAT worker1
	docker-machine create -d hyperv --hyperv-virtual-switch DockerNAT worker2

二、登陆manager节点
	初始化docker swarm集群：docker swarm init --advertise-addr [manager.IP]

三、登陆工作节点
	加入swarm集群
		docker swarm join --token SWMTKN-1-53f8gge81soxrt2l53neii23ntfr6cybbmblzwbyr4du1oa2v7-2agev7caz4c7zqmmcxie84qia 10.32.241.254:2377

四、编写yml文件，部署服务
	1.编写 base-stack.yml
		

	2.开始部署	      
		docker stack deploy -c base-stack.yml redis
		查看：
			docker stack ls
			docker service ls
			docker service ps redis-stack_redis
			docker service logs [服务名]

排错步骤
	1.docker service ps base_redis 查看ERROR 列错误信息
	2. docker service logs base_redis 查看错误日志信息
	




其他命令：
	登录节点：docker-machine ssh manager
	查看节点：docker node ls	





		






