package com.PPNet.dao;

import com.xzy.pojo.Chatroommessage;
import com.xzy.pojo.ChatroommessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChatroommessageMapper {
    long countByExample(ChatroommessageExample example);

    int deleteByExample(ChatroommessageExample example);

    int deleteByPrimaryKey(Integer idchatroommessage);

    int insert(Chatroommessage record);

    int insertSelective(Chatroommessage record);

    List<Chatroommessage> selectByExample(ChatroommessageExample example);

    Chatroommessage selectByPrimaryKey(Integer idchatroommessage);

    int updateByExampleSelective(@Param("record") Chatroommessage record, @Param("example") ChatroommessageExample example);

    int updateByExample(@Param("record") Chatroommessage record, @Param("example") ChatroommessageExample example);

    int updateByPrimaryKeySelective(Chatroommessage record);

    int updateByPrimaryKey(Chatroommessage record);
}