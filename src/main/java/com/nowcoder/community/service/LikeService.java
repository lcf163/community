package com.nowcoder.community.service;

public interface LikeService {

    // 点赞
    void like(int userId, int entityType, int entityId, int entityUserId);

    // 查询某实体点赞的数量
    long findEntityLikeCount(int entityType, int entityId);
}
