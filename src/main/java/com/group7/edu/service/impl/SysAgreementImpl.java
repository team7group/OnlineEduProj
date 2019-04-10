package com.group7.edu.service.impl;

import com.group7.edu.entity.SysAgreement;
import com.group7.edu.mapper.SysAgreementMapper;
import com.group7.edu.service.SysAgreementService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Yyjs
 */
public class SysAgreementImpl implements SysAgreementService {

    @Resource
    private SysAgreementMapper sysAgreementMapper;

    @Override
    public SysAgreement findAgreementByName(String name) {
        List<SysAgreement> sysAgreements = sysAgreementMapper.selectByName(name);
        if (sysAgreements == null || sysAgreements.size() < 1) {
            return null;
        }
        return sysAgreements.get(0);
    }
}
