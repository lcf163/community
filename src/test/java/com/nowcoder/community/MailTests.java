package com.nowcoder.community;

import com.nowcoder.community.util.MailClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class MailTests {

    @Autowired
    private MailClient mailClient;

    @Autowired
    private TemplateEngine templateEngine;

    @Test
    public void testTextMail() {
        mailClient.sendMail("liming163vip@163.com", "TEST", "Welcome.");
    }

    @Test
    public void testHtmlMail() {
        // 构建参数,传入网页
        Context context = new Context();
        context.setVariable("username", "Saturday");

        // 调用模版引擎
        String content = templateEngine.process("/mail/demo", context);
        System.out.println(content);

        // 发送邮件,将HTML作为内容
        mailClient.sendMail("liming163vip@163.com", "HTML", content);
    }
}
