package com.RAE411.SBHomework.bucket;

public enum BucketName{
    
    PROFILE_IMAGE("rae411pict");

    private final String bucketName;

    BucketName(String bucketName){
        this.bucketName = bucketName;
    }
    
    public String getBucketName(){
        return bucketName;
    }
}