package com.shearf.demo.springboot.dal.mapper;

import com.shearf.demo.springboot.domain.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by xiahaihu2009@gmail on 2017/4/4.
 */
@Repository
public interface UserMapper {
    List<User> selectAll();
}
