package com.example.websocket;

import org.springframework.stereotype.Component;

import javax.websocket.OnClose;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;

@Component
@ServerEndpoint("/websocket/{msg}")
public class WebSocketServer {

    @OnOpen
    public void open(@PathParam("msg")String msg, Session session){
        System.out.println("web socket open.");
    }

    @OnClose
    public void close(){
        System.out.println("web socket close.");
    }

}
