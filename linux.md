常用组合,查看出正在连接和网络信息
netstat -ntulpa

 netstat -tl　　　　-nltp
查看当前tcp监听端口

netstat -tlp
      查看当前tcp监听端口, 需要显示监听的程序名,当不清楚mysql的监听端口时比较好用
      
Jenkins 后台运行SpringBoot应用
http://stackoverflow.com/questions/28500066/how-to-deploy-springboot-maven-application-with-jenkins
命令:
echo "mvn spring-boot:run" | at now + 1 minutes

部署之后，java应用存储在 jenkins的workspace的目录下