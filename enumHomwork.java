public class enumHomwork {
    //周一到周日 用enum類別輸出
    public static void main(String[] args) {
        // enum 中的 values() . 可以將各個信息輸入到矩陣內
        // 再利用for 輸出,並且Week.values()[i] 後面默認使用toString()
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
//enum 可以將固定的信息輸入 並且不會被更改
enum Week{
    MONDAY("周一"),THUESDAY("周二"),WEDNESDAY("周三"),THURSDAY("周四"),
    FRIDAY("周五"),SATURDAY("周六"),SUNDAY("周日");

    private String weekDay;

    Week(String weekDay) {
        this.weekDay = weekDay;
    }

    @Override
    public String toString() {
        return weekDay ;
    }
}
