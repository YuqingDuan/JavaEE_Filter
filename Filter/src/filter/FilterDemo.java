package filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Filter作用
 * 1. 对一些敏感词汇进行过滤
 * 2. 统一设置编码
 * 3. 自动登录
 *
 */
public class FilterDemo implements Filter {
    public void destroy() {
        System.out.println("过滤器销毁了...");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("来到过虑器了。。。");
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
        System.out.println("过滤器创建了...");
    }

}
