package com.flyedu.client;

import com.flyedu.commonvo.UcentenMemberVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


/**
 * @Description 远程调用用户服务
 * @ClassName Ucenten
 * @Author cai feifei
 * @date 2020.10.19 19:14
 * @Version
 */
@FeignClient(name = "service-ucenten",fallback = UcentenFileDegradeFeignClient.class)
@Component
public interface UcentenClient {

    /**
     * 远程调用用户方法，获取用户信息
     * @param id
     * @return
     */
    @PostMapping("/ucenterService/getUserInfoForCom/{id}")
    public UcentenMemberVo getUserInfoForCom(@PathVariable("id") String id);
}
