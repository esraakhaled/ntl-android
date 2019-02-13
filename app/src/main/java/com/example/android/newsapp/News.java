package com.example.android.newsapp;

public class News  {
    /**title of the article*/
    private String mTitle;
    /**name of the section*/
    private String mName;
    /** Website URL of the news */
    private String mUrl;
    private String mContributor;
    private String mDate;
   /** constructs a new {@link News } object.
     * @param title is the title of article
     * @param name is the name  of the section
     * @param url is the website URL to find more details about the article
     */


    public News(String title,String name,String url,String contributor,String date){
        mTitle = title;
        mName = name;
        mUrl = url;
        mContributor = contributor;
        mDate = date;
    }
    /** returns the title of the article */
    public String getmTitle(){
        return mTitle;
    }
    /** returns the name of the section */
    public String getmName(){
        return mName;
    }
    /** Returns the website URL to find more information about the article.*/
    public String getmUrl(){
        return mUrl;
    }
    public String getmContributor(){
        return mContributor;
    }
    public String getmDate(){ return mDate;}
}
