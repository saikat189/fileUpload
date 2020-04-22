package com.practice.configuration;//
//package com.practice.configuration;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
////@EnableWebSecurity
//public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {
//
//    private static final String[] AUTH_WHITELIST = {
//            // -- swagger ui
//            "/v2/api-docs",
//            "/swagger-resources",
//            "/swagger-resources/**",
//            "/configuration/ui",
//            "/configuration/security",
//            "/swagger-ui.html",
//            "/webjars/**"
//            // other public endpoints of your API may be appended to this array
//    };
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.
//                // ... here goes your custom security configuration
//                        authorizeRequests().
//                antMatchers(AUTH_WHITELIST).permitAll().  // whitelist Swagger UI resources
//                // ... here goes your custom security configuration
//                        antMatchers("/**").authenticated();  // require authentication for any endpoint that's not whitelisted
//    }
//
//}
