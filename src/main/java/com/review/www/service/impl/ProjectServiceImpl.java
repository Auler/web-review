package com.review.www.service.impl;

import com.jopool.jweb.entity.Result;
import com.jopool.jweb.enums.Code;
import com.jopool.jweb.spring.SelfBeanAware;
import com.review.www.dao.*;
import com.review.www.entity.*;
import com.review.www.service.ProjectService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zhangtianfeng on 16/5/4.
 */
@Service
public class ProjectServiceImpl extends BaseServiceImpl implements ProjectService, SelfBeanAware<ProjectService> {
    private ProjectService     selfService;
    @Resource
    private AnnouncementMapper announcementMapper;
    @Resource
    private ClassOneMapper     classOneMapper;
    @Resource
    private ClassTwoMapper     classTwoMapper;
    @Resource
    private ClassThreeMapper   classThreeMapper;
    @Resource
    private ProjectMapper      projectMapper;

    @Override
    public void setSelfBean(ProjectService object) {
        this.selfService = object;
    }

    @Override
    public void doAddProjectAnnouncement(Announcement announcement, ClassThree classThree) {
        announcement.setClassThreeId(classThree.getId());
        announcementMapper.insert(announcement);
        classThreeMapper.insert(classThree);
    }

    @Override
    public List<ClassOne> getClassOneList() {
        return classOneMapper.selectAllClassOne();
    }

    @Override
    public List<ClassTwo> getClassTwoList() {
        return classTwoMapper.selectAllClassTwo();
    }

    @Override
    public Result declareProject(Project project) {
        projectMapper.insert(project);
        return new Result(Code.SUCCESS);
    }
}