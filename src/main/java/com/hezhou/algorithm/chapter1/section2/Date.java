package com.hezhou.algorithm.chapter1.section2;

public class Date {
    private final int year;
    private final int month;
    private final int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    @Override
    public String toString() {
        return getYear() + "/" + getMonth() + "/" + getDay();
    }

    /**
     * 1. 如果该对象的引用和参数对象的引用相同，返回 true。成立时可以免去其他所有判断。
     * 2. 如果参数为空，则返回 false（还可以避免在下面的代码中使用空引用）。
     * 3. 如果两个对象的类不同，返回 false。
     * 4. 将参数对象的类型从 Object 转换到 Date，因为前面的判断通过，所以可以转换。
     * 5. 如果任意实例变量的值不相同，返回 false。
     *
     * @param obj xxx
     * @return true or false
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // 1
        if (obj == null) return false; // 2
        if (this.getClass() != obj.getClass()) return false; // 3
        Date that = (Date) obj; // 4
        if (this.year != that.year) return false; // 5
        if (this.month != that.month) return false; // 5
        if (this.day != that.day) return false; // 5
        return true;
    }

//    // 编辑器生成
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Date date = (Date) o;
//
//        if (year != date.year) return false;
//        if (month != date.month) return false;
//        return day == date.day;
//    }
}
