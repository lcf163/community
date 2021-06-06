package com.nowcoder.community.service;

import java.util.Date;

public interface DataService {

    // 将指定的IP计入UV
    void recordUV(String ip);

    // 统计指定日期范围内的UV
    long calculateUV(Date start, Date end);

    // 将指定用户计入DAU
    void recordDAU(int userId);
}
