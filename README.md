# sofa-ark-class-isolation
通过多plugin解决类冲突问题

1. 下载plugin代码仓库
`git clone https://github.com/sofastack-guides/sofa-ark-multi-plugin.git`
2. 在plugin代码仓库里执行 `mvn install -DskipTests`
3. 下载本仓库代码 `git clone https://github.com/sofastack-guides/sofa-ark-class-isolation.git`
4. 在本仓库代码里执行 `mvn clean package -DskipTests`
5. 本地IDE启动，或者 `java -jar sofa-ark-class-isolation-0.0.1-SNAPSHOT-ark-executable.jar`，注意不要加 `-Dsofa.ark.embed.enable=true` 的参数
6. 检查是否生效，访问两个不同版本的请求，查看日志
```shell
curl http://localhost:8080/hello-hessian3
```


```shell
curl http://localhost:8080/hello-hessian3
```

![image](https://github.com/sofastack-guides/sofa-ark-class-isolation/assets/3754074/625cfb95-b8fd-4301-9d90-bab46a88d6ed)


感谢[QilongZhang](https://github.com/QilongZhang)提供的文档与demo，详细介绍参考[这里](https://developer.aliyun.com/article/625338)
