/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author karn
 */
import java.util.ArrayList;
public class IconCineconic {
    public static void main(String[] args) {
    // สร้างโรงภาพยนตร์ 3 โรง
    Cinema c1=new Cinema("Cinema", 250);
    Cinema c2=new Cinema("IMAX", 350);
    Cinema c3=new Cinema("4DX", 450);
    // จงเติมคําสั่งสร้าง array list ชื่อ cardAL ให้เก็บ object ของ MGenCard
    ArrayList<MGenCard> cardAL = new ArrayList<>();
    cardAL.add(new MGenCard("Sasipa"));
    cardAL.add(new MGenFirstClass("Monnat"));
    cardAL.add(new MGenStudent("Mike"));
    //จงเติมคําสั่งเพื่อสั่งพิมพ์แสดงค่าของ memberFee ของ MGenStudent
    System.out.println(MGenCard.memberFee);
    // ครูใส่บรรทัด พิมพ์ว่า Test run : ให้ เพื่อบอกสถานการณ์ของการรันแต่ละอัน
    System.out.println("Test run :Sasipa buys ticket(s) at cinema");
    cardAL.get(0).buyTicket(c1, 2);
    
    System.out.println("Test run : Sasipa buys ticket(s) at 4DX");
    cardAL.get(0).buyTicket(c3, 2);
    
    System.out.println("Test run : Monnat buys ticket(s) at IMAX");
    cardAL.get(1).buyTicket(c2, 2);
    
    System.out.println("Test run : Monnat buys ticket(s) at 4DX");
    cardAL.get(1).buyTicket(c3, 4);
    
    System.out.println("Test run : Mike buy ticket(s) at cinema");
    cardAL.get(2).buyTicket(c1, 2);
    
    System.out.println("Test run : Monnat get 2 free ticket");
    MGenFirstClass get = (MGenFirstClass) cardAL.get(1);
    get.getFreeTicket();
    
    System.out.println("Test run : Call usePoint() of every object in the array list");
    for (MGenCard eachObj : cardAL) {
        eachObj.usePoint();
    }
    }
}
