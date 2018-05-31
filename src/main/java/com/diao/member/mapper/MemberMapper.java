package com.diao.member.mapper;

import com.diao.base.mapper.ShhMapper;
import com.diao.client.entity.Member;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper extends ShhMapper<Member> {
}