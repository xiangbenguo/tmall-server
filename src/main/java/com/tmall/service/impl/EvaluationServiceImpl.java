package com.tmall.service.impl;

import com.tmall.dao.EvaluationMapper;
import com.tmall.entity.Evaluation;
import com.tmall.service.EvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yangxiong on 2019/3/3.
 */
@Service("evaluationService")
public class EvaluationServiceImpl implements EvaluationService {

    @Autowired
    EvaluationMapper evaluationMapper;

    @Override
    public List<Evaluation> list() {
        return evaluationMapper.list();
    }

    @Override
    public Evaluation get(Integer id) {
        return evaluationMapper.selectByPrimaryKey(id);
    }

    @Override
    public void add(Evaluation evaluation) {
        evaluationMapper.insertSelective(evaluation);
    }

    @Override
    public void update(Evaluation evaluation) {
        evaluationMapper.updateByPrimaryKeySelective(evaluation);
    }

    @Override
    public void delete(Integer id) {
        evaluationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Evaluation> getPidList(Integer pid) {
        return evaluationMapper.getPidList(pid);
    }
}
