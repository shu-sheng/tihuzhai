package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.MessageReceived;
import com.shusheng.tihuzhai.dao.entity.auto.MessageReceivedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessageReceivedMapper {
    int countByExample(MessageReceivedExample example);

    int deleteByExample(MessageReceivedExample example);

    int deleteByPrimaryKey(Long receivedId);

    int insert(MessageReceived record);

    int insertSelective(MessageReceived record);

    List<MessageReceived> selectByExampleWithBLOBs(MessageReceivedExample example);

    List<MessageReceived> selectByExample(MessageReceivedExample example);

    MessageReceived selectByPrimaryKey(Long receivedId);

    int updateByExampleSelective(@Param("record") MessageReceived record, @Param("example") MessageReceivedExample example);

    int updateByExampleWithBLOBs(@Param("record") MessageReceived record, @Param("example") MessageReceivedExample example);

    int updateByExample(@Param("record") MessageReceived record, @Param("example") MessageReceivedExample example);

    int updateByPrimaryKeySelective(MessageReceived record);

    int updateByPrimaryKeyWithBLOBs(MessageReceived record);

    int updateByPrimaryKey(MessageReceived record);
}