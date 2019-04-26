package com.group7.edu.mapper.tql;

import com.group7.edu.entity.tql.SysComment;

import java.util.List;

public interface SysCommentTqlMapper {
    List<SysComment> commentaryInformation(int vid);
    int addComments(SysComment sysComment);
}
