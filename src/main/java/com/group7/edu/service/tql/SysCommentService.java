package com.group7.edu.service.tql;

import com.group7.edu.entity.tql.SysComment;
import com.group7.edu.utils.ResultData;

public interface SysCommentService {
    ResultData commentaryInformation(int vid);
    ResultData addComments(SysComment sysComment);
}
