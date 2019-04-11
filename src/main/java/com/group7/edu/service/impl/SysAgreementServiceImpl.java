package com.group7.edu.service.impl;

import com.group7.edu.entity.SysAgreement;
import com.group7.edu.mapper.SysAgreementExtMapper;
import com.group7.edu.service.SysAgreementService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Yyjs
 */
@Service
public class SysAgreementServiceImpl implements SysAgreementService {

    @Resource
    private SysAgreementExtMapper sysAgreementExtMapper;

    @Override
    public SysAgreement findAgreementByName(String name) {
        List<SysAgreement> sysAgreements = sysAgreementExtMapper.selectByName(name);
        if (sysAgreements == null || sysAgreements.size() < 1) {
            return null;
        }
        return sysAgreements.get(0);
    }
}
