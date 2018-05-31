package com.diao.member.service.impl;

import com.diao.base.Exception.BusinessException;
import com.diao.base.dto.RestRequest;
import com.diao.client.dto.request.MemberAddRequest;
import com.diao.client.dto.response.MemberResponse;
import com.diao.client.entity.Member;
import com.diao.member.mapper.MemberMapper;
import com.diao.member.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author dxf
 *
 */
@Slf4j
@Service
public class MemberServiceImpl implements MemberService {
    @Resource
    private MemberMapper memberMapper;

    @Override
    public MemberResponse addMember(RestRequest<MemberAddRequest> restRequest) {
        MemberResponse response = new MemberResponse();
        // 验证参数
        if(restRequest == null || restRequest.getBody() == null){
            throw new BusinessException("","");
        }
        MemberAddRequest memberAdd = restRequest.getBody();
        Member member = new Member();
        member.setMobile(restRequest.getBody().getMobile());
        // 查询数据
        List<Member> memberList = memberMapper.select(member);
        if(memberList != null && memberList.size() > 0){

        }else{
            // 新增
            BeanUtils.copyProperties(memberAdd,member);

        }
        BeanUtils.copyProperties(member,response);
        return response;
    }
}
