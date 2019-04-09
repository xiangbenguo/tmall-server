package com.tmall.service;

import com.tmall.entity.Evaluation;

import java.util.List;

/**
 * Created by xiangbenguo on 2019/3/3.
 */
public interface EvaluationService {
    List<Evaluation> list();

    Evaluation get(Integer id);

    void add(Evaluation evaluation);

    void update(Evaluation evaluation);

    void delete(Integer id);

    List<Evaluation> getPidList(Integer pid);
}
