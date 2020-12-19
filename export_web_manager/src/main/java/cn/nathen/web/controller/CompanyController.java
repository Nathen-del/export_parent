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
    //测试返回json数据
    @RequestMapping("/list")
    @ResponseBody //返回json ,用于异步
    public List<Company> companyList() {
        List<Company> list = companyService.findAll();
        return list;
    }
*/

    /**
     * 查看所有企业
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
    定义日期类型转换器的步骤：
    1. 自定义一个类实现Converter接口
    2. 实现接口，把字符串转换为Date类型
    3. 创建自定义类型转换器的对象
    4. 把自定义类型转换器交给转换器工厂
    5. 再把类型转换器工厂交给注解驱动去启动
    */
    //测试日期 http://localhost:8080/company/save.do?birthday=2020-12-19
    @RequestMapping("/save")
    public String save(Date birthday) {
        //System.out.println(1/0); //测试自定义异常

        System.out.println("生日为==>"+ birthday);
        return "success";
    }



}
