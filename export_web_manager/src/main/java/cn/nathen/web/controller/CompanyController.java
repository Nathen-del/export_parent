package cn.nathen.web.controller;

import cn.nathen.domain.company.Company;
import cn.nathen.service.company.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;


/*
    //���Է���json����
    @RequestMapping("/list")
    @ResponseBody //����json ,�����첽
    public List<Company> companyList() {
        List<Company> list = companyService.findAll();
        return list;
    }
*/

    /**
     * �鿴������ҵ
     * @param request
     * @return
     */
    @RequestMapping("/list")
    public String list(HttpServletRequest request) {
        List<Company> companyList = companyService.findAll();
        request.setAttribute("companyList", companyList);
        return "company/company-list";
    }


    /*
    ������������ת�����Ĳ��裺
    1. �Զ���һ����ʵ��Converter�ӿ�
    2. ʵ�ֽӿڣ����ַ���ת��ΪDate����
    3. �����Զ�������ת�����Ķ���
    4. ���Զ�������ת��������ת��������
    5. �ٰ�����ת������������ע������ȥ����
    */
    //�������� http://localhost:8080/company/save.do?birthday=2020-12-19
    @RequestMapping("/save")
    public String save(Date birthday) {
        //System.out.println(1/0); //�����Զ����쳣

        System.out.println("����Ϊ==>"+ birthday);
        return "success";
    }



}
