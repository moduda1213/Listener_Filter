package controller;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*")
public class MyFilter implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		request.setCharacterEncoding("utf-8"); // 앞으로 이 문구를 적을 필요가 없다
		
		System.out.println("전...");
		chain.doFilter(request, response);
		System.out.println("후...");
	}
    
	public void destroy() {
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
