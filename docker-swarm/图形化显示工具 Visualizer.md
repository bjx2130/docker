Visualizer非常直观地显示了Swarm集群中，服务器的状态和服务器上面运行容器的状态。

# 运行监控服务的容器：
     docker service create --name=viz --publish=8080:8080/tcp --constraint=node.role==manager --    mount=type=bind,src=/var/run/docker.sock,dst=/var/run/docker.sock dockersamples/visualizer


# 注意事项：
    1、避免端口冲突，默认为8080。
    2、在Docker 1.12.0以上版本的集群中使用，没有集群就无法查看集群的信息。
    3、要在管理节点上安装。

# docker stack部署的方式
    visualizer:
      image: dockersamples/visualizer:stable
      ports:
        - "8080:8080"
      stop_grace_period: 1m30s
      volumes:
        - "/var/run/docker.sock:/var/run/docker.sock"
      deploy:
        placement:
          constraints: [node.role == manager]
