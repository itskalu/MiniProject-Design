package model;


public class LP
{   
    private String title;
    private String artist;
    private String barcode;
    private String publicationDate;
    private String description;
    
    public LP(String title, String artist, String barcode, String publicationDate, String description)
    {
        this.title = title;
        this.artist = artist;
        this.barcode = barcode;
        this.publicationDate = publicationDate;
        this.description = description;
       
    }

    public String getTitle(){
        return title;
    }
   
    public String getArtist(){
        return artist;
    }
    
    public String getPublicationDate(){
        return publicationDate;
    }
    
}
