package com.learn.security.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import lombok.extern.slf4j.*;
import org.springframework.web.filter.*;

import java.io.*;

/**
 * @author Krishna Chaitanya
 */
@Slf4j
public class CustomSecurityFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        log.error("Coming to CustomSecurityFilter: {}", request.getRequestURI());
        response.sendError(HttpServletResponse.SC_FORBIDDEN);
    }

}
