package com.PPNet.dao;

import com.xzy.pojo.Friend;
import com.xzy.pojo.FriendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FriendMapper {
    long countByExample(FriendExample example);

    int deleteByExample(FriendExample example);

    int deleteByPrimaryKey(Integer idfriend);

    int insert(Friend record);

    int insertSelective(Friend record);

    List<Friend> selectByExample(FriendExample example);

    Friend selectByPrimaryKey(Integer idfriend);

    int updateByExampleSelective(@Param("record") Friend record, @Param("example") FriendExample example);

    int updateByExample(@Param("record") Friend record, @Param("example") FriendExample example);

    int updateByPrimaryKeySelective(Friend record);

    int updateByPrimaryKey(Friend record);
}