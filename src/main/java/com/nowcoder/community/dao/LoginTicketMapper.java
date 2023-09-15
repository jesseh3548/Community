package com.nowcoder.community.dao;

import com.nowcoder.community.entity.LoginTicket;
import org.apache.ibatis.annotations.*;

@Mapper
@Deprecated
public interface LoginTicketMapper {


    //不使用xml文件 而使用注解达到相同效果
    @Insert({
            "insert into login_ticket(user_id, ticket, status, expired) ", // 每句话后加空格
            "values(#{userId},#{ticket},#{status}, #{expired}) ",
    })
    @Options(useGeneratedKeys = true, keyProperty = "id") //id自动生成 application.properties中的配置对注解SQL无效
    int insertLoginTicket(LoginTicket loginTicket);

    @Select({
            "SELECT id, user_id, ticket, status, expired ",
            "FROM login_ticket WHERE ticket=#{ticket}"
    })
    LoginTicket selectByTicket(String ticket);

    @Update({
            "<script>",
            "UPDATE login_ticket SET status=#{status} where ticket=#{ticket} ",
            "<if test=\"ticket!=null\">", // \"转译
            "and 1=1 ",
            "</if>",
            "</script>"
            //动态SQL
    })
    int updateStatus(String ticket, int status);


}
