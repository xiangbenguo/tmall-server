package com.tmall.controller;

import com.tmall.common.CodeMessageDef;
import com.tmall.common.GlobalHandler;
import com.tmall.common.MyException;
import com.tmall.common.ResultBean;
import com.tmall.entity.Evaluation;
import com.tmall.service.EvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(allowCredentials = "true", value = "http://localhost:8081")
@RestController
@RequestMapping(value = "/evaluation")
public class EvaluationController extends GlobalHandler {
    @Autowired
    EvaluationService evaluationService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public Object list() {
        List<Evaluation> list = evaluationService.list();
        return new ResultBean(list);
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public Object get(@RequestParam(required = false) Integer id) throws MyException {
        if (id == null) {
            throw new MyException(CodeMessageDef.PARAMETER_ERROR);
        }
        Evaluation evaluation = evaluationService.get(id);
        return new ResultBean(evaluation);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Object add(@RequestBody Evaluation evaluation) throws MyException {
        if (evaluation == null) {
            throw new MyException(CodeMessageDef.PARAMETER_ERROR);
        }
        evaluationService.add(evaluation);
        return new ResultBean();
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Object update(@RequestBody Evaluation evaluation) throws MyException {
        if (evaluation == null || evaluation.getId() == null) {
            throw new MyException(CodeMessageDef.PARAMETER_ERROR);
        }
        evaluationService.update(evaluation);
        return new ResultBean();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public Object delete(@RequestBody Evaluation evaluation) throws MyException {
        if (evaluation == null || evaluation.getId() == null) {
            throw new MyException(CodeMessageDef.PARAMETER_ERROR);
        }
        evaluationService.delete(evaluation.getId());
        return new ResultBean();
    }

    @RequestMapping(value = "getPidList", method = RequestMethod.GET)
    public Object getPidList(@RequestParam(required = false) Integer pid) throws MyException {
        if (pid == null) {
            throw new MyException(CodeMessageDef.PARAMETER_ERROR);
        }

        List<Evaluation> list = evaluationService.getPidList(pid);
        return new ResultBean(list);
    }

}
