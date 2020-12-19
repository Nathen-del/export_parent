package cn.nathen.service.company;

import cn.nathen.domain.company.Company;

import java.util.List;

public interface CompanyService {

    /**
     * 查询全部用户
     * @return
     */
    List<Company> findAll();
}
