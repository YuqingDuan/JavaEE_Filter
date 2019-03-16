package filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * 客户端发出请求，先经过过滤器， 如果过滤器放行，那么才能到servlet
 * 如果有多个过滤器， 那么他们会按照注册的映射顺序来排队。
 * 只要有一个过滤器， 不放行，那么后面排队的过滤器以及咱们的servlet都不会收到请求。
 */
public class FilterDemo04 implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("来到了过滤器4 before");
        chain.doFilter(req, resp);
        System.out.println("来到了过滤器4 after");
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
