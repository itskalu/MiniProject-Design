package model;


public class LP
{
    private String barcode;
    private String title;
    private String artist;
    private String publicationDate;
    private String description;
    
    public LP(String barcode, String title, String artist, String publicationDate, String description)
    {
        this.barcode = barcode;
        this.title = title;
        this.artist = artist;
        this.publicationDate = publicationDate;
        this.description = description;
       
    }

    public String getTitle(){
        return title;
    }
   
}
