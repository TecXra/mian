package com.example.fasigujar.copyproject.Models;

/**
 * Created by Mian Mohsin on 10/10/2016.
 */
public class menu_Items {
    private int Id,MenuCatId,AvatarId;
    private String Name,ImageUrl,FilePath;

    public void setName(String Name)
    {
        this.Name=Name;
    }

    public String getName(){
        return Name;
    }
    public void setImageUrl(String ImgUrl)
    {
        this.ImageUrl=ImgUrl;
    }
    public  String getImageUrl()
    {
        return  ImageUrl;
    }
    public void setFilePath(String FilePath)
    {
        this.FilePath=FilePath;
    }
    public  String getFilePath()
    {
        return  FilePath;
    }
    public void setId(int Id){
         this.Id=Id;
    }
    public int getId()
    {
        return Id;
    }
    public void setMenuCatId(int MenuCatId)
    {
        this.MenuCatId=MenuCatId;
    }
    public int getMenuCatId()
    {
        return MenuCatId;
    }
    public void setAvatarId(int AvatarId)
    {
        this.AvatarId=AvatarId;
    }
    public int getAvatarId()
    {
        return AvatarId;
    }
}
