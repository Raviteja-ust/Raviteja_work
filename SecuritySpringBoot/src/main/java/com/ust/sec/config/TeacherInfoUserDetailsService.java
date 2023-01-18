package com.ust.sec.config;

import com.ust.sec.entity.Teacher;
import com.ust.sec.repositary.TeacherInfoRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class TeacherInfoUserDetailsService implements UserDetailsService {

    @Autowired
    private TeacherInfoRepositary teacherInfoRepositary;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Teacher> teacherInfo= teacherInfoRepositary.findByName(username);
        return teacherInfo.map(TeacherInfoUserDetails::new)
                .orElseThrow(() -> new UsernameNotFoundException("user not found " + username));
    }
}
