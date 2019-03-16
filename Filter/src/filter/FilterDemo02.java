package filter;

import javax.servlet.*;
import java.io.IOException;

public class FilterDemo02 implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("来到了过滤器2 before");
        chain.doFilter(req, resp);
        System.out.println("来到了过滤器2 after");
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
