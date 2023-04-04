package org.example;

public enum Season {
    SPRING("Spring", 3, 5),
    SUMMER("Summer", 6, 8),
    FALL("Fall", 9, 11),
    WINTER("Winter", 12, 2)
    ;

    private String name;
    private int startMonth;
    private int endMonth;

    Season(String name, int startMonth, int endMonth) {
        this.name = name;
        this.startMonth = startMonth;
        this.endMonth = endMonth;
    }

    public String getName() {
        return name;
    }

    public int getStartMonth() {
        return startMonth;
    }

    public int getEndMonth() {
        return endMonth;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", startMonth=" + startMonth +
                ", endMonth=" + endMonth +
                '}';
    }

    public static void main(String[] args) {
//        System.out.println(Season.SPRING.toString());
        for (Season season : Season.values()) {
            System.out.printf("%s: starts in month %d, ends in month %d\n", season.getName(), season.getStartMonth(), season.getEndMonth());
        }
    }
}