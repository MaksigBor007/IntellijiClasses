package com.syntax.class21;

 class Main {

     String label;
     double price;
     String category;
     boolean hasExpiration;
     int stock;

     Main(String label, double price, String category, boolean hasExpiration, int stock) {
         this.label = label;
         this.price = price;
         this.category = category;
         this.hasExpiration = hasExpiration;
         this.stock = stock;
     }

        Main(String label, double price, int stock) {
         this.label = label;
         this.price = price;
            category = "misc";
            hasExpiration = false;
            this.stock = stock;
     }

     Main(String label, double price) {

         this.label = label;
         this.price = price;
         stock = 0;
     }

 }
     class StoreProduct  extends Main{


         StoreProduct(String label, double price, String category, boolean hasExpiration, int stock) {
             super(label, price, category, hasExpiration, stock);
         }

         String methodDisplay() {
             return label + " " + price + " " + category + " " + hasExpiration + " " + stock;
         }


         public static void main(String[] args) {
             StoreProduct sp = new StoreProduct("Eggs", 3.0, "Produce", true, 10);
             System.out.println(sp.methodDisplay());
             StoreProduct sp2=new StoreProduct("Paper Towel",3.0,"misc",false,24);
             System.out.println(sp2.methodDisplay());
             StoreProduct sp3 = new StoreProduct("Paper Towel",2.0,null,false,0);
             System.out.println(sp3.methodDisplay());
         }

     }



