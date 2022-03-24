package hello.demo;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        // basePackages = "hello.demo.discount", // 탐색할 위치를 지정할 수 있음
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
// AppConfig는 자동등록되면 안됨 (수동 등록하기 위해 만든거니까)
public class AutoAppConfig {

}
