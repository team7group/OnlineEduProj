package com.group7.edu.service.wjy.impl;

import com.group7.edu.entity.SysAgreement;
import com.group7.edu.mapper.wjy.SysAgreementMapperWjy;
import com.group7.edu.service.wjy.SysAgreementService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Yyjs
 */
@Service("sysAgreementServiceWjy")
public class SysAgreementImpl implements SysAgreementService {

    @Resource
    private SysAgreementMapperWjy sysAgreementMapperWjy;

    @Override
    public SysAgreement findAgreementByName(String name) {
        List<SysAgreement> sysAgreements = sysAgreementMapperWjy.selectByName(name);
        if (sysAgreements == null || sysAgreements.size() < 1) {
            return null;
        }
        return sysAgreements.get(0);
    }
}
