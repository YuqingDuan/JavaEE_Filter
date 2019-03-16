package filter;

import javax.servlet.*;
import java.io.IOException;

public class FilterDemo03 implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("来到了过滤器3 before");
        chain.doFilter(req, resp);
        System.out.println("来到了过滤器3 after");
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
