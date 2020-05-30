package qhy.example.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import qhy.example.security.service.UserService;

/**
 * 安全配置
 *@auth qhy
 *@email 1242359237@qq.com
 *@date 2020/5/20 0:23
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    UserService userService;
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userService).passwordEncoder(new BCryptPasswordEncoder());
//        auth.inMemoryAuthentication()
////                .withUser("admin").password(new BCryptPasswordEncoder().encode("{noop}admin")).roles("USER");
//                .withUser("admin").password("{noop}admin");
//        super.configure(auth);
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //整体项目
        http.authorizeRequests().anyRequest().authenticated()
                    .and()
                    .formLogin().loginProcessingUrl("/index");

        //适合前后端分离
//        http.authorizeRequests().anyRequest().authenticated()
//                .and()
//                .formLogin()
//                .successHandler((request,response,authentication)->{response.getWriter().write("success");}).permitAll()
//                .and().csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse());


//        super.configure(http);
    }
}
