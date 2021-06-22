
package daythree.models;

import java.util.ArrayList;

public class Company {
    private String companyCode;
    private String name;
    private String logoURL;
    private ArrayList<Brand> brands;
    private Employee manager;
    private ArrayList<Employee> board;
    private static Company instance;
    
    private Company(){
        
    }
    
    public Company getInstance(){
        if(instance == null){
            instance = new Company();
        }
        return instance;
    }
    
    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogoURL() {
        return logoURL;
    }

    public void setLogoURL(String logoURL) {
        this.logoURL = logoURL;
    }

    public ArrayList<Brand> getBrands() {
        return brands;
    }

    public void setBrands(ArrayList<Brand> brands) {
        this.brands = brands;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public ArrayList<Employee> getBoard() {
        return board;
    }

    public void setBoard(ArrayList<Employee> board) {
        this.board = board;
    }
    
    
    
}
