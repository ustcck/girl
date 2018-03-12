package com.ustcck;

import com.ustcck.domain.Girl;
import com.ustcck.service.GirlService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

/**
 * Created by CaoKai on 2018/3/12 13:06.
 * Email:caokai@yijiahe.com
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GirlServiceTest {
    @Autowired
    private GirlService girlService;

    @Test
    public void findOneTest() {
        Optional<Girl> girlOptional = girlService.findOne(44);
        Girl girl = girlOptional.orElse(null);
        Assert.assertEquals(new Integer(45), girl.getAge());
    }
}
