package com.review.www.service.impl;

import com.jopool.jweb.entity.Result;
import com.jopool.jweb.enums.Code;
import com.jopool.jweb.spring.SelfBeanAware;
import com.review.www.constants.Constants;
import com.review.www.dao.*;
import com.review.www.entity.*;
import com.review.www.service.ProjectService;
import com.review.www.vo.SearchProjectVo;
import org.apache.ibatis.session.RowBounds;
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
    @Resource
    private FileMapper      fileMapper;

    @Override
    public void setSelfBean(ProjectService object) {
        this.selfService = object;
    }

    @Override
    public void doAddProjectAnnouncement(Announcement announcement, ClassThree classThree) {
        announcement.setNumber(createNumber(Constants.NUMBER_ANNOUNCEMENT));
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
        project.setNumber(createNumber(Constants.NUMBER_PROJECT));
        projectMapper.insert(project);
        return new Result(Code.SUCCESS);
    }

    @Override
    public List<Project> searchProject(SearchProjectVo searchProjectVo, RowBounds page) {
        return projectMapper.searchProject(searchProjectVo, page);
    }

    @Override
    public List<ClassThree> searchProjectAnnouncementList(SearchProjectVo searchProjectVo, RowBounds page) {
        return classThreeMapper.search(searchProjectVo, page);
    }

    @Override
    public List<Announcement> searchAnnouncementList(SearchProjectVo searchProjectVo, RowBounds page) {
        return announcementMapper.searchAnnouncement(searchProjectVo, page);
    }

    @Override
    public Result removeAnnouncment(String id) {
        announcementMapper.deleteByPrimaryKey(id);
        return new Result(Code.SUCCESS);
    }

    @Override
    public Result removeClassThree(String id) {
        classThreeMapper.deleteByPrimaryKey(id);
        return new Result(Code.SUCCESS);
    }

    @Override
    public Result removeProject(String id) {
        projectMapper.deleteByPrimaryKey(id);
        return new Result(Code.SUCCESS);
    }

    @Override
    public void addFile(File file) {
        fileMapper.insert(file);
    }
}
