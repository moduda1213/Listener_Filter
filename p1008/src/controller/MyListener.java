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
	//�湮�� �� ���غ��� (�������� ��)
    public void sessionCreated(HttpSessionEvent arg0)  { 
        System.out.println("���ο� ���� ����"+arg0.getSession()); 
    }

    public void sessionDestroyed(HttpSessionEvent arg0)  { 
    	System.out.println("���ο� ���� �ı�"+arg0.getSession()); 
    }
	
}
