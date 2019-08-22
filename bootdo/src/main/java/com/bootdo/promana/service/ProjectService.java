package com.bootdo.promana.service;

import com.bootdo.promana.domain.ProjectDO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface ProjectService {

    ProjectDO get(String id);

    List<ProjectDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    int save(ProjectDO project);

    int update(ProjectDO project);

    int remove(String id);

    int batchRemove(String[] ids);


}
