package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import spring.MemberPrinter;

@Configuration
@ComponentScan(basePackages = {"spring"})
public class AppCtx {
	@Bean
	public MemberPrinter memberPrinter() {
		return new MemberPrinter();
	}
	
}
