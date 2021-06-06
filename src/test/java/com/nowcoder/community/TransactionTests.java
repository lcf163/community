package com.nowcoder.community;

import com.nowcoder.community.service.impl.AlphaServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class TransactionTests {

    @Autowired
    private AlphaServiceImpl alphaServiceImpl;

    @Test
    public void testSave1() {
        Object obj = alphaServiceImpl.save1();
        System.out.println(obj);
    }

    @Test
    public void testSave2() {
        Object obj = alphaServiceImpl.save2();
        System.out.println(obj);
    }
}
