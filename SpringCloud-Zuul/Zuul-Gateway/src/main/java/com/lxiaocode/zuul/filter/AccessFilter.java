package com.lxiaocode.zuul.filter;


import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author lixiaofeng
 * @date 2020/11/9 下午4:04
 * @blog http://www.lxiaocode.com/
 */
@Component
public class AccessFilter extends ZuulFilter {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 过滤器的类型，它决定过滤器在请求的那个生命周期执行。
     * “pre”，表示请求会在路由请求之前执行。
     * “routing”，在路由被请求时调用
     * “post”，在 routing 和 error 过滤器之后被调用
     * “error”，处理请求时发生错误时被调用
     * @return
     */
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    /**
     * 过滤器的执行顺序，当请求在一个阶段存在多个过滤器时，
     * 需要根据该返回值来依次执行。数值越小优先级越高。
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 判断该过滤器是否被执行。
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 过滤器的具体逻辑
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();

        logger.info("send {} request to {}", request.getMethod(), request.getRequestURL().toString());

        String accessToken = request.getParameter("accessToken");
        if (accessToken == null) {
            logger.warn("access token is empty");
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(401);
            return null;
        }
        logger.info("access token is ok");
        return null;
    }
}
