package com.getCert.milestoneManager.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.ObjectPostProcessor;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import lombok.AllArgsConstructor;

import java.util.Map;

@SuppressWarnings("deprecation")
@Configuration
@AllArgsConstructor
@EnableWebSecurity
public class WebSecurityConfig{


}
