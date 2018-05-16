package com.xhj.websocketlearn.controller;

import com.xhj.websocketlearn.pojo.ServerMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 熊厚谨 on 2018/5/16 20:20
 *
 * @author 熊厚谨
 */
@RestController
@RequestMapping("/send")
public class ServerController {

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    //客户端只要订阅了/topic/subscribeTest主题，调用这个方法即可
    @RequestMapping("/test")
    public void templateTest() {
        messagingTemplate.convertAndSend("/topic/subscribeTest", new ServerMessage("服务器主动推的数据"));
    }
}
