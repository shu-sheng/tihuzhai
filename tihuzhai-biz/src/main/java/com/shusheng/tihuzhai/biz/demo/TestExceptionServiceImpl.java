package com.shusheng.tihuzhai.biz.demo;

import org.springframework.stereotype.Service;

/**
 * @author shusheng
 * @description
 * @Email eric_wu_peng@126.com
 * @date 2019/4/23 21:47
 */
@Service
public class TestExceptionServiceImpl implements TestExceptionService{

    @Override
    public void add() {
        int i = 10 /0;
    }

}
