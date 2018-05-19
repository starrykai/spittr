import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by yaoxiaohui on 2018/5/18.
 */
@Configuration
@EnableWebMvc //启用Spring MVC
@ComponentScan("spittr.web") //启用组件扫描
public class WebConfig  extends WebMvcConfigurerAdapter{
    @Bean
    public ViewResolver viewResolver(){
        //配置JSP视图解析器
        InternalResourceViewResolver resourceViewResolver = new InternalResourceViewResolver();
        resourceViewResolver.setPrefix("/WEB-INF/views");
        resourceViewResolver.setSuffix(".jsp");
        return resourceViewResolver;
    }

    //配置静态资源的处理
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
