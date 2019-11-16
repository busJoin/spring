package d.bean;

public class Person {
    private String homeAddr;
    private String companyAddrId;

    public void setCompanyAddrId(String companyAddrId) {
        this.companyAddrId = companyAddrId;
    }

    public void setHomeAddr(String homeAddr) {
        this.homeAddr = homeAddr;
    }

    public String getCompanyAddrId() {
        return companyAddrId;
    }

    public String getHomeAddr() {
        return homeAddr;
    }
}
