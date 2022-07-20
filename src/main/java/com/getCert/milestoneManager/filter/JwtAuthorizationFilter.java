package com.getCert.milestoneManager.filter;

import com.getCert.milestoneManager.constant.SecurityConstant;
import com.getCert.milestoneManager.utility.JWTTokenProvider;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.getCert.milestoneManager.constant.SecurityConstant.*;

public class JwtAuthorizationFilter extends OncePerRequestFilter {

    private JWTTokenProvider jwttokenProvider;

    public JwtAuthorizationFilter(JWTTokenProvider jwttokenProvider) {
        this.jwttokenProvider = jwttokenProvider;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        if(request.getMethod().equalsIgnoreCase(OPTIONS_HTTP_METHOD)){
            response.setStatus(HttpStatus.OK.value());
        }else{
            String authorizationHeader = request.getHeader(HttpHeaders.AUTHORIZATION);
            if(authorizationHeader == null || authorizationHeader.startsWith(TOKEN_PREFIX)){
                filterChain.doFilter(request, response);
                return;
            }
        }
    }
}
