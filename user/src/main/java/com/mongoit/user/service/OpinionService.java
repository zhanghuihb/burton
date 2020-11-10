package com.mongoit.user.service;


import com.mongoit.common.base.BaseRequest;
import com.mongoit.common.base.Result;
import com.mongoit.common.vo.user.SaveOpinionRequest;

/**
 * @author Tainy
 * @date 2018/6/27 16:15
 */
public interface OpinionService {

    Result<?> saveOpinion(BaseRequest<SaveOpinionRequest> baseRequest) throws Exception;

}
