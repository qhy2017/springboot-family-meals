package qhy.example.security.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import qhy.example.security.entity.User;
import qhy.example.security.service.UserService;

import java.util.ArrayList;

/**
 * @auth qhy
 * @email 1242359237@qq.com
 * @date
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        log.info("用户名",s);
        log.info(s);
        User user = new User();
        user.setId(123L);
        user.setUsername("admin");
        user.setPassword(new BCryptPasswordEncoder().encode("admin"));
        return user;
    }
}
