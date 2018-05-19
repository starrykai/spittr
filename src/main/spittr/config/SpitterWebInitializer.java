package spittr.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import spittr.web.WebConfig;
/**
 * Created by yaoxiaohui on 2018/5/18.
 */
public class SpitterWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{ RootConfig.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{ WebConfig.class };
    }

    //将一个或多个路径映射到DispatcherServlet上。
    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};//默认的Servlet，处理进入应用的所有请求
    }
}
