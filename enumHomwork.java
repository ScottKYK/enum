public class enumHomwork {
    //周一到周日 用enum類別輸出
    public static void main(String[] args) {
        WeekTradition Monday = new WeekTradition("周一");
        WeekTradition Thuesday = new WeekTradition("周二");
        //傳統方法建立一周的輸出 , 會加入一個沒有的一天 , Ex : 周八
        //所以可以使用enum
        WeekTradition Eightday = new WeekTradition("周八");
        System.out.println(Monday);
        System.out.println(Thuesday);
        System.out.println(Eightday);


        // enum 中的 values() . 可以將各個信息輸入到矩陣內
        // 再利用for 輸出,並且Week.values()[i] 後面默認使用toString()
        System.out.println("===========常用for表示法============");
        for (int i = 0; i < Week.values().length; i++) {
            System.out.println(Week.values()[i]);
        }
        System.out.println("===========另一種for表示法==========");
        //把Week.values()中每個物件 賦予給week 並且輸出
        for(Week week : Week.values()){
            System.out.println(week);
        }
    }
}

//普通類別 可以透過Constructor / set()方法添加
class WeekTradition{
    private String weekDay;

    public WeekTradition(String weekDay) {
        this.weekDay = weekDay;
    }

    public String getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(String weekDay) {
        this.weekDay = weekDay;
    }

    @Override
    public String toString() {
        return this.weekDay;
    }
}

//enum 可以將固定的信息輸入 並且不會被更改
/*
tips : enum 不能被繼承 用JAD反編譯可以知道 final class Week extends java.lang.Enum{
public static final Week MONDAY = new Week("周一")
}
等同於 MONDAY("周一")
 */

enum Week{
    MONDAY("周一"),THUESDAY("周二"),WEDNESDAY("周三"),THURSDAY("周四"),
    FRIDAY("周五"),SATURDAY("周六"),SUNDAY("周日");
    private String weekDay;

    Week(String weekDay) {
        this.weekDay = weekDay;
    }

    /*
    enum 類別中的 toString() 返回值為名稱 this.name
    和Object 類別的 toString() 不同
    public String toString() {
        return this.name;
    }
     */
    @Override
    public String toString() {
        return weekDay ;
    }
}
