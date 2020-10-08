package controller;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class MyListener
 *
 */
@WebListener
public class MyListener implements HttpSessionListener {
	//방문자 수 구해보기 (여유있을 때)
    public void sessionCreated(HttpSessionEvent arg0)  { 
        System.out.println("새로운 세션 생성"+arg0.getSession()); 
    }

    public void sessionDestroyed(HttpSessionEvent arg0)  { 
    	System.out.println("새로운 세션 파괴"+arg0.getSession()); 
    }
	
}
