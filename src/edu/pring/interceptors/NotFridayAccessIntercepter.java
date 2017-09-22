package edu.pring.interceptors;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class NotFridayAccessIntercepter extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object handler)
			throws Exception {
	Calendar calander=Calendar.getInstance();
	int dayOfWeek=calander.get(calander.DAY_OF_WEEK);
	if(dayOfWeek==6){
		
		response.getWriter().write("website is closed on friday");
		return false;
	}
	
		return true;
	}
	
	

}
