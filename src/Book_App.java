import java.util.ArrayList;

public class Book_App {
    private static  String title;
    private static String author;
    private static String description;
    private static Double price;
    private static Boolean isInStock;
    static ArrayList<String> titlee=new ArrayList<>();
    static ArrayList<String> authorr=new ArrayList<>();
    static ArrayList<String> descriptionn=new ArrayList<>();
    static ArrayList<Double> pricee=new ArrayList<>();
    static ArrayList<Boolean>isInStockk=new ArrayList<>();
   Book_App(){
    this.title="";
    this.author="";
    this.description="";
    this.price=0.0;
    this.isInStock=false;
   }
   Book_App(String title,String author,String description,Double price,Boolean isInStock){
       this.title=title;
       this.author=author;
       this.description=description;
       this.price=price;
       this.isInStock=isInStock;
   }
   public String getTitle(){
       return title;
   }
   public void setTitle(String title){
       this.title=title;
   }
   public String getAuthor(){
       return author;
   }
   public void setAuthor(String author){
       this.author=author;
   }
   public String getDescription(){
       return description;
   }
   public void setDescription(String description){
       this.description=description;
   }
   public Double getPrice(){
       return price;
   }
   public void setPrice(Double price){
       this.price=price;
   }

    public Boolean getIsInStock() {
        return isInStock;

    }
    public void setIsInStock(Boolean isInStock){
       this.isInStock=isInStock;
    }

    public ArrayList<String> getTitlee() {
        return titlee;
    }
    public ArrayList<String> getAuthorr(){
       return authorr;
    }

    public ArrayList<String> getDescriptionn(){
       return descriptionn;
    }
    public ArrayList<Double> getPricee(){
       return pricee;
    }
    public ArrayList<Boolean> getIsInStockk(){
       return isInStockk;
    }
    public void setTitlee(ArrayList<String> titlee) {
        this.titlee = titlee;
    }
    public void setAuthorr(ArrayList<String> authorr){
       this.authorr=authorr;
    }
    public void setDescriptionn(ArrayList<String> descriptionn){
       this.descriptionn=descriptionn;
    }
    public void setPricee(ArrayList<Double> pricee){
       this.pricee=pricee;
    }
    public void setIsInStockk(ArrayList<Boolean> inStockk){
       this.isInStockk=isInStockk;
    }

    public void  getDispaly(){

       System.out.println("Title: "+getTitle());
       System.out.println("Author: "+getAuthor());
       System.out.println("Description: "+getDescription());
       System.out.println("Price: "+getPrice());
       System.out.println("InStock: "+getIsInStock());
   }
}
