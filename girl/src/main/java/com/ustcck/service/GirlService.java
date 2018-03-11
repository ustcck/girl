package com.ustcck.service;

import com.ustcck.domain.Girl;
import com.ustcck.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by CaoKai on 2018/3/10 23:40.
 * Email:caokai@yijiahe.com
 */
@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void insertTwo(){
        Girl girlA = new Girl();
        girlA.setAge(12);
        girlA.setCupSize("C");
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setAge(13);
        girlB.setCupSize("DDDD");
        girlRepository.save(girlB);
    }
}
