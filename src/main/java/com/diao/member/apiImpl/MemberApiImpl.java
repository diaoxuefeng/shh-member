package com.diao.member.apiImpl;

import com.diao.base.dto.RestRequest;
import com.diao.base.dto.RestResponse;
import com.diao.base.dto.RestResponseHeader;
import com.diao.client.api.MemberApi;
import com.diao.client.dto.request.MemberAddRequest;
import com.diao.client.dto.response.CommonResponse;
import com.diao.client.dto.response.MemberResponse;
import com.diao.client.entity.Member;
import com.diao.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * 会员
 * @author dxf
 */
@RestController
public class MemberApiImpl implements MemberApi {

    @Autowired
    private MemberService memberService;


    @Override
    public RestResponse<MemberResponse> addMember(@Valid @RequestBody RestRequest<MemberAddRequest> restRequest) {
        RestResponse<MemberResponse> response = new RestResponse<MemberResponse>();
        RestResponseHeader header = new RestResponseHeader("10000","");
        response.setHeader(header);
        response.setBody(memberService.addMember(restRequest));
        return response;
    }
}
