package cn.nathen.dao.company;

import cn.nathen.domain.company.Company;

import java.util.List;

public interface CompanyDao {

    //��ѯȫ����ҵ�û�
    List<Company> findAll();
}
