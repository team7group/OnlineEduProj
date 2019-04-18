package com.group7.edu.mapper.czr;

import com.group7.edu.entity.SysAgreement;

import java.util.List;

public interface SysAgreementExtMapper {
    List<SysAgreement> selectByName(String name);
}
