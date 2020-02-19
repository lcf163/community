<<<<<<< HEAD
package com.nowcoder.community.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class AlphaDaoMybatisImpl implements AlphaDao {

    @Override
    public String select() {
        return "Mybatis";
    }
}
=======
package com.nowcoder.community.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class AlphaDaoMybatisImpl implements AlphaDao {

    @Override
    public String select() {
        return "Mybatis";
    }
}
>>>>>>> 中断项目恢复后提交
