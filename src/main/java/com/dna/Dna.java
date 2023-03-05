package com.dna;
import java.util.*;
public class Dna{
    private long id;
    private String businessType;
    private String dnaCode;
    private int serNo;

    private Dna parent;
    private String category;
    private String secondCategory;
    private String dbMapCode;
    private String dnaDescription;
    private String dnaName;
    private int minCount;
    private int maxCount;
    private boolean cursive = false;
    private List<Dna> children = new ArrayList<Dna> ();
    private List<Vd> vds = new ArrayList<Vd> ();
    private Date lastTime;

    public Dna(String businessType,String dnaCode,String dnaName,String dnaDescription){
        this.businessType = businessType;
        this.dnaCode= dnaCode;
        this.dnaName = dnaName;
        this.dnaDescription = dnaDescription;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getDnaCode() {
        return dnaCode;
    }

    public void setDnaCode(String dnaCode) {
        this.dnaCode = dnaCode;
    }

    public int getSerNo() {
        return serNo;
    }

    public void setSerNo(int serNo) {
        this.serNo = serNo;
    }

    public Dna getParent() {
        return parent;
    }

    public void setParent(Dna parent) {
        this.parent = parent;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSecondCategory() {
        return secondCategory;
    }

    public void setSecondCategory(String secondCategory) {
        this.secondCategory = secondCategory;
    }

    public String getDbMapCode() {
        return dbMapCode;
    }

    public void setDbMapCode(String dbMapCode) {
        this.dbMapCode = dbMapCode;
    }

    public String getDnaDescription() {
        return dnaDescription;
    }

    public void setDnaDescription(String dnaDescription) {
        this.dnaDescription = dnaDescription;
    }

    public String getDnaName() {
        return dnaName;
    }

    public void setDnaName(String dnaName) {
        this.dnaName = dnaName;
    }

    public int getMinCount() {
        return minCount;
    }

    public void setMinCount(int minCount) {
        this.minCount = minCount;
    }

    public int getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(int maxCount) {
        this.maxCount = maxCount;
    }

    public boolean isCursive() {
        return cursive;
    }

    public void setCursive(boolean cursive) {
        this.cursive = cursive;
    }

    public List<Dna> getChildren() {
        return children;
    }

    public void setChildren(List<Dna> children) {
        this.children = children;
    }

    public List<Vd> getVds() {
        return vds;
    }

    public void setVds(List<Vd> vds) {
        this.vds = vds;
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }
}