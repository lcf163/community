# 问答社区

## 开发环境
- JDK 8
- MySQL	8.0
- Redis 3.2
- Elasticsearch 6.4.3

## 项目描述
- 使用 SpringBoot 构建一个问答社区，支持注册、登录和管理
- 使用 MySQL 保存用户信息、发帖记录、评论记录，实现基本功能
- 使用 Redis 集合类型实现点赞，有序集合类型实现关注
- 使用 Redis 存储验证码，解决分布式session共享问题
- 使用 Elasticsearch 完成全局搜索，增加关键词高亮

## 项目启动
参考博客：
https://lcf163.github.io/2020/06/24/问答平台（8），项目部署

## 运行效果
![首页](https://lcf163.github.io/2020/06/28/问答平台（8），阿里云部署/发帖测试.png)
