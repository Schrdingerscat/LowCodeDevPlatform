package com.dna;

import java.util.*;


/*
* Vd是一个bean类
* 用来标识元数据模型中的一个类的某个属性
* */
public class Vd implements Cloneable{
    private String vdCode;
    private String vdName;
    private String vdDescription;
    /*
    * vdCode,vdName,vdDescription用于描述数据结构
    * */
    private int serNo;//用于排序的序号
    private String dataType;
    private String mdCode; //主数据代码
    private String vdControl = null;
    private Date lastTime;//最近更新时间

    /*private VdExtension extension = null;*/

    public void setVdCode(String vdCode) {
        this.vdCode = vdCode;
    }

    public void setVdName(String vdName) {
        this.vdName = vdName;
    }

    public void setVdDescription(String vdDescription) {
        this.vdDescription = vdDescription;
    }

    public void setSerNo(int serNo) {
        this.serNo = serNo;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public void setMdCode(String mdCode) {
        this.mdCode = mdCode;
    }

    public void setVdControl(String vdControl) {
        this.vdControl = vdControl;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

/*    public void setExtension(VdExtension extension) {
        this.extension = extension;
    }*/


    public String getVdCode() {
        return vdCode;
    }

    public String getVdName() {
        return vdName;
    }

    public String getVdDescription() {
        return vdDescription;
    }

    public int getSerNo() {
        return serNo;
    }

    public String getDataType() {
        return dataType;
    }

    public String getMdCode() {
        return mdCode;
    }

    public String getVdControl() {
        return vdControl;
    }

    public Date getLastTime() {
        return lastTime;
    }

/*    public VdExtension getExtension() {
        return extension;
    }*/
    public Vd(String vdName,String vdDescription,String dataType){
        this.vdName = vdName;
        this.vdDescription = vdDescription;
        this.dataType = dataType;
    }



}
