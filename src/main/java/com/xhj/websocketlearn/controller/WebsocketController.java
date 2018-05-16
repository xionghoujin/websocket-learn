package com.xhj.websocketlearn.controller;

import com.xhj.websocketlearn.pojo.ClientMessage;
import com.xhj.websocketlearn.pojo.ServerMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.simp.annotation.SubscribeMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 熊厚谨 on 2018/5/16 19:54
 *
 * @author 熊厚谨
 */
@Controller
public class WebsocketController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 消息回复
     *
     * @param message
     * @return
     */
    @MessageMapping("/sendTest")
    @SendTo("/topic/subscribeTest")
    public ServerMessage sendDemo(ClientMessage message) {
        logger.info("接收到了信息:" + message.getName());
        return new ServerMessage("你发送的消息为:" + message.getName());
    }

    /**
     * 消息订阅
     *
     * @return
     */
    @SubscribeMapping("/subscribeTest")
    public ServerMessage sub() {
        logger.info("XXX用户订阅了我。。。");
        return new ServerMessage("感谢你订阅了我。。。");
    }


}
