package cn.nathen.domain.company;


import java.util.Date;

//��ҵʵ����
public class Company {

    /**
     * ����Ψһ��ǣ���Ӧ���ݿ�����
     */
    private String id;
    /**
     * ��˾����
     */
    private String name;

    /**
     * ����ʱ��
     */
    private Date expirationDate;

    /**
     * ��˾��ַ
     */
    private String address;
    /**
     * Ӫҵִ��
     */
    private String licenseId;
    /**
     * ���˴���
     */
    private String representative;
    /**
     * ��˾�绰
     */
    private String phone;
    /**
     * ��˾��ģ
     */
    private String companySize;
    /**
     * ������ҵ
     */
    private String industry;
    /**
     * ��ע
     */
    private String remarks;

    /**
     * ״̬
     */
    private Integer state;
    /**
     * ��ǰ���
     */
    private Double balance;
    /**
     * ����ʱ��
     */
    private Date createTime;

    /**
     * ����
     */
    private String city;


    public Company() {
    }

    public Company(String id, String name, Date expirationDate, String address, String licenseId, String representative, String phone, String companySize, String industry, String remarks, Integer state, Double balance, Date createTime, String city) {
        this.id = id;
        this.name = name;
        this.expirationDate = expirationDate;
        this.address = address;
        this.licenseId = licenseId;
        this.representative = representative;
        this.phone = phone;
        this.companySize = companySize;
        this.industry = industry;
        this.remarks = remarks;
        this.state = state;
        this.balance = balance;
        this.createTime = createTime;
        this.city = city;
    }

    /**
     * ��ȡ
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * ����
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * ��ȡ
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * ����
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * ��ȡ
     * @return expirationDate
     */
    public Date getExpirationDate() {
        return expirationDate;
    }

    /**
     * ����
     * @param expirationDate
     */
    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * ��ȡ
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * ����
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * ��ȡ
     * @return licenseId
     */
    public String getLicenseId() {
        return licenseId;
    }

    /**
     * ����
     * @param licenseId
     */
    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    /**
     * ��ȡ
     * @return representative
     */
    public String getRepresentative() {
        return representative;
    }

    /**
     * ����
     * @param representative
     */
    public void setRepresentative(String representative) {
        this.representative = representative;
    }

    /**
     * ��ȡ
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * ����
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * ��ȡ
     * @return companySize
     */
    public String getCompanySize() {
        return companySize;
    }

    /**
     * ����
     * @param companySize
     */
    public void setCompanySize(String companySize) {
        this.companySize = companySize;
    }

    /**
     * ��ȡ
     * @return industry
     */
    public String getIndustry() {
        return industry;
    }

    /**
     * ����
     * @param industry
     */
    public void setIndustry(String industry) {
        this.industry = industry;
    }

    /**
     * ��ȡ
     * @return remarks
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * ����
     * @param remarks
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * ��ȡ
     * @return state
     */
    public Integer getState() {
        return state;
    }

    /**
     * ����
     * @param state
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * ��ȡ
     * @return balance
     */
    public Double getBalance() {
        return balance;
    }

    /**
     * ����
     * @param balance
     */
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    /**
     * ��ȡ
     * @return createTime
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * ����
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * ��ȡ
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * ����
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    public String toString() {
        return "Company{id = " + id + ", name = " + name + ", expirationDate = " + expirationDate + ", address = " + address + ", licenseId = " + licenseId + ", representative = " + representative + ", phone = " + phone + ", companySize = " + companySize + ", industry = " + industry + ", remarks = " + remarks + ", state = " + state + ", balance = " + balance + ", createTime = " + createTime + ", city = " + city + "}";
    }
}
