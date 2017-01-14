package by.hospital.kurganovich.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class UrlFilter implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		HttpServletRequest httpServletRequest;
		HttpServletResponse httpServletResponse;
		HttpSession session;
		Integer id = null;
		String url = null;
		String redirectUrl;
		if (request instanceof HttpServletRequest) {
			httpServletRequest = (HttpServletRequest) request;
			session = httpServletRequest.getSession(true);
			id = (Integer)session.getAttribute("id");
			url = ((HttpServletRequest)request).getRequestURI();
		}
		boolean filterFlag = false;
		if ((id == null && (url.equals("/Hospital/") || url.equals("/Hospital/login"))) || id != null)
				filterFlag = true;
		if (filterFlag)
			chain.doFilter(request, response);
		else {
			redirectUrl = "login?error=failUrl";
			if (response instanceof HttpServletResponse) {
				httpServletResponse = (HttpServletResponse) response;
				httpServletResponse.sendRedirect(redirectUrl);
			}
		}
			
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
