package com.board.project;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Configuration
@PropertySource("classpath:properties/env.properties")//env 파일 등록
public class WebMvcConfig implements WebMvcConfigurer{
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		// cors open => front client(react)에서 기본 3000번 포트 사용
		registry.addMapping("/**")
		.allowedOrigins("${front.host}:${front.port}")
		.allowedMethods("OPTIONS", "GET", "POST", "PUT", "DELETE");
	}
}
