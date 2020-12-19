package cn.nathen.dao.company;

import cn.nathen.domain.company.Company;

import java.util.List;

public interface CompanyDao {

    //查询全部企业用户
    List<Company> findAll();
}
