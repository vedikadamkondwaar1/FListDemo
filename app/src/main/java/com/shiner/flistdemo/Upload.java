package com.shiner.flistdemo;

public class Upload {
    private String mName,mPrice,mDesc;
    private String mImageUrl;
    public Upload(){}


    public Upload(String name, String price, String desc, String imageUrl) {

        if (name.trim().equals("")){
            name = "No Name";
        }

        if(price.trim().equals("")){
            price = "no price";
        }

        if(desc.trim().equals("")){
            desc = "no desc";
        }

        mName = name;
        mPrice = price;
        mDesc = desc;
        mImageUrl = imageUrl;


    }

    public String getmName(){return mName;}
    public void setmName(String name){mName=name;}

    public  String getmPrice(){return mPrice;}
    public void setmPrice(String price){mPrice=price;}

    public  String getmDesc(){return mDesc;}
    public void setmDesc(String desc){mDesc=desc;}


    public String getmImageUrl(){return mImageUrl;}
    public void setmImageUrl(String imageUrl){mImageUrl=imageUrl;}







}
