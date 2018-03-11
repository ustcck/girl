package com.ustcck.repository;

import com.ustcck.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by CaoKai on 2018/3/10 22:03.
 * Email:caokai@yijiahe.com
 */
public interface GirlRepository extends JpaRepository<Girl, Integer> {

    //通过年龄来查询
    public List<Girl> findByAge(Integer age);
}
