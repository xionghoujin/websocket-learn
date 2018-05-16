package com.xhj.websocketlearn.pojo;

/**
 * Created by 熊厚谨 on 2018/5/16 19:52
 * @ClassName: ServerMessage
 * @Description: 服务端发送消息实体
 * @author 熊厚谨
 */
public class ServerMessage {
    private String responseMessage;

    public ServerMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
}
