package com.bootdo.promana.service.impl;

import com.bootdo.promana.domain.ProjectDO;
import com.bootdo.promana.service.ProjectService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Transactional
@Service
public class ProjectServiceImpl implements ProjectService {
    @Override
    public ProjectDO get(String id) {
        return null;
    }

    @Override
    public List<ProjectDO> list(Map<String, Object> map) {
        return null;
    }

    @Override
    public int count(Map<String, Object> map) {
        return 0;
    }

    @Override
    public int save(ProjectDO project) {
        return 0;
    }

    @Override
    public int update(ProjectDO project) {
        return 0;
    }

    @Override
    public int remove(String id) {
        return 0;
    }

    @Override
    public int batchRemove(String[] ids) {
        return 0;
    }
}
