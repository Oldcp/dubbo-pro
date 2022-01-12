package com.itheima.service.Impl;

import com.itheima.service.UserService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author old money
 * @create 2022-01-11 15:36
 */

// @Service 将该类的对象创建出来，放到spring的容器中

@Service //将这个类提供的方法（服务） 对外发布，将访问的地址 IP 端口 路径注册到注册中心中
public class UserServiceImpl implements UserService {


    public String sayHello() {
        return "hello dubbo and hello world! LBWNB";
    }
}
