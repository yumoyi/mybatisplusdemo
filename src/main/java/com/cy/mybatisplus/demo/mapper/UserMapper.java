package com.cy.mybatisplus.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cy.mybatisplus.demo.pojo.User;
import lombok.Data;
import org.springframework.stereotype.Repository;

/**
 * @author cy
 * @since 2020-11-12 9:56
 */
@Repository
public interface UserMapper extends BaseMapper<User> {

}
