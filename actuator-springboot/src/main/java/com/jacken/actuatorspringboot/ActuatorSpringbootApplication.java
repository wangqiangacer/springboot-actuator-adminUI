package com.jacken.actuatorspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 监控中心 actuator：可以调用接口actuator/health  返回查看mysql Redis的连接情况  返回up表示成功,
 * 返回down表示失败
 *
 *
 * actuator info ：是返回自定义的 info 的接口的信息  {"name":"wangqiang"}   自定义的必须以info开头
 *
 *
 * adminUi底层采用actuator监控应用，实现可视化界面
 */
@SpringBootApplication
public class ActuatorSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActuatorSpringbootApplication.class, args);
    }

}
