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
        // sending custom error code and message
        var errorMessage = """
                {
                    "error" : "true",
                    "code" : "AUTH-1210",
                    "message" : "custom filter authentication failed"
                }
                """;
        response.sendError(HttpServletResponse.SC_FORBIDDEN, errorMessage);

    }

}
