package com.ssm.WebSocket;

import javax.servlet.http.HttpSession;
import javax.websocket.EndpointConfig;
import javax.websocket.OnClose;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;

@ServerEndpoint(value = "/kickoff",configurator = GetHttpSessionConfigurator.class)
public class Kickoff {
    private Session session;
    @OnOpen
    public void wsOpen(Session session, EndpointConfig config){
        System.out.println("ws opened: "+session.getId()+"  "+this);
        HttpSession httpSession= (HttpSession) config.getUserProperties().get(HttpSession.class.getName());
        httpSession.setAttribute("KickOff",this);
        this.session=session;
    }
    @OnClose
    public void wsClose(Session session){
        System.out.println("ws closed: "+session.getId()+"  "+this);
    }
    public void sendMessage() throws IOException {
        session.getBasicRemote().sendText("you are kicked off");
    }
}
