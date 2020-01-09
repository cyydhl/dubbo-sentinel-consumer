package com.itcast.sentinel.sentinelWeb;

import com.alibaba.dubbo.rpc.RpcContext;
import com.itcast.sentinel.SentinelService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/8/11.
 */

@RestController
public class SentinelDubboController {

    @Reference
    SentinelService sentinelService;
    @GetMapping("/say")
    public String sayHello(){
        String result=sentinelService.sayHello("Mic");
        return result;
    }
}