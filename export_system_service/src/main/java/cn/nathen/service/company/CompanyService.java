package cn.nathen.service.company;

import cn.nathen.domain.company.Company;

import java.util.List;

public interface CompanyService {

    /**
     * ��ѯȫ���û�
     * @return
     */
    List<Company> findAll();
}
