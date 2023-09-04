/**
 * homework
 *
 * @author GnilNay
 * @data 2023/9/4
 */
public class Eggy {

    {
        System.out.println("我出生了");
    }

    static {
        System.out.println("来到蛋仔世界");
    }

    @Override
    public String toString() {
        return name + "蛋仔，现在" + level + "级";
    }

    private String name;
    private Integer level;

    public static void main(String[] args) {
        // 要求不改动main的情况下输出
        // 来到蛋仔世界
        //我是
        //我出生了
        //小蔡蛋仔，现在30级
        System.out.println("我是");
        System.out.println(new Eggy("小蔡", 30));
    }

    public Eggy() {
    }

    public Eggy(String name, Integer level) {
        this.name = name;
        this.level = level;

    }



}
