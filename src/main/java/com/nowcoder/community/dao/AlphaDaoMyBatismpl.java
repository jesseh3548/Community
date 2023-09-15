package com.nowcoder.community.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Primary
@Repository

public class AlphaDaoMyBatismpl implements AlphaDao{

    @Override
    public String select() {
        return "MyBatis";
    }
}




