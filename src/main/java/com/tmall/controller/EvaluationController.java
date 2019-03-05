package com.tmall.controller;

import com.tmall.common.ResultBean;
import com.tmall.entity.Evaluation;
import com.tmall.service.EvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.web.bind.annotation.*;

import javax.management.ValueExp;
import java.util.List;

@RestController
@RequestMapping(value = "evaluation")
public class EvaluationController {
    @Autowired
    EvaluationService evaluationService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public Object list() {
        List<Evaluation> list = evaluationService.list();
        return new ResultBean(list);
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public Object get(@RequestParam(required = false) Integer id) {
        if (id == null) {
            // TODO
        }
        Evaluation evaluation = evaluationService.get(id);
        return new ResultBean(evaluation);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Object add(@RequestBody Evaluation evaluation) {
        if (evaluation == null) {
            //TODO
        }
        evaluationService.add(evaluation);
        return new ResultBean();
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Object update(@RequestBody Evaluation evaluation) {
        if (evaluation == null || evaluation.getId() == null) {
            //TODO
        }
        evaluationService.update(evaluation);
        return new ResultBean();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public Object delete(@RequestBody Evaluation evaluation) {
        if (evaluation == null || evaluation.getId() == null) {
            //TODO
        }
        evaluationService.delete(evaluation.getId());
        return new ResultBean();
    }

}
