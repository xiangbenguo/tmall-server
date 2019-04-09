package com.tmall.service.impl;

import com.tmall.dao.EvaluationMapper;
import com.tmall.dao.ProductMapper;
import com.tmall.entity.Evaluation;
import com.tmall.entity.Product;
import com.tmall.service.EvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xiangbenguo on 2019/3/3.
 */
@Service("evaluationService")
public class EvaluationServiceImpl implements EvaluationService {

    @Autowired
    EvaluationMapper evaluationMapper;

    @Autowired
    ProductMapper productMapper;

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
        Integer evaluationNum = productMapper.selectByPrimaryKey(evaluation.getPid()).getEvaluationNum();
        Product product = new Product();
        product.setId(evaluation.getPid());
        product.setEvaluationNum(evaluationNum + 1);
        productMapper.updateByPrimaryKeySelective(product);

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
