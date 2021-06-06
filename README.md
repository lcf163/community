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
- 使用 Redis 存储验证码，解决分布式session问题
- 使用 Elasticsearch 完成全局搜索，增加关键词高亮

## 项目启动
参考博客：
https://lcf163.gitee.io/2020/06/24/%E9%97%AE%E7%AD%94%E5%B9%B3%E5%8F%B0%EF%BC%888%EF%BC%89%EF%BC%8C%E9%A1%B9%E7%9B%AE%E9%83%A8%E7%BD%B2/

## 运行效果
![首页](https://lcf163.gitee.io/2020/06/28/%E9%97%AE%E7%AD%94%E5%B9%B3%E5%8F%B0%EF%BC%888%EF%BC%89%EF%BC%8C%E9%98%BF%E9%87%8C%E4%BA%91%E9%83%A8%E7%BD%B2/%E5%8F%91%E5%B8%96%E6%B5%8B%E8%AF%95.png)
