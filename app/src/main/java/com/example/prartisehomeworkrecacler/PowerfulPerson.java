package com.example.prartisehomeworkrecacler;

public class PowerfulPerson {
   private String name;
   private String bithDate;
   private int imageResours;

   public PowerfulPerson(String name, String bithDate, int imageResours) {
      this.name = name;
      this.bithDate = bithDate;
      this.imageResours = imageResours;
   }

   public String getName() {
      return name;
   }

   public String getBithDate() {
      return bithDate;
   }

   public int getImageResours() {
      return imageResours;
   }

   public void setImageResours(int imageResours) {
      this.imageResours = imageResours;
   }
}
