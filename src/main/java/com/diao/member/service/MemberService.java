package com.diao.member.service;

import com.diao.base.dto.RestRequest;
import com.diao.client.dto.request.MemberAddRequest;
import com.diao.client.dto.response.CommonResponse;
import com.diao.client.dto.response.MemberResponse;
import com.diao.client.entity.Member;

/**
 * @author
 */
public interface MemberService {
    /**
     * 新增会员信息
     * @param restRequest
     * @return
     */
    MemberResponse addMember(RestRequest<MemberAddRequest> restRequest);
}
